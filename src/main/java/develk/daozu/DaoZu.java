package develk.daozu;

import develk.daozu.component.DZDataComponentTypes;
import develk.daozu.item.DZItemGroups;
import develk.daozu.item.DZItems;
import develk.daozu.tag.ItemTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoZu implements ModInitializer {
	public static final String MOD_ID = "daozu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DZDataComponentTypes.initialize();
		LOGGER.info("DataComponentTypes initialization is complete.");
		DZItems.initialize();
		LOGGER.info("Items initialization is complete.");
		DZItemGroups.initialize();
		LOGGER.info("ItemGroups initialization is complete.");
		ItemTags.initialize();
		LOGGER.info("ItemTags initialization is complete.");
		
		LOGGER.info("Mod initialization is complete.");
	}
}