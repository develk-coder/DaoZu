package develk.daozu.component;

import com.mojang.serialization.Codec;
import develk.daozu.DaoZu;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DZDataComponentTypes {
    public static final ComponentType<Integer> SPIRITUAL_ENERGY;
    public static final ComponentType<Integer> CLICK_COUNT;
    
    public static void initialize() {
    }
    
    static {
        SPIRITUAL_ENERGY = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(DaoZu.MOD_ID, "spiritual_energy"),
            ComponentType.<Integer>builder().codec(Codec.INT).build()
        );
        CLICK_COUNT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(DaoZu.MOD_ID, "click_count"),
            ComponentType.<Integer>builder().codec(Codec.INT).build()
        );
    }
}
