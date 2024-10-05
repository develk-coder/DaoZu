package develk.daozu.world.dimension;

import develk.daozu.DaoZu;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class DZDimensions {
    public static final RegistryKey<DimensionOptions> THE_CULTIVATION_WORLD = RegistryKey.of(RegistryKeys.DIMENSION,
        Identifier.of(DaoZu.MOD_ID, "the_cultivation_world"));
    public static final RegistryKey<World> THE_CULTIVATION_WORLD_LEVEL = RegistryKey.of(RegistryKeys.WORLD,
        Identifier.of(DaoZu.MOD_ID, "the_cultivation_world"));
    public static final RegistryKey<DimensionType> THE_CULTIVATION_WORLD_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
        Identifier.of(DaoZu.MOD_ID, "the_cultivation_world"));
    
    public static void bootstrap(Registerable<DimensionType> context) {
//        游戏内一天为多少游戏刻 1day = 1hour = 72000gt
//        是否有天空光照 true
//        是否有基岩天花板 false
//        是否如下界一般不能放水 false
//        是否能用床跳过夜晚或是重置出生点 false
//        传送到该维度时的坐标缩放值 1.0
//        是否床不会爆炸 true
//        是否重生锚不会爆炸 false
//        可以存在方块的最低高度 0
//        可以存在方块的总高度 360
//        逻辑总高度，数值同上 360
//        火可以在哪些方块上永久燃烧 方块标签
//        天空效果 天空中出现云、太阳、星星和月亮
//        渲染光照 0.2f
//        是否猪灵、猪灵蛮兵和疣猪兽不会僵尸化 true
//        是否带有不祥之兆的玩家可以触发袭击 false
//        怪物生成位置的最大光照 (min, max) 闭区间 (0, 0)
//        怪物生成位置的最大方块光照 0
        
        context.register(THE_CULTIVATION_WORLD_TYPE, new DimensionType(
            OptionalLong.of(72000),
            true,
            false,
            false,
            false,
            1.0,
            true,
            false,
            0,
            400,
            400,
            BlockTags.INFINIBURN_OVERWORLD,
            DimensionTypes.OVERWORLD_ID,
            0.2f, new DimensionType.MonsterSettings(
            true,
            false,
            UniformIntProvider.create(0, 0),
            0)
        ));
    }
}
