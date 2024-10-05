package develk.daozu;

import develk.daozu.component.DZDataComponentTypes;
import develk.daozu.item.DZItemGroups;
import develk.daozu.item.DZItems;
import develk.daozu.registry.tag.DZItemTags;
import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
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
		DZItemTags.initialize();
		LOGGER.info("ItemTags initialization is complete.");
		
		CustomPortalBuilder.beginPortal()
			.frameBlock(Blocks.SMOOTH_STONE)
				.lightWithItem(DZItems.LOGO_ITEM)
					.destDimID(Identifier.of(DaoZu.MOD_ID, "the_cultivation_world"))
						.tintColor(88, 214, 141)
							.registerPortal();
			
		
		LOGGER.info("Mod initialization is complete.");
	}
}