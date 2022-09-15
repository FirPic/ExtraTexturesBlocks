package fr.firpic.extratexturesblocks.blocks;

import fr.firpic.extratexturesblocks.EtbItemGroup;
import fr.firpic.extratexturesblocks.Reference;
import fr.firpic.extratexturesblocks.items.EtbItemsRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class Bricks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> BRICKS_ARRAY= registerBlock("bricks_array",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_BRAID= registerBlock("bricks_braid",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CHAOTIC_BRICKS= registerBlock("bricks_chaotic_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CHAOTIC_MEDIUM= registerBlock("bricks_chaotic_medium",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CHAOTIC_SMALL= registerBlock("bricks_chaotic_small",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CIRCULAR= registerBlock("bricks_circular",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CRACKED= registerBlock("bricks_cracked",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CRACKED_BRICKS= registerBlock("bricks_cracked_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_CUTS= registerBlock("bricks_cuts",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_DENT= registerBlock("bricks_dent",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_ENCASED_BRICKS= registerBlock("bricks_encased_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_FRENCH_ONE= registerBlock("bricks_french_one",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_FRENCH_TWO= registerBlock("bricks_french_two",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_JELLYBEAN= registerBlock("bricks_jellybean",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_LAYERS= registerBlock("bricks_layers",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_MOSAIC= registerBlock("bricks_mosaic",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_ORNATE= registerBlock("bricks_ornate",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_PANEL= registerBlock("bricks_panel",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_PILLAR= registerBlock("bricks_pillar",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_PRISM= registerBlock("bricks_prism",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_RAW= registerBlock("bricks_raw",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_ROAD= registerBlock("bricks_road",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_SLANTED= registerBlock("bricks_slanted",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_SMALL_BRICKS= registerBlock("bricks_small_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_SOFT_BRICKS= registerBlock("bricks_soft_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_SOLID_BRICKS= registerBlock("bricks_solid_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_TILES_LARGE= registerBlock("bricks_tiles_large",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_TILES_MEDIUM= registerBlock("bricks_tiles_medium",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_TILES_SMALL= registerBlock("bricks_tiles_small",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_TRIPLE_BRICKS= registerBlock("bricks_triple_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_TWISTED= registerBlock("bricks_twisted",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_WEAVER= registerBlock("bricks_weaver",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> BRICKS_ZAG= registerBlock("bricks_zag",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        EtbItemsRegistry.ITEMS.register(name, ()->new BlockItem(block.get(),
                new Item.Properties().group(EtbItemGroup.BricksGroup)));
    }



    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}


}