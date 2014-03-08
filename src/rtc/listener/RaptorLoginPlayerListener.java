package rtc.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import rtc.log.RaptorLogin;



public class RaptorLoginPlayerListener implements Listener {
	
	public RaptorLoginPlayerListener(RaptorLogin iplugin) {
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerBefore(PlayerLoginEvent k){
		
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		
	}
}
