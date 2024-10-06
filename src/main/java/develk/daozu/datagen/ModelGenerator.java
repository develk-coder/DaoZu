package develk.daozu.datagen;

import develk.daozu.item.DZItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }
    
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }
    
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DZItems.BROKEN_SPIRIT_STONE, Models.GENERATED);
        itemModelGenerator.register(DZItems.INFERIOR_SPIRIT_STONE, Models.GENERATED);
        itemModelGenerator.register(DZItems.ORDINARY_SPIRIT_STONE, Models.GENERATED);
        itemModelGenerator.register(DZItems.SUPERIOR_SPIRIT_STONE, Models.GENERATED);
        itemModelGenerator.register(DZItems.EXQUISITE_SPIRIT_STONE, Models.GENERATED);
        itemModelGenerator.register(DZItems.TEST_ITEM, Models.GENERATED);
        itemModelGenerator.register(DZItems.LOGO_ITEM, Models.GENERATED);
    }
}
