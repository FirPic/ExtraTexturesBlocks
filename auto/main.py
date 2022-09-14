import json


def jsonWrite(file, content):
    print('\n\ncreate file of block : ' + file)
    f=open(file, "w+")
    print('write file of block : ' + file)
    f.write(content)
    print('close files of block : ' + file)
    f.close()


def json_blockstates_model_loot_tables():

    textures_folder = input("prefix of blocks : ")
    prefix_of_block_and_file = textures_folder+"_"
    list_of_blocks = ["array", "braid", "chaotic_bricks", "chaotic_medium", "chaotic_small", "circular", "cracked", "cracked_bricks", "cuts", "dent", "encased_bricks", "french_one", "french_two", "jellybean", "layers", "mosaic", "ornate", "panel", "pillar", "prism", "raw", "road", "slanted", "small_bricks", "soft_bricks", "solid_bricks", "tiles_large", "tiles_medium", "tiles_small", "triple_bricks", "twisted", "weaver", "zag"]

    print('reading blocks list ')

    

    for x in range(len(list_of_blocks)):
        block_name = prefix_of_block_and_file+list_of_blocks[x]
        file = block_name+".json"

        

        jsonWrite("..\\src\\main\\resources\\assets\\extratexturesblocks\\blockstates\\"+file ,'{"variants": {"": { "model":  "extratexturesblocks:block/'+block_name+'"}}}')
        jsonWrite("..\\src\\main\\resources\\assets\\extratexturesblocks\\models\\block\\"+file ,'{"parent": "block/cube_all","textures": {"all": "extratexturesblocks:block/'+textures_folder+'/'+list_of_blocks[x]+'"}}')
        jsonWrite("..\\src\\main\\resources\\assets\\extratexturesblocks\\models\\item\\"+file ,'{"parent": "extratexturesblocks:block/'+block_name+'"}')
        jsonWrite("..\\src\\main\\resources\\data\\extratexturesblocks\\loot_tables\\blocks\\"+file ,'{"type": "minecraft:block","pools": [{"rolls": 1,"entries":[{"type": "minecraft:item","name": "extratexturesblocks:'+block_name+'"}]}]}')

        json_block_name(block_name)

        



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


print('start etb generator json file to blockstates, model of block and item, loot tables\n')
json_blockstates_model_loot_tables()
print('\nfinish etb generator json file to blockstates, model of block and item, loot tables')
