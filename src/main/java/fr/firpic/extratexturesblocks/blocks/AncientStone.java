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

public class AncientStone {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);


    public static final RegistryObject<Block> ANCIENT_STONE_ARRAY = registerBlock("ancient_stone_array",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_BRAID = registerBlock("ancient_stone_braid",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CHAOTIC_BRICKS = registerBlock("ancient_stone_chaotic_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CHAOTIC_MEDIUM = registerBlock("ancient_stone_chaotic_medium",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CHAOTIC_SMALL = registerBlock("ancient_stone_chaotic_small",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CIRCULAR = registerBlock("ancient_stone_circular",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CRACKED = registerBlock("ancient_stone_cracked",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CRACKED_BRICKS = registerBlock("ancient_stone_cracked_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_CUTS = registerBlock("ancient_stone_cuts",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_DENT = registerBlock("ancient_stone_dent",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );


    public static final RegistryObject<Block> ANCIENT_STONE_ENCASED_BRICKS = registerBlock("ancient_stone_encased_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );


    public static final RegistryObject<Block> ANCIENT_STONE_FRENCH_ONE = registerBlock("ancient_stone_french_one",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_FRENCH_TWO = registerBlock("ancient_stone_french_two",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_JELLYBEAN = registerBlock("ancient_stone_jellybean.json",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_LAYERS = registerBlock("ancient_stone_layers",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_MOSAIC = registerBlock("ancient_stone_mosaic",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_ORNATE = registerBlock("ancient_stone_ornate",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_PANEL = registerBlock("ancient_stone_panel",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_PILLAR = registerBlock("ancient_stone_pillar",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_PRISM = registerBlock("ancient_stone_prism",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_RAW = registerBlock("ancient_stone_raw",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_ROAD = registerBlock("ancient_stone_road",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_SLANTED = registerBlock("ancient_stone_slanted",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_SMALL_BRICKS = registerBlock("ancient_stone_small_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_SOFT_BRICKS = registerBlock("ancient_stone_soft_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_SOLID_BRICKS = registerBlock("ancient_stone_solid_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_TILES_LARGE = registerBlock("ancient_stone_tiles_large",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_TILES_MEDIUM = registerBlock("ancient_stone_tiles_medium",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_TILES_SMALL = registerBlock("ancient_stone_tiles_small",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_TRIPLE_BRICKS = registerBlock("ancient_stone_triple_bricks",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_TWISTED = registerBlock("ancient_stone_twisted",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_WEAVER = registerBlock("ancient_stone_weaver",
            ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .hardnessAndResistance(5f)
            )
    );

    public static final RegistryObject<Block> ANCIENT_STONE_ZAG = registerBlock("ancient_stone_zag",
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
