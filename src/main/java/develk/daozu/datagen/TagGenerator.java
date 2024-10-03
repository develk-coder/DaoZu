package develk.daozu.datagen;

import develk.daozu.item.DZItems;
import develk.daozu.tag.ItemTags;
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
        getOrCreateTagBuilder(ItemTags.SPIRIT_STONE)
            .add(DZItems.BROKEN_SPIRIT_STONE)
            .add(DZItems.INFERIOR_SPIRIT_STONE)
            .add(DZItems.ORDINARY_SPIRIT_STONE)
            .add(DZItems.SUPERIOR_SPIRIT_STONE)
            .add(DZItems.EXQUISITE_SPIRIT_STONE);
        getOrCreateTagBuilder(ItemTags.SPIRIT_ITEM);
        getOrCreateTagBuilder(ItemTags.SPIRIT_PLANT);
        getOrCreateTagBuilder(ItemTags.SPIRIT_MATERIAL);
        getOrCreateTagBuilder(ItemTags.FIRST_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(ItemTags.SECOND_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(ItemTags.THIRD_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(ItemTags.FOURTH_RANK_SPIRIT_ITEM);
        getOrCreateTagBuilder(ItemTags.FIFTH_RANK_SPIRIT_ITEM);
        
    }
}
