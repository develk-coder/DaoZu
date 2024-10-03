package develk.daozu.item;

import develk.daozu.component.DZDataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class CounterItem extends Item {
    public CounterItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        if (stack.contains(DZDataComponentTypes.CLICK_COUNT)) {
            int clickCount = stack.getOrDefault(DZDataComponentTypes.CLICK_COUNT, 0);
            tooltip.add(Text.translatable("tooltip.daozu.click_count",
                clickCount).formatted(Formatting.BOLD).formatted(Formatting.GREEN));
        }
    }
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        
        if (world.isClient) {
            return TypedActionResult.success(stack);
        }
        
        int clickCount = stack.getOrDefault(DZDataComponentTypes.CLICK_COUNT, 0);
        stack.set(DZDataComponentTypes.CLICK_COUNT, ++clickCount);
        user.sendMessage(Text.of(stack.getName()));
        
        return TypedActionResult.success(stack);
    }
}
