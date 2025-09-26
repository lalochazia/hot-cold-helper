/*
 * Copyright (c) 2025, Lalochazia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.hotcoldhelper;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

class HotColdItemHighlightOverlay extends WidgetItemOverlay
{
	private final ItemManager itemManager;
	private final HotColdHelperPlugin plugin;
	private static final Color HIGHLIGHT_COLOR = new Color(255, 90, 0, 255);

	@Inject
	private HotColdItemHighlightOverlay(ItemManager itemManager, HotColdHelperPlugin plugin)
	{
		this.itemManager = itemManager;
		this.plugin = plugin;
		showOnInventory();
	}

	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem widgetItem)
	{
		if (!plugin.isHotColdClueActive())
		{
			return;
		}

		int possibleLocations = plugin.getPossibleLocationsCount();
		if (possibleLocations <= 1)
		{
			return;
		}

		HotColdTeleports bestTeleport = plugin.getBestTeleport();
		if (bestTeleport == null)
		{
			return;
		}

		if (!matchesItemId(bestTeleport, itemId))
		{
			return;
		}

		Rectangle bounds = widgetItem.getCanvasBounds();
		final BufferedImage outline = itemManager.getItemOutline(itemId, widgetItem.getQuantity(), HIGHLIGHT_COLOR);
		graphics.drawImage(outline, (int) bounds.getX(), (int) bounds.getY(), null);
	}

	private boolean matchesItemId(HotColdTeleports teleport, int itemId)
	{
		int[] teleportItemIds = teleport.getItemIds();
		if (teleportItemIds == null || teleportItemIds.length == 0)
		{
			return false;
		}

		for (int teleportItemId : teleportItemIds)
		{
			if (teleportItemId == itemId)
			{
				return true;
			}
		}
		return false;
	}
}