

def json_blockstates_model_loot_tables():

    textures_folder = "ancient_stone"
    prefix_of_block_and_file = textures_folder+"_"
    ### list_of_blocks = ["array", "braid", "chaotic_bricks", "chaotic_medium", "chaotic_small", "circular", "cracked", "cracked_bricks", "cuts", "dent", "encased_bricks", "french_one", "french_two", "jellybean", "layers", "mosaic", "ornate", "panel", "pillar", "prism", "raw", "road", "slanted", "small_bricks", "soft_bricks", "solid_bricks", "tiles_large", "tiles_medium", "tiles_small", "triple_bricks", "twisted", "weaver", "zag"]

    # noinspection PyInterpreter
    list_of_blocks = ["tiles_large", "tiles_medium", "tiles_small", "triple_bricks", "twisted", "weaver", "zag"]

    print('reading blocks lis ')

    for x in range(len(list_of_blocks)):
        block_name = prefix_of_block_and_file+list_of_blocks[x]
        file = block_name+".json"

        print('create file of block : ' + file)

        file_datastates = open("..\\src\\main\\resources\\assets\extratexturesblocks\\blockstates\\"+file ,"w+")
        file_model_block = open("..\\src\\main\\resources\\assets\\extratexturesblocks\\models\\block\\"+file ,"w+")
        file_model_item = open("..\\src\\main\\resources\\assets\\extratexturesblocks\\models\\item\\"+file ,"w+")
        file_data_loot_tables = open("..\\src\\main\\resources\\data\\extratexturesblocks\\loot_tables\\"+file ,"w+")

        print('write file of block : ' + file)

        file_datastates.write('{"variants": {"": { "model":  "extratexturesblocks:block/'+block_name+'"}}}')
        file_model_block.write('{"parent": "block/cube_all","textures": {"all": "extratexturesblocks:block/'+textures_folder+'/'+list_of_blocks[x]+'"}}')
        file_model_item.write('{"parent": "extratexturesblocks:block/'+block_name+'"}')
        file_data_loot_tables.write('{"type": "minecraft:block","pools": [{"rolls": 1,"entries":[{"type": "minecraft:item","name": "extratexturesblocks:'+block_name+'"}]}]}')

        print('close files of block : ' + file)

        file_datastates.close()
        file_model_block.close()
        file_model_item.close()
        file_data_loot_tables.close()


print('start etb generator json file to blockstates, model of block and item, loot tables')
json_blockstates_model_loot_tables()