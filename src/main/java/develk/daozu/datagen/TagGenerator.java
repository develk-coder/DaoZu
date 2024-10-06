package develk.daozu.datagen;

import develk.daozu.item.DZItems;
import develk.daozu.registry.tag.DZItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TagGenerator extends FabricTagProvider.ItemTagProvider {
    public TagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(DZItemTags.SPIRIT_STONE)
            .add(DZItems.BROKEN_SPIRIT_STONE)
            .add(DZItems.INFERIOR_SPIRIT_STONE)
            .add(DZItems.ORDINARY_SPIRIT_STONE)
            .add(DZItems.SUPERIOR_SPIRIT_STONE)
            .add(DZItems.EXQUISITE_SPIRIT_STONE);
        getOrCreateTagBuilder(DZItemTags.SPIRIT_ITEM);
        getOrCreateTagBuilder(DZItemTags.SPIRIT_PLANT);
        getOrCreateTagBuilder(DZItemTags.SPIRIT_MATERIAL);
        getOrCreateTagBuilder(DZItemTags.FIRST_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(DZItemTags.SECOND_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(DZItemTags.THIRD_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(DZItemTags.FOURTH_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(DZItemTags.FIFTH_RANK_SPIRIT_ITEM);
    }
}
