package rtc.listener;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import rtc.log.RaptorLogin;



public class RaptorLoginCommandListener implements CommandExecutor{

	public RaptorLoginCommandListener(RaptorLogin instance) {
		
	}

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(sender instanceof Player) {
			for(int i = 0; i<args.length; i++) {
			}
		}
		
		
		return false;
}

}