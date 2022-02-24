package tk746.pureanarchycore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tk746.pureanarchycore.Main;

import java.util.List;

public class HelpCommand implements CommandExecutor {
    private final Main plugin; // Making final

    public HelpCommand(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("help").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        List<String> list = plugin.getConfig().getStringList("help_list.list");
        String join = String.join("\n", list);
        return false;
    }
}
