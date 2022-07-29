package fr.firpic.extratexturesblocks;


import fr.firpic.extratexturesblocks.items.EtbItemsRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EtbItemGroup {

    public static final ItemGroup EtbGroup = new ItemGroup("Extra Textures Blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(EtbItemsRegistry.ARRAY.get());
        }
    };
}
