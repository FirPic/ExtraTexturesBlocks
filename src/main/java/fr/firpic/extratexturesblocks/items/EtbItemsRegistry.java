package fr.firpic.extratexturesblocks.items;


import fr.firpic.extratexturesblocks.EtbItemGroup;
import fr.firpic.extratexturesblocks.Reference;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class EtbItemsRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);


    public static final RegistryObject<Item>  ARRAY = ITEMS.register("array",
            () -> new Item(new Item.Properties().group(EtbItemGroup.EtbGroup)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
