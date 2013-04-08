package in.sudokraft.sudofeedme;

import java.util.logging.Logger;
import org.bukkit.event.EventPriority;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Euank
 */
public class SudoFeedme extends JavaPlugin {
    
    @Override
    public void onDisable() {
        this.getLogger().info("SudoFeedme has been disabled.");
    }
    
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FoodListener(), this);
        this.getLogger().info("SudoFeedme has been enabled.");
    }
    
}
