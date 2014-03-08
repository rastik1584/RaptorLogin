package rtc.log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.bukkit.entity.Player;

public class CommandLog {

	RaptorLogin plugin;
	BufferedWriter out;
	
	public CommandLog(RaptorLogin plugin) {
		this.plugin = plugin;
		Writer fstream = null;
		try {
			fstream = new FileWriter(plugin.CommandLog.getName(), true);
		} catch (IOException e) {}
		out = new BufferedWriter(fstream);
	}
	
	public void write(Player p, String command) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		
		if (command.equals("trol"))
			return;
		
		try {
			out.write(sdf.format(cal.getTime()) + " : " + p.getName() + " ---> " + command);
			out.newLine();
		} catch (IOException e) {}
	}
	
	public void close() {
		try {
			out.close();
		} catch (IOException e) {}
	}
}
