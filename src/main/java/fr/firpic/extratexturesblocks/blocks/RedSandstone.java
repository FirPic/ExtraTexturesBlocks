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

public class RedSandstone {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> RED_SANDSTONE_ARRAY= registerBlock("Red_Sandstone_array",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_BRAID= registerBlock("Red_Sandstone_braid",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CHAOTIC_BRICKS= registerBlock("Red_Sandstone_chaotic_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CHAOTIC_MEDIUM= registerBlock("Red_Sandstone_chaotic_medium",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CHAOTIC_SMALL= registerBlock("Red_Sandstone_chaotic_small",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CIRCULAR= registerBlock("Red_Sandstone_circular",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CRACKED= registerBlock("Red_Sandstone_cracked",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CRACKED_BRICKS= registerBlock("Red_Sandstone_cracked_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_CUTS= registerBlock("Red_Sandstone_cuts",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_DENT= registerBlock("Red_Sandstone_dent",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_ENCASED_BRICKS= registerBlock("Red_Sandstone_encased_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_FRENCH_ONE= registerBlock("Red_Sandstone_french_one",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_FRENCH_TWO= registerBlock("Red_Sandstone_french_two",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_JELLYBEAN= registerBlock("Red_Sandstone_jellybean",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_LAYERS= registerBlock("Red_Sandstone_layers",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_MOSAIC= registerBlock("Red_Sandstone_mosaic",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_ORNATE= registerBlock("Red_Sandstone_ornate",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_PANEL= registerBlock("Red_Sandstone_panel",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_PILLAR= registerBlock("Red_Sandstone_pillar",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_PRISM= registerBlock("Red_Sandstone_prism",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_RAW= registerBlock("Red_Sandstone_raw",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_ROAD= registerBlock("Red_Sandstone_road",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_SLANTED= registerBlock("Red_Sandstone_slanted",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_SMALL_BRICKS= registerBlock("Red_Sandstone_small_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_SOFT_BRICKS= registerBlock("Red_Sandstone_soft_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_SOLID_BRICKS= registerBlock("Red_Sandstone_solid_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_TILES_LARGE= registerBlock("Red_Sandstone_tiles_large",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_TILES_MEDIUM= registerBlock("Red_Sandstone_tiles_medium",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_TILES_SMALL= registerBlock("Red_Sandstone_tiles_small",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_TRIPLE_BRICKS= registerBlock("Red_Sandstone_triple_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_TWISTED= registerBlock("Red_Sandstone_twisted",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_WEAVER= registerBlock("Red_Sandstone_weaver",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> RED_SANDSTONE_ZAG= registerBlock("Red_Sandstone_zag",
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
                new Item.Properties().group(EtbItemGroup.RedSandstoneGroup)));
    }



    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}


}