import json

textures_folder=""

def itemGroup(name):
    group='''
    public static final ItemGroup ''',name.replace(" ","").title(),'''Group = new ItemGroup("''',name.title(),'''") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(EtbItemsRegistry.ARRAY.get());
        }
    }; '''
    with open("itemGroup.tmp", "w+") as ig:
        ig.write("".join(group))
        ig.close()


nf=0

def fileNumber():
    global nf
    nf=nf+3

def jsonWrite(file, content):
    print('\n\nstart file : ' + file)
    f=open(file, "w+")
    f.write(content)
    f.close()
    print('finish file : ' + file)
    fileNumber()


def json_blockstates_model_loot_tables():
    global textures_folder
    textures_folder = input("prefix of blocks : ")
    prefix_of_block_and_file = textures_folder+"_"
    list_of_blocks = ["array", "braid", "chaotic_bricks", "chaotic_medium", "chaotic_small", "circular", "cracked", "cracked_bricks", "cuts", "dent", "encased_bricks", "french_one", "french_two", "jellybean", "layers", "mosaic", "ornate", "panel", "pillar", "prism", "raw", "road", "slanted", "small_bricks", "soft_bricks", "solid_bricks", "tiles_large", "tiles_medium", "tiles_small", "triple_bricks", "twisted", "weaver", "zag"]

    print('reading blocks list ')

    

    for x in range(len(list_of_blocks)):
        block_name = prefix_of_block_and_file+list_of_blocks[x]
        file = block_name+".json"

        

        jsonWrite("..\\src\\main\\resources\\assets\\extratexturesblocks\\blockstates\\"+file.lower() ,'{"variants": {"": { "model":  "extratexturesblocks:block/'+block_name.lower()+'"}}}')
        jsonWrite("..\\src\\main\\resources\\assets\\extratexturesblocks\\models\\block\\"+file.lower() ,'{"parent": "block/cube_all","textures": {"all": "extratexturesblocks:block/'+textures_folder.lower()+'/'+list_of_blocks[x].lower()+'"}}')
        jsonWrite("..\\src\\main\\resources\\assets\\extratexturesblocks\\models\\item\\"+file.lower() ,'{"parent": "extratexturesblocks:block/'+block_name.lower()+'"}')
        jsonWrite("..\\src\\main\\resources\\data\\extratexturesblocks\\loot_tables\\blocks\\"+file.lower() ,'{"type": "minecraft:block","pools": [{"rolls": 1,"entries":[{"type": "minecraft:item","name": "extratexturesblocks:'+block_name.lower()+'"}]}]}')

        json_block_name(block_name)
        javaClassBlock(block_name)

    javaClass(textures_folder)
    itemGroup(prefix_of_block_and_file.replace("_", " "))


def json_block_name(blockName):
    blockId = "block.extratexturesblocks."+blockName
    JsonData =  {blockId:blockName.replace("_", " ").title()}
    print("JsonData:",JsonData)
    with open("../src/main/resources/assets/extratexturesblocks/lang/en_us.json", "r") as file:
        json1 = json.load(file)

    json2 = JsonData
    for (k2, v2) in json2.items():
        json1[k2]=v2


    with open("../src/main/resources/assets/extratexturesblocks/lang/en_us.json", "w") as f:
        json.dump(json1, fp=f, indent=4)

Blocks=""
def javaClassBlock(block):
    global Blocks

    blockCode ='''public static final RegistryObject<Block> '''+block.upper()+'''= registerBlock("'''+block.lower() +'''",
        ()-> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
            .hardnessAndResistance(5f)
    ));

    '''
    blockCode= ''.join(blockCode)
    print("\ncode of block", block,'has generate')
    Blocks+=blockCode



def javaClass(name):
    javaFile=open("../src/main/java/fr/firpic/extratexturesblocks/blocks/"+name.title().replace("_","")+".java", "w+")
    code='''package fr.firpic.extratexturesblocks.blocks;

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

public class ''',name.title().replace("_",""),''' {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    ''', Blocks, '''

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        EtbItemsRegistry.ITEMS.register(name, ()->new BlockItem(block.get(),
                new Item.Properties().group(EtbItemGroup.''',name.title(),'''Group)));
    }



    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}


}'''

    javaFile.write(''.join(code))
    javaFile.close()
    print('\nthe class of ',name,'has generate and write')


print('start etb generator json file to blockstates, model of block and item, loot tables\n')
json_blockstates_model_loot_tables()
print('numbre de fichier creer : ',nf)
print(textures_folder)

print('\nfinish etb generator json file to blockstates, model of block and item, loot tables')
