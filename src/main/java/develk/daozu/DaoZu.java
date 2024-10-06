package develk.daozu;

import develk.daozu.component.DZDataComponentTypes;
import develk.daozu.item.DZItemGroups;
import develk.daozu.item.DZItems;
import develk.daozu.registry.tag.DZItemTags;
import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.WorldPreset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoZu implements ModInitializer {
	public static final String MOD_ID = "daozu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RegistryKey<WorldPreset> DAOZU = RegistryKey.of(RegistryKeys.WORLD_PRESET,
		Identifier.of(DaoZu.MOD_ID, "the_cultivation_world"));
	
	@Override
	public void onInitialize() {
		DZItems.initialize();
		DZItemTags.initialize();
		DZItemGroups.initialize();
		DZDataComponentTypes.initialize();
		
		LOGGER.info("DaoZu initialization is complete.");
	}
}