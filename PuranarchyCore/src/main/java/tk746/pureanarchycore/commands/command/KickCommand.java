package tk746.pureanarchycore.commands.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tk746.pureanarchycore.Main;

public class KickCommand implements CommandExecutor {

    private Main plugin;

    public KickCommand(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("dupe").setExecutor(this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only People can run This command.");
            return true;
        }
        Player plr = (Player) sender;

        if(plr.hasPermission("dupe.use")){
            plr.kickPlayer("No dupe here");
            return true;
        } else {
            plr.sendMessage("you dont have the right perms.");
        }

        return false;
    }
}
