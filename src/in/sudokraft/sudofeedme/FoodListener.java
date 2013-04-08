package in.sudokraft.sudofeedme;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

/**
 * @author Euank
 */
public class FoodListener implements Listener {
    
    @EventHandler(priority = EventPriority.LOW)
    public void onChange(FoodLevelChangeEvent ev) {
        if(ev.getFoodLevel() < 7) {
            ev.setFoodLevel(7);
	}
    }
   
}
