import org.jooq.lambda.Seq; 
import java.util.List; 
@SuppressWarnings("ALL") interface data {
//region mat 
List<String> mat =Seq.of("copper_block",
"ancient_debris",
"blaze_powder",
"blaze_rod",
"bone_block",
"chiseled_quartz_block",
"coal_block",
"diamond_block",
"emerald_block",
"gold_block",
"hay_block",
"iron_block",
"lapis_block",
"magma_block",
"nether_wart_block",
"netherite_block",
"quartz_block",
"slime_block",
"snow_block").toList();
//endregion
//region other 
List<String> other =Seq.of("allium",
"andesite",
"armor_stand",
"arrow",
"azure_bluet",
"bamboo",
"barrel",
"barrier",
"basalt",
"beacon",
"bee_nest",
"beef",
"beehive",
"beetroot",
"bell",
"black_banner",
"black_carpet",
"black_concrete",
"black_concrete_powder",
"black_glazed_terracotta",
"black_shulker_box",
"black_stained_glass_pane",
"blackstone",
"blue_banner",
"blue_carpet",
"blue_concrete",
"blue_concrete_powder",
"blue_glazed_terracotta",
"blue_ice",
"blue_orchid",
"blue_shulker_box",
"blue_stained_glass_pane",
"bone",
"bone_meal",
"book",
"bookshelf",
"bowl",
"brain_coral",
"brain_coral_fan",
"bread",
"brewing_stand",
"brick",
"bricks",
"brown_banner",
"brown_carpet",
"brown_concrete",
"brown_concrete_powder",
"brown_glazed_terracotta",
"brown_mushroom",
"brown_shulker_box",
"brown_stained_glass_pane",
"bubble_coral",
"bubble_coral_fan",
"cactus",
"carved_pumpkin",
"cauldron",
"chain",
"charcoal",
"chest",
"chicken",
"chiseled_nether_bricks",
"chiseled_polished_blackstone",
"chiseled_red_sandstone",
"chiseled_sandstone",
"chiseled_stone_bricks",
"chorus_flower",
"chorus_fruit",
"chorus_plant",
"clay",
"clay_ball",
"clock",
"coal",
"coarse_dirt",
"cobblestone",
"cobweb",
"cocoa_beans",
"cod",
"comparator",
"compass",
"composter",
"conduit",
"cookie",
"cornflower",
"cracked_nether_bricks",
"cracked_polished_blackstone_bricks",
"cracked_stone_bricks",
"creeper_banner_pattern",
"creeper_head",
"crimson_fungus",
"crimson_hyphae",
"crimson_nylium",
"crimson_roots",
"crimson_stem",
"crying_obsidian",
"cut_red_sandstone",
"cut_sandstone",
"cyan_banner",
"cyan_carpet",
"cyan_concrete",
"cyan_concrete_powder",
"cyan_glazed_terracotta",
"cyan_shulker_box",
"cyan_stained_glass_pane",
"dandelion",
"dark_prismarine",
"daylight_detector",
"dead_brain_coral",
"dead_brain_coral_fan",
"dead_bubble_coral",
"dead_bubble_coral_fan",
"dead_bush",
"dead_fire_coral",
"dead_fire_coral_fan",
"dead_horn_coral",
"dead_horn_coral_fan",
"dead_tube_coral",
"dead_tube_coral_fan",
"debug_stick",
"diamond",
"diorite",
"dirt",
"dispenser",
"dragon_breath",
"dragon_head",
"dried_kelp",
"dropper",
"elytra",
"emerald",
"enchanted_book",
"end_crystal",
"end_portal_frame",
"end_rod",
"end_stone",
"end_stone_bricks",
"ender_chest",
"ender_eye",
"ender_pearl",
"experience_bottle",
"farmland",
"feather",
"fermented_spider_eye",
"fern",
"filled_map",
"fire_charge",
"fire_coral",
"fire_coral_fan",
"firework_rocket",
"firework_star",
"flint",
"flower_banner_pattern",
"flower_pot",
"ghast_tear",
"gilded_blackstone",
"glass",
"glass_bottle",
"glass_pane",
"glistering_melon_slice",
"globe_banner_pattern",
"glowstone",
"glowstone_dust",
"granite",
"grass",
"grass_block",
"gravel",
"gray_banner",
"gray_carpet",
"gray_concrete",
"gray_concrete_powder",
"gray_glazed_terracotta",
"gray_shulker_box",
"gray_stained_glass_pane",
"green_banner",
"green_carpet",
"green_concrete",
"green_concrete_powder",
"green_glazed_terracotta",
"green_shulker_box",
"green_stained_glass_pane",
"grindstone",
"gunpowder",
"heart_of_the_sea",
"honey_block",
"honey_bottle",
"honeycomb",
"honeycomb_block",
"hopper",
"horn_coral",
"horn_coral_fan",
"ice",
"infested_chiseled_stone_bricks",
"infested_cobblestone",
"infested_cracked_stone_bricks",
"infested_mossy_stone_bricks",
"infested_stone",
"infested_stone_bricks",
"ink_sac",
"iron_bars",
"item_frame",
"jigsaw",
"kelp",
"ladder",
"lantern",
"lapis_lazuli",
"large_fern",
"lead",
"leather",
"lectern",
"light_blue_banner",
"light_blue_carpet",
"light_blue_concrete",
"light_blue_concrete_powder",
"light_blue_glazed_terracotta",
"light_blue_shulker_box",
"light_blue_stained_glass_pane",
"light_gray_banner",
"light_gray_carpet",
"light_gray_concrete",
"light_gray_concrete_powder",
"light_gray_glazed_terracotta",
"light_gray_shulker_box",
"light_gray_stained_glass_pane",
"lilac",
"lily_of_the_valley",
"lily_pad",
"lime_banner",
"lime_carpet",
"lime_concrete",
"lime_concrete_powder",
"lime_glazed_terracotta",
"lime_shulker_box",
"lime_stained_glass_pane",
"lodestone",
"loom",
"magenta_banner",
"magenta_carpet",
"magenta_concrete",
"magenta_concrete_powder",
"magenta_glazed_terracotta",
"magenta_shulker_box",
"magenta_stained_glass_pane",
"magma_cream",
"map",
"melon",
"melon_slice",
"mojang_banner_pattern",
"mossy_cobblestone",
"mossy_stone_bricks",
"mushroom_stem",
"mushroom_stew",
"mutton",
"mycelium",
"nautilus_shell",
"nether_brick",
"nether_bricks",
"nether_sprouts",
"nether_star",
"nether_wart",
"netherite_scrap",
"netherrack",
"note_block",
"observer",
"obsidian",
"orange_banner",
"orange_carpet",
"orange_concrete",
"orange_concrete_powder",
"orange_glazed_terracotta",
"orange_shulker_box",
"orange_stained_glass_pane",
"orange_tulip",
"oxeye_daisy",
"packed_ice",
"painting",
"paper",
"peony",
"phantom_membrane",
"piglin_banner_pattern",
"pink_banner",
"pink_carpet",
"pink_concrete",
"pink_concrete_powder",
"pink_glazed_terracotta",
"pink_shulker_box",
"pink_stained_glass_pane",
"pink_tulip",
"piston",
"player_head",
"podzol",
"poisonous_potato",
"polished_andesite",
"polished_basalt",
"polished_blackstone",
"polished_blackstone_bricks",
"polished_diorite",
"polished_granite",
"popped_chorus_fruit",
"poppy",
"porkchop",
"potato",
"prismarine",
"prismarine_bricks",
"prismarine_crystals",
"prismarine_shard",
"pufferfish",
"pumpkin",
"pumpkin_pie",
"purple_banner",
"purple_carpet",
"purple_concrete",
"purple_concrete_powder",
"purple_glazed_terracotta",
"purple_shulker_box",
"purple_stained_glass_pane",
"purpur_block",
"purpur_pillar",
"quartz",
"quartz_bricks",
"quartz_pillar",
"rabbit",
"rabbit_foot",
"rabbit_hide",
"rabbit_stew",
"red_banner",
"red_carpet",
"red_concrete",
"red_concrete_powder",
"red_glazed_terracotta",
"red_mushroom",
"red_nether_bricks",
"red_sand",
"red_sandstone",
"red_shulker_box",
"red_stained_glass_pane",
"red_tulip",
"repeater",
"respawn_anchor",
"rose_bush",
"rotten_flesh",
"saddle",
"salmon",
"sand",
"sandstone",
"scaffolding",
"scute",
"sea_pickle",
"seagrass",
"shears",
"shield",
"shroomlight",
"shulker_box",
"shulker_shell",
"skeleton_skull",
"skull_banner_pattern",
"slime_ball",
"smooth_quartz",
"smooth_red_sandstone",
"smooth_sandstone",
"smooth_stone",
"snow",
"snowball",
"soul_campfire",
"soul_sand",
"soul_soil",
"spawner",
"spectral_arrow",
"spider_eye",
"sponge",
"stick",
"sticky_piston",
"stone",
"stone_bricks",
"stonecutter",
"string",
"stripped_crimson_hyphae",
"stripped_crimson_stem",
"stripped_warped_hyphae",
"stripped_warped_stem",
"sugar",
"sugar_cane",
"sunflower",
"suspicious_stew",
"sweet_berries",
"tall_grass",
"target",
"tipped_arrow",
"totem_of_undying",
"trapped_chest",
"tripwire_hook",
"tropical_fish",
"tube_coral",
"tube_coral_fan",
"twisting_vines",
"wet_sponge",
"white_banner",
"white_carpet",
"white_concrete",
"white_concrete_powder",
"white_glazed_terracotta",
"white_shulker_box",
"white_stained_glass_pane",
"white_tulip",
"wither_rose",
"wither_skeleton_skull",
"writable_book",
"written_book",
"yellow_banner",
"yellow_carpet",
"yellow_concrete",
"yellow_concrete_powder",
"yellow_glazed_terracotta",
"yellow_shulker_box",
"yellow_stained_glass_pane",
"zombie_head",
"tuff",
"raw_copper_block",
"raw_iron_block",
"deepslate",
"chiseled_deepslate",
"polished_deepslate",
"deepslate_bricks",
"deepslate_tiles",
"cracked_deepslate_bricks",
"cracked_deepslate_tiles",
"calcite",
"recovery_compass",
"echo_shard",
"amethyst_shard",
"amethyst_block",
"amethyst_cluster",
"mud_bricks",
"packed_mud",
"muddy_mangrove_roots",
"mud",
"sculk_catalyst",
"sculk_shrieker",
"sculk_vein",
"sculk",
"frogspawn",
"mangrove_roots").toList();
//endregion
//region item 
List<String> item =Seq.of("anvil",
"black_bed",
"blast_furnace",
"blue_bed",
"brown_bed",
"cartography_table",
"chipped_anvil",
"crafting_table",
"cyan_bed",
"damaged_anvil",
"enchanting_table",
"fletching_table",
"furnace",
"gray_bed",
"green_bed",
"jukebox",
"light_blue_bed",
"light_gray_bed",
"lime_bed",
"magenta_bed",
"name_tag",
"orange_bed",
"pink_bed",
"purple_bed",
"red_bed",
"smithing_table",
"smoker",
"white_bed",
"yellow_bed").toList();
//endregion
//region potion 
List<String> potion =Seq.of("lingering_potion",
"potion",
"splash_potion").toList();
//endregion
//region ore 
List<String> ore =Seq.of("coal_ore",
"diamond_ore",
"emerald_ore",
"gold_ingot",
"gold_nugget",
"gold_ore",
"iron_ingot",
"iron_nugget",
"iron_ore",
"lapis_ore",
"nether_gold_ore",
"nether_quartz_ore",
"netherite_ingot",
"deepslate_redstone_ore",
"deepslate_copper_ore",
"deepslate_iron_ore",
"deepslate_gold_ore",
"deepslate_lapis_ore",
"deepslate_diamond_ore",
"deepslate_coal_ore",
"deepslate_emerald_ore").toList();
//endregion
//region terracotta 
List<String> terracotta =Seq.of("black_terracotta",
"blue_terracotta",
"brown_terracotta",
"cyan_terracotta",
"gray_terracotta",
"green_terracotta",
"light_blue_terracotta",
"light_gray_terracotta",
"lime_terracotta",
"magenta_terracotta",
"orange_terracotta",
"pink_terracotta",
"purple_terracotta",
"red_terracotta",
"terracotta",
"white_terracotta",
"yellow_terracotta").toList();
//endregion
//region spawn_egg 
List<String> spawn_egg =Seq.of("bat_spawn_egg",
"bee_spawn_egg",
"blaze_spawn_egg",
"cat_spawn_egg",
"cave_spider_spawn_egg",
"chicken_spawn_egg",
"cod_spawn_egg",
"cow_spawn_egg",
"creeper_spawn_egg",
"dolphin_spawn_egg",
"donkey_spawn_egg",
"drowned_spawn_egg",
"elder_guardian_spawn_egg",
"enderman_spawn_egg",
"endermite_spawn_egg",
"evoker_spawn_egg",
"fox_spawn_egg",
"ghast_spawn_egg",
"guardian_spawn_egg",
"hoglin_spawn_egg",
"horse_spawn_egg",
"husk_spawn_egg",
"llama_spawn_egg",
"magma_cube_spawn_egg",
"mooshroom_spawn_egg",
"mule_spawn_egg",
"ocelot_spawn_egg",
"panda_spawn_egg",
"parrot_spawn_egg",
"phantom_spawn_egg",
"pig_spawn_egg",
"piglin_brute_spawn_egg",
"piglin_spawn_egg",
"pillager_spawn_egg",
"polar_bear_spawn_egg",
"pufferfish_spawn_egg",
"rabbit_spawn_egg",
"ravager_spawn_egg",
"salmon_spawn_egg",
"sheep_spawn_egg",
"shulker_spawn_egg",
"silverfish_spawn_egg",
"skeleton_horse_spawn_egg",
"skeleton_spawn_egg",
"slime_spawn_egg",
"spider_spawn_egg",
"squid_spawn_egg",
"stray_spawn_egg",
"strider_spawn_egg",
"trader_llama_spawn_egg",
"tropical_fish_spawn_egg",
"turtle_spawn_egg",
"vex_spawn_egg",
"villager_spawn_egg",
"vindicator_spawn_egg",
"wandering_trader_spawn_egg",
"witch_spawn_egg",
"wither_skeleton_spawn_egg",
"wolf_spawn_egg",
"zoglin_spawn_egg",
"zombie_horse_spawn_egg",
"zombie_spawn_egg",
"zombie_villager_spawn_egg",
"zombified_piglin_spawn_egg").toList();
//endregion
//region bio 
List<String> bio =Seq.of("acacia_leaves",
"acacia_log",
"acacia_planks",
"acacia_sapling",
"acacia_wood",
"beetroot_seeds",
"birch_leaves",
"birch_log",
"birch_planks",
"birch_sapling",
"birch_wood",
"black_wool",
"blue_wool",
"brain_coral_block",
"brown_mushroom_block",
"brown_wool",
"bubble_coral_block",
"crimson_planks",
"cyan_wool",
"dark_oak_leaves",
"dark_oak_log",
"dark_oak_planks",
"dark_oak_sapling",
"dark_oak_wood",
"dead_brain_coral_block",
"dead_bubble_coral_block",
"dead_fire_coral_block",
"dead_horn_coral_block",
"dead_tube_coral_block",
"dragon_egg",
"dried_kelp_block",
"egg",
"fire_coral_block",
"gray_wool",
"green_wool",
"horn_coral_block",
"jungle_leaves",
"jungle_log",
"jungle_planks",
"jungle_sapling",
"jungle_wood",
"light_blue_wool",
"light_gray_wool",
"lime_wool",
"magenta_wool",
"melon_seeds",
"oak_leaves",
"oak_log",
"oak_planks",
"oak_sapling",
"oak_wood",
"orange_wool",
"pink_wool",
"pumpkin_seeds",
"purple_wool",
"red_mushroom_block",
"red_wool",
"spruce_leaves",
"spruce_log",
"spruce_planks",
"spruce_sapling",
"spruce_wood",
"stripped_acacia_log",
"stripped_acacia_wood",
"stripped_birch_log",
"stripped_birch_wood",
"stripped_dark_oak_log",
"stripped_dark_oak_wood",
"stripped_jungle_log",
"stripped_jungle_wood",
"stripped_oak_log",
"stripped_oak_wood",
"stripped_spruce_log",
"stripped_spruce_wood",
"tube_coral_block",
"turtle_egg",
"vine",
"warped_button",
"warped_door",
"warped_fence",
"warped_fungus",
"warped_hyphae",
"warped_nylium",
"warped_planks",
"warped_roots",
"warped_sign",
"warped_slab",
"warped_stairs",
"warped_stem",
"warped_trapdoor",
"warped_wart_block",
"weeping_vines",
"wheat",
"wheat_seeds",
"white_wool",
"yellow_wool",
"goat_horn",
"mangrove_log",
"stripped_mangrove_log",
"mangrove_leaves",
"mangrove_propagule",
"mangrove_planks",
"stripped_mangrove_wood",
"mangrove_wood").toList();
//endregion
//region transport 
List<String> transport =Seq.of("acacia_boat",
"activator_rail",
"birch_boat",
"chest_minecart",
"dark_oak_boat",
"detector_rail",
"furnace_minecart",
"hopper_minecart",
"jungle_boat",
"minecart",
"oak_boat",
"powered_rail",
"rail",
"spruce_boat",
"tnt_minecart",
"oak_chest_boat",
"spruce_chest_boat",
"birch_chest_boat",
"jungle_chest_boat",
"acacia_chest_boat",
"dark_oak_chest_boat",
"mangrove_chest_boat",
"mangrove_boat").toList();
//endregion
//region building 
List<String> building =Seq.of("acacia_door",
"acacia_fence",
"acacia_fence_gate",
"acacia_sign",
"acacia_slab",
"acacia_stairs",
"acacia_trapdoor",
"andesite_slab",
"andesite_stairs",
"andesite_wall",
"birch_door",
"birch_fence",
"birch_fence_gate",
"birch_sign",
"birch_slab",
"birch_stairs",
"birch_trapdoor",
"black_stained_glass",
"blackstone_slab",
"blackstone_stairs",
"blackstone_wall",
"blue_stained_glass",
"brick_slab",
"brick_stairs",
"brick_wall",
"brown_stained_glass",
"cobblestone_slab",
"cobblestone_stairs",
"cobblestone_wall",
"crimson_door",
"crimson_fence",
"crimson_fence_gate",
"crimson_sign",
"crimson_slab",
"crimson_stairs",
"crimson_trapdoor",
"cut_red_sandstone_slab",
"cut_sandstone_slab",
"cyan_stained_glass",
"dark_oak_door",
"dark_oak_fence",
"dark_oak_fence_gate",
"dark_oak_sign",
"dark_oak_slab",
"dark_oak_stairs",
"dark_oak_trapdoor",
"dark_prismarine_slab",
"dark_prismarine_stairs",
"diorite_slab",
"diorite_stairs",
"diorite_wall",
"end_stone_brick_slab",
"end_stone_brick_stairs",
"end_stone_brick_wall",
"granite_slab",
"granite_stairs",
"granite_wall",
"gray_stained_glass",
"green_stained_glass",
"iron_door",
"iron_trapdoor",
"jungle_door",
"jungle_fence",
"jungle_fence_gate",
"jungle_sign",
"jungle_slab",
"jungle_stairs",
"jungle_trapdoor",
"light_blue_stained_glass",
"light_gray_stained_glass",
"lime_stained_glass",
"magenta_stained_glass",
"mossy_cobblestone_slab",
"mossy_cobblestone_stairs",
"mossy_cobblestone_wall",
"mossy_stone_brick_slab",
"mossy_stone_brick_stairs",
"mossy_stone_brick_wall",
"nether_brick_fence",
"nether_brick_slab",
"nether_brick_stairs",
"nether_brick_wall",
"oak_door",
"oak_fence",
"oak_fence_gate",
"oak_sign",
"oak_slab",
"oak_stairs",
"oak_trapdoor",
"orange_stained_glass",
"petrified_oak_slab",
"pink_stained_glass",
"polished_andesite_slab",
"polished_andesite_stairs",
"polished_blackstone_brick_slab",
"polished_blackstone_brick_stairs",
"polished_blackstone_brick_wall",
"polished_blackstone_slab",
"polished_blackstone_stairs",
"polished_blackstone_wall",
"polished_diorite_slab",
"polished_diorite_stairs",
"polished_granite_slab",
"polished_granite_stairs",
"prismarine_brick_slab",
"prismarine_brick_stairs",
"prismarine_slab",
"prismarine_stairs",
"prismarine_wall",
"purple_stained_glass",
"purpur_slab",
"purpur_stairs",
"quartz_slab",
"quartz_stairs",
"red_nether_brick_slab",
"red_nether_brick_stairs",
"red_nether_brick_wall",
"red_sandstone_slab",
"red_sandstone_stairs",
"red_sandstone_wall",
"red_stained_glass",
"sandstone_slab",
"sandstone_stairs",
"sandstone_wall",
"smooth_quartz_slab",
"smooth_quartz_stairs",
"smooth_red_sandstone_slab",
"smooth_red_sandstone_stairs",
"smooth_sandstone_slab",
"smooth_sandstone_stairs",
"smooth_stone_slab",
"spruce_door",
"spruce_fence",
"spruce_fence_gate",
"spruce_sign",
"spruce_slab",
"spruce_stairs",
"spruce_trapdoor",
"stone_brick_slab",
"stone_brick_stairs",
"stone_brick_wall",
"stone_slab",
"stone_stairs",
"warped_fence_gate",
"white_stained_glass",
"yellow_stained_glass",
"deepslate_brick_slab",
"deepslate_brick_wall",
"deepslate_brick_stairs",
"deepslate_tile_wall",
"deepslate_tile_slab",
"deepslate_tile_stairs",
"deepslate_slab",
"deepslate_stairs",
"deepslate_wall",
"mud_brick_slab",
"mud_brick_stairs",
"mud_brick_wall",
"mangrove_door",
"mangrove_fence",
"mangrove_fence_gate",
"mangrove_sign",
"mangrove_slab",
"mangrove_stairs",
"mangrove_trapdoor").toList();
//endregion
//region food 
List<String> food =Seq.of("apple",
"baked_potato",
"beetroot_soup",
"cake",
"carrot",
"cooked_beef",
"cooked_chicken",
"cooked_cod",
"cooked_mutton",
"cooked_porkchop",
"cooked_rabbit",
"cooked_salmon",
"enchanted_golden_apple",
"golden_apple",
"golden_carrot").toList();
//endregion
//region equi 
List<String> equi =Seq.of("bow",
"carrot_on_a_stick",
"chainmail_boots",
"chainmail_chestplate",
"chainmail_helmet",
"chainmail_leggings",
"crossbow",
"diamond_axe",
"diamond_boots",
"diamond_chestplate",
"diamond_helmet",
"diamond_hoe",
"diamond_horse_armor",
"diamond_leggings",
"diamond_pickaxe",
"diamond_shovel",
"diamond_sword",
"fishing_rod",
"flint_and_steel",
"golden_axe",
"golden_boots",
"golden_chestplate",
"golden_helmet",
"golden_hoe",
"golden_horse_armor",
"golden_leggings",
"golden_pickaxe",
"golden_shovel",
"golden_sword",
"iron_axe",
"iron_boots",
"iron_chestplate",
"iron_helmet",
"iron_hoe",
"iron_horse_armor",
"iron_leggings",
"iron_pickaxe",
"iron_shovel",
"iron_sword",
"leather_boots",
"leather_chestplate",
"leather_helmet",
"leather_horse_armor",
"leather_leggings",
"netherite_axe",
"netherite_boots",
"netherite_chestplate",
"netherite_helmet",
"netherite_hoe",
"netherite_leggings",
"netherite_pickaxe",
"netherite_shovel",
"netherite_sword",
"stone_axe",
"stone_hoe",
"stone_pickaxe",
"stone_shovel",
"stone_sword",
"trident",
"turtle_helmet",
"warped_fungus_on_a_stick",
"wooden_axe",
"wooden_hoe",
"wooden_pickaxe",
"wooden_shovel",
"wooden_sword").toList();
//endregion
//region bucket 
List<String> bucket =Seq.of("bucket",
"cod_bucket",
"lava_bucket",
"milk_bucket",
"pufferfish_bucket",
"salmon_bucket",
"tropical_fish_bucket",
"water_bucket",
"axolotl_bucket",
"tadpole_bucket").toList();
//endregion
//region dye 
List<String> dye =Seq.of("black_dye",
"blue_dye",
"brown_dye",
"cyan_dye",
"gray_dye",
"green_dye",
"light_blue_dye",
"light_gray_dye",
"lime_dye",
"magenta_dye",
"orange_dye",
"pink_dye",
"purple_dye",
"red_dye",
"white_dye",
"yellow_dye").toList();
//endregion
//region light 
List<String> light =Seq.of("campfire",
"jack_o_lantern",
"sea_lantern",
"soul_lantern",
"soul_torch",
"torch",
"ochre_froglight",
"verdant_froglight",
"pearlescent_froglight").toList();
//endregion
//region ignore 
List<String> ignore =Seq.of("air",
"bedrock",
"chain_command_block",
"command_block",
"command_block_minecart",
"knowledge_book",
"music_disc_11",
"music_disc_13",
"music_disc_blocks",
"music_disc_cat",
"music_disc_chirp",
"music_disc_far",
"music_disc_mall",
"music_disc_mellohi",
"music_disc_pigstep",
"music_disc_stal",
"music_disc_strad",
"music_disc_wait",
"music_disc_ward",
"repeating_command_block",
"structure_block",
"structure_void",
"music_disc_otherside",
"disc_fragment_5").toList();
//endregion
//region redstone 
List<String> redstone =Seq.of("acacia_button",
"acacia_pressure_plate",
"birch_button",
"birch_pressure_plate",
"crimson_button",
"crimson_pressure_plate",
"dark_oak_button",
"dark_oak_pressure_plate",
"heavy_weighted_pressure_plate",
"jungle_button",
"jungle_pressure_plate",
"lever",
"light_weighted_pressure_plate",
"oak_button",
"oak_pressure_plate",
"polished_blackstone_button",
"polished_blackstone_pressure_plate",
"redstone",
"redstone_block",
"redstone_lamp",
"redstone_ore",
"redstone_torch",
"spruce_button",
"spruce_pressure_plate",
"stone_button",
"stone_pressure_plate",
"tnt",
"warped_pressure_plate",
"mangrove_button",
"mangrove_pressure_plate").toList();
//endregion
}