package develk.daozu.item;

import develk.daozu.DaoZu;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class DZItemGroups {
    public static final RegistryKey<ItemGroup> DAOZU_ITEM_GROUP;
    public static final RegistryKey<ItemGroup> TEST_ITEM_GROUP;
    
    private static void addItemToIG() {
        Registry.register(Registries.ITEM_GROUP, DAOZU_ITEM_GROUP,
            ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.daozu.daozu_item_group")
                    .formatted(Formatting.BOLD).formatted(Formatting.GOLD))
                .icon(() -> new ItemStack(DZItems.LOGO_ITEM))
                .entries((displayContext, entries) -> {
                    entries.add(DZItems.BROKEN_SPIRIT_STONE);
                    entries.add(DZItems.INFERIOR_SPIRIT_STONE);
                    entries.add(DZItems.ORDINARY_SPIRIT_STONE);
                    entries.add(DZItems.SUPERIOR_SPIRIT_STONE);
                    entries.add(DZItems.EXQUISITE_SPIRIT_STONE);
                }).build());
        Registry.register(Registries.ITEM_GROUP, TEST_ITEM_GROUP,
            ItemGroup.create(null, -1)
                .displayName(Text.translatable("itemGroup.daozu.test_item_group")
                    .formatted(Formatting.BOLD).formatted(Formatting.DARK_PURPLE))
                .icon(() -> new ItemStack(DZItems.TEST_ITEM))
                .entries((displayContext, entries) -> {
                    entries.add(DZItems.TEST_ITEM);
                    entries.add(DZItems.LOGO_ITEM);}).build());
    }
    
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(DaoZu.MOD_ID, id));
    }
    
    public static void initialize(){
        addItemToIG();
    }
    
    static {
        DAOZU_ITEM_GROUP = register("daozu_item_group");
        TEST_ITEM_GROUP = register("test_item_group");
    }
}
