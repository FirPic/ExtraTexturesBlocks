t = "andesite"
ti = t+"_"
l=["array","braid"]
for x in range(len(l)):
    bn = ti+l[x]
    f = bn+".json"
    f_d = open("../src/main/resources/assets/extratexturesblocks/blockstates/"+f, "w")
    f_d.write('{"variants": {"": { "model":  "extratexturesblocks:block/'+l[x]+'"}}}')
    f_d.close()
    print('this file '+f+" is created")


def json_blockstates_model_loot_tables():

    textures_folder = "andesite"
    prefix_of_block_and_file = textures_folder+"_"
    list_of_blocks = ["array", "braid", "chaotic_bricks", "chaotic_medium", "chaotic_small",
    "circular", "cracked", "cracked_bricks", "cuts", "dent", "encased_bricks",
    "french_one", "french_two", "jellybean", "layers", "mosaic", "ornate",
    "panel", "pillar", "prism", "raw", "road", "slanted", "small_bricks",
    "soft_bricks", "solid_bricks", "tiles_large", "tiles_medium",
    "tiles_small", "triple_bricks", "twisted", "weaver", "zag"]

    for x in range(len(list_of_blocks)):
        block_name = prefix_of_block_and_file+list_of_blocks[x]
        file = block_name+".json"

        file_datastates = open("../src/main/resources/assets/extratexturesblock/blockstates/"+file ,"w+")
        file_model_block = open("../src/main/resources/assets/extratexturesblock/models/block/"+file ,"w+")
        file_model_item = open("../src/main/resources/assets/extratexturesblock/models/item/"+file ,"w+")
        file_data_loot_tables = open("../src/main/resources/data/extratexturesblock/loot_tables/"+file ,"w+")



        file_datastates.write('{"variants": {"": { "model":  "extratexturesblocks:block/'+block_name+'"}}}')
        file_model_block.write('{"parent": "block/cube_all","textures": {"all": "extratexturesblocks:block/'+textures_folder+'/'+list_of_blocks[x]+'"}}')
        file_model_item.write('{"parent": "extratexturesblocks:block/'+block_name+'"}')
        file_data_loot_tables.write('{"type": "minecraft:block","pools": [{"rolls": 1,"entries":[{"type": "minecraft:item","name": "extratexturesblocks:'+block_name+'"}]}]}')

        file_datastates.close()
        file_model_block.close()
        file_model_item.close()
        file_data_loot_tables.close()