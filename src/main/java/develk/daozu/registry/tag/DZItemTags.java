package develk.daozu.registry.tag;

import develk.daozu.DaoZu;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class DZItemTags {
    public static final TagKey<Item> SPIRIT_STONE;
    public static final TagKey<Item> SPIRIT_ITEM;
    public static final TagKey<Item> SPIRIT_PLANT;
    public static final TagKey<Item> SPIRIT_MATERIAL;
    public static final TagKey<Item> FIRST_RANK_SPIRIT_ITEM;
    public static final TagKey<Item> SECOND_RANK_SPIRIT_ITEM;
    public static final TagKey<Item> THIRD_RANK_SPIRIT_ITEM;
    public static final TagKey<Item> FOURTH_RANK_SPIRIT_ITEM;
    public static final TagKey<Item> FIFTH_RANK_SPIRIT_ITEM;
    
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(DaoZu.MOD_ID, id));
    }
    
    public static void initialize() {
    }
    
    static {
        SPIRIT_STONE = of("spirit_stone");
        SPIRIT_ITEM = of("spirit_item");
        SPIRIT_PLANT = of("spirit_plant");
        SPIRIT_MATERIAL = of("spirit_material");
        FIRST_RANK_SPIRIT_ITEM = of("first_rank_spirit_item");
        SECOND_RANK_SPIRIT_ITEM = of("second_rank_spirit_item");
        THIRD_RANK_SPIRIT_ITEM = of("third_rank_spirit_item");
        FOURTH_RANK_SPIRIT_ITEM = of("fourth_rank_spirit_item");
        FIFTH_RANK_SPIRIT_ITEM = of("fifth_rank_spirit_item");
    }
}
