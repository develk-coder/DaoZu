package develk.daozu.item;

import develk.daozu.DaoZu;
import develk.daozu.component.DZDataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DZItems {
    public static final Item BROKEN_SPIRIT_STONE;
    public static final Item INFERIOR_SPIRIT_STONE;
    public static final Item ORDINARY_SPIRIT_STONE;
    public static final Item SUPERIOR_SPIRIT_STONE;
    public static final Item EXQUISITE_SPIRIT_STONE;
    public static final Item TEST_ITEM;
    public static final Item LOGO_ITEM;
    
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DaoZu.MOD_ID, id), item);
    }
    
    public static void initialize() {
    }
    //MC Fabric A Immortal Cultivation Mod For Minecraft.
    static {
        BROKEN_SPIRIT_STONE = register("broken_spirit_stone", new SpiritStoneItem(new Item.Settings()
            .component(DZDataComponentTypes.SPIRITUAL_ENERGY, 1)));
        INFERIOR_SPIRIT_STONE = register("inferior_spirit_stone", new SpiritStoneItem(new Item.Settings()
            .component(DZDataComponentTypes.SPIRITUAL_ENERGY, 10)));
        ORDINARY_SPIRIT_STONE = register("ordinary_spirit_stone", new SpiritStoneItem(new Item.Settings()
            .component(DZDataComponentTypes.SPIRITUAL_ENERGY, 1000)));
        SUPERIOR_SPIRIT_STONE = register("superior_spirit_stone", new SpiritStoneItem(new Item.Settings()
            .component(DZDataComponentTypes.SPIRITUAL_ENERGY, 100000)));
        EXQUISITE_SPIRIT_STONE = register("exquisite_spirit_stone", new SpiritStoneItem(new Item.Settings()
            .component(DZDataComponentTypes.SPIRITUAL_ENERGY, 10000000)));
        TEST_ITEM = register("test_item", new CounterItem(new Item.Settings().maxCount(1)
            .component(DZDataComponentTypes.CLICK_COUNT, 0)));
        LOGO_ITEM = register("logo_item", new Item(new Item.Settings().maxCount(1)));
    }
}
