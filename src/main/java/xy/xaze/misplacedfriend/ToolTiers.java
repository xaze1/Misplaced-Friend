package xy.xaze.misplacedfriend;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class ToolTiers {
    public static final Tier ASTRAL_TIER = new Tier() {
        @Override
        public int getUses() {
            return 3750; // durability
        }

        @Override
        public float getSpeed() {
            return 1.0F; // mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 3.0F; // extra attack damage
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return null;
        }

        @Override
        public int getEnchantmentValue() {
            return 22;
        }

        public int getLevel(){
            return 3;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.DIAMOND); // or your custom item
        }
    };
}
