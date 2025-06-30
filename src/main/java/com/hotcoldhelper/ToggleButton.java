package com.hotcoldhelper;

import net.runelite.client.plugins.config.ConfigPlugin;
import net.runelite.client.util.ImageUtil;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ToggleButton extends JToggleButton {
	private static final ImageIcon ON_ICON;
	private static final ImageIcon OFF_ICON;
	private static final ImageIcon ON_ICON_LARGE;
	private static final ImageIcon OFF_ICON_LARGE;

	static {
		BufferedImage onImage = ImageUtil.loadImageResource(ConfigPlugin.class, "switcher_on.png");
		ON_ICON = new ImageIcon(onImage);
		OFF_ICON = new ImageIcon(ImageUtil.flipImage(
			ImageUtil.luminanceScale(
				ImageUtil.grayscaleImage(onImage),
				0.61f
			),
			true,
			false
		));

		// Create larger versions for headers
		ON_ICON_LARGE = new ImageIcon(onImage.getScaledInstance(30, 20, Image.SCALE_SMOOTH));
		BufferedImage offImage = ImageUtil.flipImage(
			ImageUtil.luminanceScale(
				ImageUtil.grayscaleImage(onImage),
				0.61f
			),
			true,
			false
		);
		OFF_ICON_LARGE = new ImageIcon(offImage.getScaledInstance(30, 20, Image.SCALE_SMOOTH));
	}

	public ToggleButton(boolean isHeader) {
		super(isHeader ? OFF_ICON_LARGE : OFF_ICON);
		setSelectedIcon(isHeader ? ON_ICON_LARGE : ON_ICON);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusPainted(false);
		setPreferredSize(new Dimension(isHeader ? 30 : 25, 0));
	}

	// Default constructor for sub-items
	public ToggleButton() {
		this(false);
	}
}
