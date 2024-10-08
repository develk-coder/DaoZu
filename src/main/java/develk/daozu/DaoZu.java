package develk.daozu;

import develk.daozu.component.DZDataComponentTypes;
import develk.daozu.item.DZItemGroups;
import develk.daozu.item.DZItems;
import develk.daozu.registry.tag.DZItemTags;
import develk.daozu.util.Colors;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoZu implements ModInitializer {
	public static final String MOD_ID = "daozu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	@Override
	public void onInitialize() {
		DZItems.initialize();
		DZItemTags.initialize();
		DZItemGroups.initialize();
		DZDataComponentTypes.initialize();
		Colors.initialize();
		
		LOGGER.info("DaoZu initialization is complete.");
	}
}