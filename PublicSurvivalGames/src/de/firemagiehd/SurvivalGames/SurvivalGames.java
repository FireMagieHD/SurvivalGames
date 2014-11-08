package de.firemagiehd.SurvivalGames;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class SurvivalGames {
	
	public File cfgfile = new File("plugins/SurvivalGames", "config.yml");
	public FileConfiguration config = YamlConfiguration.loadConfiguration(cfgfile);
	
	public File msgfile = new File("plugins/SurvivalGames", "config.yml");
	public FileConfiguration messages = YamlConfiguration.loadConfiguration(cfgfile);
	
	asdfasdfasdfawdf
	
	
	public void onEnable() {
		MessageManager.getInstance();
	}
}
