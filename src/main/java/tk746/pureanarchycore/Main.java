package tk746.pureanarchycore;

import org.bukkit.plugin.java.JavaPlugin;
import tk746.pureanarchycore.commands.HelpCommand;
import tk746.pureanarchycore.commands.KickCommand;

public final class Main extends JavaPlugin {
    // KRYMZ0N WUZ HERE LOL

    @Override
    public void onEnable() {
        //config
        saveDefaultConfig();
        //commands
        new KickCommand(this);
        new HelpCommand(this);
        //Listeners

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
