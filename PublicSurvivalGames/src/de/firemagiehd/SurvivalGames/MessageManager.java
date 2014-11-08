package de.firemagiehd.SurvivalGames;

import org.bukkit.ChatColor;


public class MessageManager {
	
	public enum MessageType {
		INFO(ChatColor.GRAY),
		GOOD(ChatColor.GREEN),
		BAD(ChatColor.RED);
		
		private ChatColor color;
		
		MessageType(ChatColor color) {
			this.color = color;
		}
		public ChatColor getColor() {
			return color;
		}
		
	}
	
	private static MessageManager instance = new MessageManager();
	
	public static MessageManager getInstance() {
		return instance;
	}
	
	private String prefix = ChatColor.GRAY + "[" + ChatColor.GOLD + "" + ChatColor.GRAY + "] " + ChatColor.RESET;

}
