package develk.daozu;

import develk.daozu.datagen.*;
import develk.daozu.datagen.world.DZDimensionTypes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class DaoZuDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(LangENUSGenerator::new);
		pack.addProvider(LangZHCNGenerator::new);
		pack.addProvider(ModelGenerator::new);
		pack.addProvider(ItemTagGenerator::new);
		pack.addProvider(WorldGenGenerator::new);
	}
	
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, DZDimensionTypes::bootstrap);
	}
}
