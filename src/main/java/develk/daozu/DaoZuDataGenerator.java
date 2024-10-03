package develk.daozu;

import develk.daozu.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DaoZuDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(LangENUSGenerator::new);
		pack.addProvider(LangZHCNGenerator::new);
		pack.addProvider(ModelGenerator::new);
		pack.addProvider(TagGenerator::new);
	}
}
