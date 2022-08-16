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


    public static final ItemGroup AncientStoneGroup = new ItemGroup("Ancient Stone") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(EtbItemsRegistry.ARRAY.get());
        }
    };
    public static final ItemGroup AndesiteGroup = new ItemGroup("Andesite") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(EtbItemsRegistry.ARRAY.get());
        }
    };
    public static final ItemGroup AracaneStoneGroup = new ItemGroup("Arcane Stone") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(EtbItemsRegistry.ARRAY.get());
        }
    };
}
