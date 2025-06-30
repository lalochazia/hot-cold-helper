package com.hotcoldhelper;

import javax.swing.plaf.basic.BasicCheckBoxUI;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.PluginPanel;
import javax.inject.Inject;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Comparator;
import net.runelite.api.coords.WorldPoint;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.DynamicGridLayout;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


@Slf4j
public class HotColdHelperPanel extends PluginPanel {
	private final HotColdHelperPlugin plugin;
	private final HotColdHelperConfig config;
	private JPanel teleportListPanel;
	private JScrollPane scrollableContainer;

	private static final Color BACKGROUND_COLOR = ColorScheme.DARK_GRAY_COLOR;
	private static final Color SECTION_BACKGROUND_COLOR = ColorScheme.DARKER_GRAY_COLOR;
	private static final Color ITEM_BACKGROUND_COLOR = ColorScheme.DARKER_GRAY_COLOR;
	private static final Color ITEM_HOVER_COLOR = ColorScheme.DARK_GRAY_HOVER_COLOR;
	private static final Color TITLE_COLOR = Color.WHITE;
	private static final Color TEXT_COLOR = Color.WHITE;
	private static final Color BORDER_COLOR = ColorScheme.MEDIUM_GRAY_COLOR;

	@Inject
	public HotColdHelperPanel(HotColdHelperPlugin plugin, HotColdHelperConfig config) {
		super(false);

		this.plugin = plugin;
		this.config = config;
		setLayout(new BorderLayout());

		UIManager.put("CheckBox.icon", UIManager.getIcon("CheckBox.icon"));
		UIManager.put("CheckBox.foreground", Color.WHITE);
		UIManager.put("CheckBox.background", SECTION_BACKGROUND_COLOR);

		teleportListPanel = new JPanel();
		teleportListPanel.setLayout(new BoxLayout(teleportListPanel, BoxLayout.Y_AXIS));
		teleportListPanel.setBackground(BACKGROUND_COLOR);

		scrollableContainer = new JScrollPane(teleportListPanel);
		scrollableContainer.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollableContainer.setBorder(null);
		add(scrollableContainer, BorderLayout.CENTER);

		populateTeleportsList();
	}

