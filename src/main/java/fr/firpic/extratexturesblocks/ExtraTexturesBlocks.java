package fr.firpic.extratexturesblocks;

import fr.firpic.extratexturesblocks.blocks.AncientStone;
import fr.firpic.extratexturesblocks.blocks.Andesite;
import fr.firpic.extratexturesblocks.blocks.ArcaneStone;
import fr.firpic.extratexturesblocks.blocks.Bricks;
import fr.firpic.extratexturesblocks.blocks.Certus;
import fr.firpic.extratexturesblocks.blocks.Charcoal;
import fr.firpic.extratexturesblocks.blocks.Coal;
import fr.firpic.extratexturesblocks.blocks.Coalcoke;
import fr.firpic.extratexturesblocks.blocks.Cobblestone;
import fr.firpic.extratexturesblocks.blocks.Diabase;
import fr.firpic.extratexturesblocks.blocks.Diorite;
import fr.firpic.extratexturesblocks.blocks.Endstone;
import fr.firpic.extratexturesblocks.blocks.Fluid;
import fr.firpic.extratexturesblocks.blocks.Glowstone;
import fr.firpic.extratexturesblocks.blocks.Granite;
import fr.firpic.extratexturesblocks.blocks.Ice;
import fr.firpic.extratexturesblocks.blocks.Limestone;
import fr.firpic.extratexturesblocks.blocks.Magma;
import fr.firpic.extratexturesblocks.blocks.Marble;
import fr.firpic.extratexturesblocks.blocks.Prismarine;
import fr.firpic.extratexturesblocks.blocks.Purpur;
import fr.firpic.extratexturesblocks.blocks.Quartz;
import fr.firpic.extratexturesblocks.blocks.RedSandstone;
import fr.firpic.extratexturesblocks.blocks.Redstone;
import fr.firpic.extratexturesblocks.blocks.Sandstone;
import fr.firpic.extratexturesblocks.blocks.Terracotta;

import fr.firpic.extratexturesblocks.items.EtbItemsRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class ExtraTexturesBlocks {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ExtraTexturesBlocks() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        AncientStone.register(eventBus);
        Andesite.register(eventBus);
        ArcaneStone.register(eventBus);
        Bricks.register(eventBus);
        Certus.register(eventBus);
        Charcoal.register(eventBus);
        Coal.register(eventBus);
        Coalcoke.register(eventBus);
        Cobblestone.register(eventBus);
        Diabase.register(eventBus);
        Diorite.register(eventBus);
        Endstone.register(eventBus);
        Fluid.register(eventBus);
        Glowstone.register(eventBus);
        Granite.register(eventBus);
        Ice.register(eventBus);
        Limestone.register(eventBus);
        Magma.register(eventBus);
        Marble.register(eventBus);
        Prismarine.register(eventBus);
        Purpur.register(eventBus);
        Quartz.register(eventBus);
        RedSandstone.register(eventBus);
        Redstone.register(eventBus);
        Sandstone.register(eventBus);
        Terracotta.register(eventBus);


        EtbItemsRegistry.register(eventBus);


        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("extratexturesblocks", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
