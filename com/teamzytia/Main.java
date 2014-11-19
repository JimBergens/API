import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin { 
  
  private static Plugin instance;

  @Override
  public void onEnable() {
    instance = this;
  }

  @Override
  public void onDisable() {
    instance = null;
  }
  
  /**
  * @return The Bukkit Plugin instance
  */
  public static Plugin getInstance() { return instance; } 
}
