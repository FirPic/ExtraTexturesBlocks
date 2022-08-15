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

public class Andesite {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);


    public static final RegistryObject<Block> ANDESITE_ARRAY = registerBlock("andesite_array",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_BRAID = registerBlock("andesite_braid",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CHAOTIC_BRICKS = registerBlock("andesite_chaotic_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CHAOTIC_MEDIUM = registerBlock("andesite_chaotic_medium",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CHAOTIC_SMALL = registerBlock("andesite_chaotic_small",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CIRCULAR = registerBlock("andesite_circular",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CRACKED = registerBlock("andesite_cracked",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CRACKED_BRICKS = registerBlock("andesite_cracked_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_CUTS = registerBlock("andesite_cuts",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_DENT = registerBlock("andesite_dent",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );


    public static final RegistryObject<Block> ANDESITE_ENCASED_BRICKS = registerBlock("andesite_encased_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );


    public static final RegistryObject<Block> ANDESITE_FRENCH_ONE = registerBlock("andesite_french_one",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_FRENCH_TWO = registerBlock("andesite_french_two",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_JELLYBEAN = registerBlock("andesite_jellybean.json",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_LAYERS = registerBlock("andesite_layers",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_MOSAIC = registerBlock("andesite_mosaic",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_ORNATE = registerBlock("andesite_ornate",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_PANEL = registerBlock("andesite_panel",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_PILLAR = registerBlock("andesite_pillar",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_PRISM = registerBlock("andesite_prism",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_RAW = registerBlock("andesite_raw",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_ROAD = registerBlock("andesite_road",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_SLANTED = registerBlock("andesite_slanted",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_SMALL_BRICKS = registerBlock("andesite_small_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_SOFT_BRICKS = registerBlock("andesite_soft_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_SOLID_BRICKS = registerBlock("andesite_solid_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_TILES_LARGE = registerBlock("andesite_tiles_large",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_TILES_MEDIUM = registerBlock("andesite_tiles_medium",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_TILES_SMALL = registerBlock("andesite_tiles_small",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_TRIPLE_BRICKS = registerBlock("andesite_triple_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_TWISTED = registerBlock("andesite_twisted",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_WEAVER = registerBlock("andesite_weaver",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANDESITE_ZAG = registerBlock("andesite_zag",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );



    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        EtbItemsRegistry.ITEMS.register(name, ()->new BlockItem(block.get(),
                new Item.Properties().group(EtbItemGroup.EtbGroup)));
    }



    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}


}
