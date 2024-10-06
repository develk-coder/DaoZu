package develk.daozu.datagen;

import develk.daozu.item.DZItemGroups;
import develk.daozu.item.DZItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LangENUSGenerator extends FabricLanguageProvider {
    public LangENUSGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }
    
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(DZItems.BROKEN_SPIRIT_STONE, "§9Broken Spirit Stone");
        translationBuilder.add(DZItems.INFERIOR_SPIRIT_STONE, "Inferior Spirit Stone");
        translationBuilder.add(DZItems.ORDINARY_SPIRIT_STONE, "Ordinary Spirit Stone");
        translationBuilder.add(DZItems.SUPERIOR_SPIRIT_STONE, "Superior Spirit Stone");
        translationBuilder.add(DZItems.EXQUISITE_SPIRIT_STONE, "Exquisite Spirit Stone");
        translationBuilder.add(DZItems.TEST_ITEM, "Test Item");
        translationBuilder.add(DZItems.LOGO_ITEM, "Logo");
        translationBuilder.add(DZItemGroups.DAOZU_ITEM_GROUP, "DaoZu");
        translationBuilder.add(DZItemGroups.TEST_ITEM_GROUP, "Test");
        translationBuilder.add("tooltip.daozu.broken_spirit_stone.1", "A cultivator commented that this couldn't even be ");
        translationBuilder.add("tooltip.daozu.broken_spirit_stone.2", "called a spirit stone, given its dismally low Spirit Qi.");
        translationBuilder.add("tooltip.daozu.spiritual_energy", "Spiritual Energy: %1$s");
        translationBuilder.add("tooltip.daozu.click_count", "Used %1$s times");
        translationBuilder.add("generator.daozu.the_cultivation_world", "§3§lTCW");
        translationBuilder.add("modmenu.nameTranslation.daozu", "DaoZu");
        translationBuilder.add("modmenu.descriptionTranslation.daozu", "Dao respect me.");
        translationBuilder.add("modmenu.summaryTranslation.daozu", "Dao respect me.");
    }
}
