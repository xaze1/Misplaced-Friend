package xy.xaze.misplacedfriend;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class AstralFriend {

    public static final Tool ASTRAL_SWORD_TOOL = new Tool(
            List.of(),
            1.0F,
            1
    );

    public static final DeferredItem<AstralSwordItem> ASTRAL_SWORD = MisplacedFriend.ITEMS.registerItem("astral_sword", prop ->
            new AstralSwordItem(prop));

    public static class AstralSwordItem extends SwordItem {
        public AstralSwordItem(Item.Properties prop) {
            super(ToolTiers.ASTRAL_TIER, prop.component(DataComponents.TOOL, ASTRAL_SWORD_TOOL)
                    .attributes(SwordItem.createAttributes(ToolTiers.ASTRAL_TIER, 10f, -1.5f)),
                    ASTRAL_SWORD_TOOL);
        }
    }
}