	private void populateTeleportsList() {
		teleportListPanel.removeAll();

		Map<String, List<HotColdTeleports>> teleportsByType = new HashMap<>();
		for (HotColdTeleports teleport : HotColdTeleports.values()) {
			teleportsByType.computeIfAbsent(teleport.getTeleportType(), k -> new ArrayList<>()).add(teleport);
		}

		for (Map.Entry<String, List<HotColdTeleports>> entry : teleportsByType.entrySet()) {
			String teleportType = entry.getKey();
			List<HotColdTeleports> teleports = entry.getValue();

			JPanel sectionPanel = new JPanel();
			sectionPanel.setLayout(new BorderLayout());
			sectionPanel.setBackground(SECTION_BACKGROUND_COLOR);

			JPanel headerPanel = new JPanel();
			headerPanel.setBackground(SECTION_BACKGROUND_COLOR);
			headerPanel.setLayout(new BorderLayout());
			headerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

			JPanel headerContentPanel = new JPanel();
			headerContentPanel.setLayout(new BorderLayout());
			headerContentPanel.setBackground(SECTION_BACKGROUND_COLOR);

			ToggleButton masterToggle = new ToggleButton(true);
			masterToggle.setSelected(true);
			masterToggle.setBackground(SECTION_BACKGROUND_COLOR);
			headerContentPanel.add(masterToggle, BorderLayout.WEST);

			JPanel titlePanel = new JPanel(new BorderLayout(5, 0));
			titlePanel.setBackground(SECTION_BACKGROUND_COLOR);

			JLabel sectionLabel = new JLabel(teleportType);
			sectionLabel.setForeground(TEXT_COLOR);
			sectionLabel.setFont(FontManager.getRunescapeFont());
			titlePanel.add(sectionLabel, BorderLayout.CENTER);
			JLabel collapseLabel = new JLabel("Expand");
			collapseLabel.setForeground(new Color(140, 140, 140));
			collapseLabel.setFont(new Font(collapseLabel.getFont().getName(), Font.PLAIN, 10));
			titlePanel.add(collapseLabel, BorderLayout.EAST);

			headerContentPanel.add(titlePanel, BorderLayout.CENTER);
			headerPanel.add(headerContentPanel, BorderLayout.CENTER);


			JPanel contentPanel = new JPanel();
			contentPanel.setLayout(new DynamicGridLayout(0, 1, 0, 0));
			contentPanel.setBackground(SECTION_BACKGROUND_COLOR);
			contentPanel.setBorder(new EmptyBorder(0, 5, 0, 5));
			contentPanel.setVisible(false);
			List<ToggleButton> childToggles = new ArrayList<>();


			for (HotColdTeleports teleport : teleports) {
				JPanel teleportPanel = createTeleportPanel(teleport, childToggles);
				contentPanel.add(teleportPanel);
			}

			for (ToggleButton toggle : childToggles) {
				toggle.setSelected(true);
			}

			masterToggle.addActionListener(e -> {
				boolean selected = masterToggle.isSelected();
				for (ToggleButton toggle : childToggles) {
					toggle.setSelected(selected);
				}
				updateTeleportStates(teleportType, selected);
			});

			for (ToggleButton childToggle : childToggles) {
				childToggle.addActionListener(e -> {
					updateMasterToggleState(masterToggle, childToggles);
				});
			}

			headerPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			headerPanel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					boolean isVisible = contentPanel.isVisible();
					contentPanel.setVisible(!isVisible);
					collapseLabel.setText(isVisible ? "Expand" : "Collapse");
					teleportListPanel.revalidate();
					teleportListPanel.repaint();
				}
			});

			sectionPanel.add(headerPanel, BorderLayout.NORTH);
			sectionPanel.add(contentPanel, BorderLayout.CENTER);
			teleportListPanel.add(sectionPanel);
			teleportListPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		}

		teleportListPanel.revalidate();
		teleportListPanel.repaint();
	}


	private void updateMasterToggleState(ToggleButton masterToggle, List<ToggleButton> childToggles) {
		boolean allSelected = true;
		boolean anySelected = false;

		for (ToggleButton toggle : childToggles) {
			if (toggle.isSelected()) {
				anySelected = true;
			} else {
				allSelected = false;
			}
		}

		masterToggle.setSelected(allSelected);
	}


	private JPanel createTeleportPanel(HotColdTeleports teleport, List<ToggleButton> childToggles) {
		JPanel teleportPanel = new JPanel(new BorderLayout());
		teleportPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		teleportPanel.setBackground(ITEM_BACKGROUND_COLOR);
		ToggleButton teleportToggle = new ToggleButton();
		childToggles.add(teleportToggle);
		teleportPanel.add(teleportToggle, BorderLayout.WEST);
		String displayName = teleport.getName();
		JLabel nameLabel = new JLabel(displayName);
		nameLabel.setFont(FontManager.getRunescapeSmallFont());
		nameLabel.setForeground(TEXT_COLOR);
		WorldPoint location = teleport.getLocation();
		nameLabel.setToolTipText("Location: " + location.getX() + ", " + location.getY() + ", " + location.getPlane());
		teleportPanel.add(nameLabel, BorderLayout.CENTER);
		return teleportPanel;
	}


	private void styleCheckBox(JCheckBox checkbox) {
		checkbox.setForeground(Color.WHITE);
		checkbox.setBackground(SECTION_BACKGROUND_COLOR);
	}


	private void updateMasterCheckboxState(JCheckBox masterCheckbox, List<JCheckBox> childCheckboxes) {
		boolean allSelected = true;
		boolean anySelected = false;

		for (JCheckBox checkbox : childCheckboxes) {
			if (checkbox.isSelected()) {
				anySelected = true;
			} else {
				allSelected = false;
			}
		}

		masterCheckbox.setSelected(allSelected);

	}
	private void updateTeleportStates(String teleportType, boolean enabled) {
	}
	public void refresh() {
		SwingUtilities.invokeLater(this::populateTeleportsList);
	}
}