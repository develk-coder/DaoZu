package develk.daozu.datagen;

import develk.daozu.item.DZItemGroups;
import develk.daozu.item.DZItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LangZHCNGenerator extends FabricLanguageProvider {
    public LangZHCNGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }
    
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(DZItems.BROKEN_SPIRIT_STONE, "§9碎灵石");
        translationBuilder.add(DZItems.INFERIOR_SPIRIT_STONE, "下品灵石");
        translationBuilder.add(DZItems.ORDINARY_SPIRIT_STONE, "中品灵石");
        translationBuilder.add(DZItems.SUPERIOR_SPIRIT_STONE, "上品灵石");
        translationBuilder.add(DZItems.EXQUISITE_SPIRIT_STONE, "极品灵石");
        translationBuilder.add(DZItems.TEST_ITEM, "测试物品");
        translationBuilder.add(DZItems.LOGO_ITEM, "Logo");
        translationBuilder.add(DZItemGroups.DAOZU_ITEM_GROUP, "道祖");
        translationBuilder.add(DZItemGroups.TEST_ITEM_GROUP, "测试");
        translationBuilder.add("tooltip.daozu.broken_spirit_stone.1", "一位修士评论：不配称为灵石，");
        translationBuilder.add("tooltip.daozu.broken_spirit_stone.2", "因为它的灵气实在低得可怜。");
        translationBuilder.add("tooltip.daozu.spiritual_energy", "灵能: %1$s");
        translationBuilder.add("tooltip.daozu.click_count", "使用了 %1$s 次");
        translationBuilder.add("generator.daozu.daozu", "§d道祖");
        translationBuilder.add("modmenu.nameTranslation.daozu", "道祖");
        translationBuilder.add("modmenu.descriptionTranslation.daozu", "道尊我。");
        translationBuilder.add("modmenu.summaryTranslation.daozu", "道尊我。");
        
    }
}
