package demo.composite;

import org.bukkit.plugin.java.JavaPlugin;

public final class DemoComposite extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("DemoComposite " + getPluginMeta().getVersion() + " enabled");
    }
}
