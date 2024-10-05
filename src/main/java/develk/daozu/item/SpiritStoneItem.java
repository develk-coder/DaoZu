package develk.daozu.item;

import develk.daozu.component.DZDataComponentTypes;
import develk.daozu.registry.tag.DZItemTags;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class SpiritStoneItem extends Item {
    public SpiritStoneItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        if (stack.getItem() == DZItems.BROKEN_SPIRIT_STONE) {
            tooltip.add(Text.translatable("tooltip.daozu.broken_spirit_stone.1").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("tooltip.daozu.broken_spirit_stone.2").formatted(Formatting.GRAY));
        }
        if (stack.isIn(DZItemTags.SPIRIT_STONE)) {
            tooltip.add(Text.translatable("tooltip.daozu.spiritual_energy",
                stack.get(DZDataComponentTypes.SPIRITUAL_ENERGY)).formatted(Formatting.BOLD).formatted(Formatting.GREEN));
        }
    }
}
