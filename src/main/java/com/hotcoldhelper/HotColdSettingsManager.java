package com.hotcoldhelper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class HotColdSettingsManager {
	private static final String CONFIG_GROUP = "hotcoldhelper";
	private static final String CUSTOM_NAMES_KEY = "customnames";

	private final ConfigManager configManager;
	private final Gson gson;

	@Inject
	public HotColdSettingsManager(ConfigManager configManager) {
		this.configManager = configManager;
		this.gson = new Gson();
	}

	public void saveCustomName(String teleportName, String customName) {
		Map<String, String> customNames = getCustomNames();
		if (customName == null || customName.trim().isEmpty()) {
			customNames.remove(teleportName);
		} else {
			customNames.put(teleportName, customName.trim());
		}
		configManager.setConfiguration(CONFIG_GROUP, CUSTOM_NAMES_KEY, gson.toJson(customNames));
	}

	public String getCustomName(String teleportName) {
		Map<String, String> customNames = getCustomNames();
		return customNames.getOrDefault(teleportName, teleportName);
	}

	private Map<String, String> getCustomNames() {
		String json = configManager.getConfiguration(CONFIG_GROUP, CUSTOM_NAMES_KEY);
		if (json == null || json.isEmpty()) {
			return new HashMap<>();
		}

		try {
			Type type = new TypeToken<HashMap<String, String>>(){}.getType();
			return gson.fromJson(json, type);
		} catch (Exception e) {
			return new HashMap<>();
		}
	}
}