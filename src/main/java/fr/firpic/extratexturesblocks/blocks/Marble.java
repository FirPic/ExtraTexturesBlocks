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

public class Marble {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> MARBLE_ARRAY= registerBlock("marble_array",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_BRAID= registerBlock("marble_braid",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CHAOTIC_BRICKS= registerBlock("marble_chaotic_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CHAOTIC_MEDIUM= registerBlock("marble_chaotic_medium",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CHAOTIC_SMALL= registerBlock("marble_chaotic_small",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CIRCULAR= registerBlock("marble_circular",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CRACKED= registerBlock("marble_cracked",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CRACKED_BRICKS= registerBlock("marble_cracked_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_CUTS= registerBlock("marble_cuts",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_DENT= registerBlock("marble_dent",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_ENCASED_BRICKS= registerBlock("marble_encased_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_FRENCH_ONE= registerBlock("marble_french_one",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_FRENCH_TWO= registerBlock("marble_french_two",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_JELLYBEAN= registerBlock("marble_jellybean",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_LAYERS= registerBlock("marble_layers",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_MOSAIC= registerBlock("marble_mosaic",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_ORNATE= registerBlock("marble_ornate",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_PANEL= registerBlock("marble_panel",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_PILLAR= registerBlock("marble_pillar",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_PRISM= registerBlock("marble_prism",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_RAW= registerBlock("marble_raw",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_ROAD= registerBlock("marble_road",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_SLANTED= registerBlock("marble_slanted",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_SMALL_BRICKS= registerBlock("marble_small_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_SOFT_BRICKS= registerBlock("marble_soft_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_SOLID_BRICKS= registerBlock("marble_solid_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_TILES_LARGE= registerBlock("marble_tiles_large",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_TILES_MEDIUM= registerBlock("marble_tiles_medium",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_TILES_SMALL= registerBlock("marble_tiles_small",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_TRIPLE_BRICKS= registerBlock("marble_triple_bricks",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_TWISTED= registerBlock("marble_twisted",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_WEAVER= registerBlock("marble_weaver",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    public static final RegistryObject<Block> MARBLE_ZAG= registerBlock("marble_zag",
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
                new Item.Properties().group(EtbItemGroup.MarbleGroup)));
    }



    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}


}