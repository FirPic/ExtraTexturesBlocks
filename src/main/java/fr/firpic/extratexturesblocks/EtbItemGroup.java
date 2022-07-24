package fr.firpic.extratexturesblocks;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EtbItemGroup {

    public static final ItemGroup EtbGroup = new ItemGroup("Extra Textures Blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.SOUL_FIRE);
        }
    };
}
