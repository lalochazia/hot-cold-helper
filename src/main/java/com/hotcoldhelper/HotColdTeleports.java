/*
 * Copyright (c) 2025, Lalochazia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.hotcoldhelper;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
public enum HotColdTeleports {
    ARDOUGNE_DIARY_CAPE(new WorldPoint(2573, 3324, 0), "Ardougne", "Diary Cape","DIA 1",false,new int[]{19476,13069}),
    DESERT_DIARY_CAPE(new WorldPoint(3300, 3121, 0), "Desert", "Diary Cape","DIA 2",false,new int[]{19476,13069}),
    FALADOR_DIARY_CAPE(new WorldPoint(2977, 3346, 0), "Falador", "Diary Cape","DIA 3",false,new int[]{19476,13069}),
    FREMENNIK_DIARY_CAPE(new WorldPoint(2659, 3627, 0), "Fremennik", "Diary Cape","DIA 4",false,new int[]{19476,13069}),
    KANDARIN_DIARY_CAPE(new WorldPoint(2743, 3445, 0), "Kandarin", "Diary Cape","DIA 5",false,new int[]{19476,13069}),
    KARAMJA_JACKIE_DIARY_CAPE(new WorldPoint(2809, 3192, 0), "Karamja (Jackie)", "Diary Cape","DIA 6",false,new int[]{19476,13069}),
    KARAMJA_FORESTER_DIARY_CAPE(new WorldPoint(2796, 2944, 0), "Karamja (Forester)", "Diary Cape","DIA 8",false,new int[]{19476,13069}),
    KOUREND_DIARY_CAPE(new WorldPoint(1647, 3667, 0), "Kourend", "Diary Cape","DIA A",false,new int[]{19476,13069}),
    LUMBRIDGE_DIARY_CAPE(new WorldPoint(3240, 3219, 0), "Lumbridge", "Diary Cape","DIA B",false,new int[]{19476,13069}),
    MORYTANIA_DIARY_CAPE(new WorldPoint(3464, 3476, 0), "Morytania", "Diary Cape","DIA C",false,new int[]{19476,13069}),
    VARROCK_DIARY_CAPE(new WorldPoint(3225, 3413, 0), "Varrock", "Diary Cape","DIA D",false,new int[]{19476,13069}),
    WILDERNESS_DIARY_CAPE(new WorldPoint(3121, 3515, 0), "Wilderness", "Diary Cape","DIA E",false,new int[]{19476,13069}),
    WESTERN_PROVINCES_DIARY_CAPE(new WorldPoint(2466, 3459, 0), "Western Provinces", "Diary Cape","DIA F",false,new int[]{19476,13069}),
    TWIGGY_DIARY_CAPE(new WorldPoint(3097, 3226, 0), "Twiggy", "Diary Cape","DIA G",false,new int[]{19476,13069}),
    LUMBRIDGE_STANDARD(new WorldPoint(3220, 3218, 0), "Lumbridge", "Standard","STANDARD",false,-1),
    VARROCK_STANDARD(new WorldPoint(3211, 3427, 0), "Varrock", "Standard","STANDARD",false,-1),
    FALADOR_STANDARD(new WorldPoint(2965, 3378, 0), "Falador", "Standard","STANDARD",false,-1),
    CAMELOT_STANDARD(new WorldPoint(2757, 3478, 0), "Camelot", "Standard","STANDARD",false,-1),
    SEERS_VILLAGE_STANDARD(new WorldPoint(2726, 3484, 0), "Seers' Village", "Standard","STANDARD",false,-1),
    KOUREND_STANDARD(new WorldPoint(1641, 3673, 0), "Kourend", "Standard","STANDARD",false,-1),
    ARDOUGNE_STANDARD(new WorldPoint(2660, 3301, 0), "Ardougne", "Standard","STANDARD",false,-1),
    CIVITAS_ILLA_FORTIS_STANDARD(new WorldPoint(1680, 3134, 0), "Civitas illa Fortis", "Standard","STANDARD",false,-1),
    YANILLE_STANDARD(new WorldPoint(2583, 3097, 0), "Yanille", "Standard","STANDARD",false,-1),
    TROLLHEIM_STANDARD(new WorldPoint(2890, 3679, 0), "Trollheim", "Standard","STANDARD",false,-1),
    APE_ATOLL_STANDARD(new WorldPoint(2799, 2792, 0), "Ape Atoll", "Standard","STANDARD",false,-1),
    SENNTISTEN_ANCIENTS(new WorldPoint(3323, 3334, 0), "Senntisten", "Ancients","ANCIENT",false,-1),
    KHARYLL_ANCIENTS(new WorldPoint(3492, 3471, 0), "Kharyll", "Ancients","ANCIENT",false,-1),
    LASSAR_ANCIENTS(new WorldPoint(3004, 3470, 0), "Lassar", "Ancients","ANCIENT",false,-1),
    DAREEYAK_ANCIENTS(new WorldPoint(2969, 3697, 0), "Dareeyak", "Ancients","ANCIENT",true,-1),
    CARRALLANGER_ANCIENTS(new WorldPoint(3159, 3667, 0), "Carrallanger", "Ancients","ANCIENT",true,-1),
    ANNAKARL_ANCIENTS(new WorldPoint(3287, 3886, 0), "Annakarl", "Ancients","ANCIENT",true,-1),
    GHORROCK_ANCIENTS(new WorldPoint(2976, 3872, 0), "Ghorrock", "Ancients","ANCIENT",true,-1),
    MOONCLAN_LUNARS(new WorldPoint(2114, 3898, 0), "Moonclan", "Lunars","LUNAR",false,-1),
    OURANIA_LUNARS(new WorldPoint(2466, 3246, 0), "Ourania", "Lunars","LUNAR",false,-1),
    WATERBIRTH_LUNARS(new WorldPoint(2545, 3755, 0), "Waterbirth", "Lunars","LUNAR",false,-1),
    BARBARIAN_LUNARS(new WorldPoint(2541, 3568, 0), "Barbarian", "Lunars","LUNAR",false,-1),
    KHAZARD_LUNARS(new WorldPoint(2635, 3168, 0), "Khazard", "Lunars","LUNAR",false,-1),
    FISHING_GUILD_LUNARS(new WorldPoint(2604, 3401, 0), "Fishing Guild", "Lunars","LUNAR",false,-1),
    CATHERBY_LUNARS(new WorldPoint(2801, 3449, 0), "Catherby", "Lunars","LUNAR",false,-1),
    ICE_PLATEAU_LUNARS(new WorldPoint(2972, 3916, 0), "Ice Plateau", "Lunars","LUNAR",true,-1),
    ARCEUUS_LIBRARY_ARCEUUS(new WorldPoint(1631, 3833, 0), "Arceuus Library", "Arceuus","ARC",false,-1),
    DRAYNOR_MANOR_ARCEUUS(new WorldPoint(3108, 3351, 0), "Draynor Manor", "Arceuus","ARC",false,-1),
    BATTLEFRONT_ARCEUUS(new WorldPoint(1348, 3739, 0), "Battlefront", "Arceuus","ARC",false,-1),
    MIND_ALTAR_ARCEUUS(new WorldPoint(2979, 3509, 0), "Mind Altar", "Arceuus","ARC",false,-1),
    SALVE_GRAVEYARD_ARCEUUS(new WorldPoint(3432, 3460, 0), "Salve Graveyard", "Arceuus","ARC",false,-1),
    FENKENSTRAINS_CASTLE_ARCEUUS(new WorldPoint(3546, 3528, 0), "Fenkenstrains Castle", "Arceuus","ARC",false,-1),
    WEST_ARDOUGNE_ARCEUUS(new WorldPoint(2500, 3291, 0), "West Ardougne", "Arceuus","ARC",false,-1),
    HARMONY_ISLAND_ARCEUUS(new WorldPoint(3796, 2867, 0), "Harmony Island", "Arceuus","ARC",false,-1),
    CEMETERY_ARCEUUS(new WorldPoint(2980, 3763, 0), "Cemetery", "Arceuus","ARC",true,-1),
    BARROWS_ARCEUUS(new WorldPoint(3565, 3311, 0), "Barrows", "Arceuus","ARC",false,-1),
    APE_ATOLL_ARCEUUS(new WorldPoint(2764, 2704, 0), "Ape Atoll", "Arceuus","ARC",false,-1),
    NARDAH_MASTER_SCROLL_BOX(new WorldPoint(3420, 2917, 0), "Nardah", "Master Scroll Book","MSB NAR",false,21389),
    DIGSITE_MASTER_SCROLL_BOX(new WorldPoint(3325, 3412, 0), "Digsite", "Master Scroll Book","MSB DIGS",false,21389),
    FELDIP_HILLS_MASTER_SCROLL_BOX(new WorldPoint(2541, 2925, 0), "Feldip Hills", "Master Scroll Book","MSB FELD",false,21389),
    LUNAR_ISLE_MASTER_SCROLL_BOX(new WorldPoint(2094, 3913, 0), "Lunar Isle", "Master Scroll Book","MSB LUNAR",false,21389),
    MORTTON_MASTER_SCROLL_BOX(new WorldPoint(3489, 3287, 0), "Mort'ton", "Master Scroll Book","MSB MORT",false,21389),
    PEST_CONTROL_MASTER_SCROLL_BOX(new WorldPoint(2658, 2659, 0), "Pest Control", "Master Scroll Book","MSB PEST",false,21389),
    PISCATORIS_MASTER_SCROLL_BOX(new WorldPoint(2339, 3649, 0), "Piscatoris", "Master Scroll Book","MSB PISC",false,21389),
    TAI_BWO_WANNAI_MASTER_SCROLL_BOX(new WorldPoint(2789, 3066, 0), "Tai Bwo Wannai", "Master Scroll Book","MSB TAI",false,21389),
    IORWERTH_CAMP_MASTER_SCROLL_BOX(new WorldPoint(2194, 3258, 0), "Iorwerth Camp", "Master Scroll Book","MSB IORW",false,21389),
    MOS_LE_HARMLESS_MASTER_SCROLL_BOX(new WorldPoint(3701, 2996, 0), "Mos Le'Harmless", "Master Scroll Book","MSB MOS LE",false,21389),
    LUMBERYARD_MASTER_SCROLL_BOX(new WorldPoint(3302, 3487, 0), "Lumberyard", "Master Scroll Book","MSB LUMB",false,21389),
    ZUL_ANDRA_MASTER_SCROLL_BOX(new WorldPoint(2196, 3056, 0), "Zul-Andra", "Master Scroll Book","MSB ZUL",false,21389),
    REVENANT_CAVE_MASTER_SCROLL_BOX(new WorldPoint(3128, 3832, 0), "Revenant Cave", "Master Scroll Book","REV CAVE",true,21389),
    WATSON_MASTER_SCROLL_BOX(new WorldPoint(1645, 3579, 0), "Watson", "Master Scroll Book","MSB WATSON",false,21389),
    CRAFTING_GUILD_CRAFTING_CAPE(new WorldPoint(2931, 3286, 0), "Crafting Guild", "Crafting Cape","MAX 3",false,new int[]{13280,9780,9781}),
    FISHING_GUILD_FISHING_CAPE(new WorldPoint(2604, 3401, 0), "Fishing Guild", "Fishing Cape","MAX 2",false,new int[]{13280,9798,9799}),
    OTTO_GROTTO_FISHING_CAPE(new WorldPoint(2504, 3484, 0), "Otto's Grotto", "Fishing Cape","MAX 5",false,new int[]{13280,9798,9799}),
    FARMING_GUILD_FARMING_CAPE(new WorldPoint(1249, 3724, 0), "Farming Guild", "Farming Cape","MAX 4",false,new int[]{13280,9810,9811}),
    RED_CHINCHOMPAS_HUNTER_CAPE(new WorldPoint(2556, 2918, 0), "Red Chinchompas", "Hunter Cape","MAX 6",false,new int[]{13280,9948,9949}),
    BLACK_CHINCHOMPAS_HUNTER_CAPE(new WorldPoint(3144, 3772, 0), "Black Chinchompas", "Hunter Cape","MAX 7",true,new int[]{13280,9948,9949}),
    HUNTER_GUILD_HUNTER_CAPE(new WorldPoint(1577, 3046, 0), "Hunter Guild", "Hunter Cape","MAX 8",false,new int[]{13280,9948,9949}),
    WARRIOR_GUILD_STRENGTH_CAPE(new WorldPoint(2865, 3546, 0), "Warrior's Guild", "Strength Cape","MAX 1",false,new int[]{13280,9750,9751}),
    LEGEND_GUILD_QP_CAPE(new WorldPoint(2729, 3348, 0), "Legend's Guild", "QP Cape","QPC",false,new int[]{13068,9813}),
    FALO_MUSIC_CAPE(new WorldPoint(2689, 3547, 0), "Falo", "Music Cape","MUSIC",false,new int[]{13221,13222}),
    BARBARIAN_ASSAULT_GAMES_NECKLACE(new WorldPoint(2519, 3571, 0), "Barbarian Outpost", "Games Necklace","BOX 6",false,new int[]{3853,3855,3857,3859,3861,3863,3865,3867}),
    BURTHORPE_GAMES_NECKLACE(new WorldPoint(2898, 3553, 0), "Burthorpe", "Games Necklace","BOX 5",false,new int[]{3853,3855,3857,3859,3861,3863,3865,3867}),
    WINTERTODT_CAMP_GAMES_NECKLACE(new WorldPoint(1631, 3940, 0), "Wintertodt Camp", "Games Necklace","BOX 9",false,new int[]{3853,3855,3857,3859,3861,3863,3865,3867}),
    EMIR_ARENA_RING_OF_DUELING(new WorldPoint(3316, 3235, 0), "Emir's Arena", "Ring of Dueling","BOX 1",false,new int[]{2552,2554,2556,2558,2560,2562,2564,2566}),
    FEROX_ENCLAVE_RING_OF_DUELING(new WorldPoint(3150, 3634, 0), "Ferox Enclave", "Ring of Dueling","BOX 3",false,new int[]{2552,2554,2556,2558,2560,2562,2564,2566}),
    CASTLE_WARS_RING_OF_DUELING(new WorldPoint(2440, 3090, 0), "Castle Wars", "Ring of Dueling","BOX 2",false,new int[]{2552,2554,2556,2558,2560,2562,2564,2566}),
    FORTIS_COLOSSEUM_RING_OF_DUELING(new WorldPoint(1791, 3106, 0), "Fortis Colosseum", "Ring of Dueling","BOX 4",false,new int[]{2552,2554,2556,2558,2560,2562,2564,2566}),
    WARRIORS_GUILD_COMBAT_BRACELET(new WorldPoint(2881, 3546, 0), "Warriors' Guild", "Combat Bracelet","BOX A",false,new int[]{11972,11974,11118,11120,11122,11124}),
    CHAMPIONS_GUILD_COMBAT_BRACELET(new WorldPoint(3191, 3336, 0), "Champions' Guild", "Combat Bracelet","BOX B",false,new int[]{11972,11974,11118,11120,11122,11124}),
    EDGEVILLE_MONASTERY_COMBAT_BRACELET(new WorldPoint(3052, 3487, 0), "Edgeville Monastery", "Combat Bracelet","BOX C",false,new int[]{11972,11974,11118,11120,11122,11124}),
    RANGING_GUILD_COMBAT_BRACELET(new WorldPoint(2655, 3442, 0), "Ranging Guild", "Combat Bracelet","BOX D",false,new int[]{11972,11974,11118,11120,11122,11124}),
    FISHING_GUILD_SKILLS_NECKLACE(new WorldPoint(2611, 3390, 0), "Fishing Guild", "Skills Necklace","BOX E",false,new int[]{11968,11970,11105,11107,11109,11111}),
    CRAFTING_GUILD_SKILLS_NECKLACE(new WorldPoint(2932, 3294, 0), "Crafting Guild", "Skills Necklace","BOX G",false,new int[]{11968,11970,11105,11107,11109,11111}),
    COOKS_GUILD_SKILLS_NECKLACE(new WorldPoint(3143, 3442, 0), "Cooks' Guild", "Skills Necklace","BOX H",false,new int[]{11968,11970,11105,11107,11109,11111}),
    WOODCUTTING_GUILD_SKILLS_NECKLACE(new WorldPoint(1660, 3504, 0), "Woodcutting Guild", "Skills Necklace","BOX I",false,new int[]{11968,11970,11105,11107,11109,11111}),
    FARMING_GUILD_SKILLS_NECKLACE(new WorldPoint(1248, 3725, 0), "Farming Guild", "Skills Necklace","BOX J",false,new int[]{11968,11970,11105,11107,11109,11111}),
    EDGEVILLE_AMULET_OF_GLORY(new WorldPoint(3087, 3496, 0), "Edgeville", "Amulet of Glory","BOX O",false,new int[]{11978,11976,1712,1710,1708,1706,19707}),
    KARAMJA_AMULET_OF_GLORY(new WorldPoint(2918, 3176, 0), "Karamja", "Amulet of Glory","BOX P",false,new int[]{11978,11976,1712,1710,1708,1706,19707}),
    DRAYNOR_VILLAGE_AMULET_OF_GLORY(new WorldPoint(3105, 3251, 0), "Draynor Village", "Amulet of Glory","BOX Q",false,new int[]{11978,11976,1712,1710,1708,1706,19707}),
    AL_KHARID_AMULET_OF_GLORY(new WorldPoint(3293, 3163, 0), "Al Kharid", "Amulet of Glory","BOX R",false,new int[]{11978,11976,1712,1710,1708,1706,19707}),
    MISCELLANIA_RING_OF_WEALTH(new WorldPoint(2531, 3860, 0), "Miscellania", "Ring of Wealth","BOX K",false,new int[]{11980,11982,11984,11986,11988}),
    GRAND_EXCHANGE_RING_OF_WEALTH(new WorldPoint(3164, 3477, 0), "Grand Exchange", "Ring of Wealth","BOX L",false,new int[]{11980,11982,11984,11986,11988}),
    FALADOR_PARK_RING_OF_WEALTH(new WorldPoint(2996, 3373, 0), "Falador Park", "Ring of Wealth","BOX M",false,new int[]{11980,11982,11984,11986,11988}),
    SLAYER_TOWER_SLAYER_RING(new WorldPoint(3423, 3535, 0), "Slayer Tower", "Slayer Ring","SLAY 2",false,	new int[]{21268,11866,11867,11868,11869,11870,11871,11872,11872,11873}),
    STRONGHOLD_SLAYER_CAVE_SLAYER_RING(new WorldPoint(2434, 3424, 0), "Stronghold Slayer Cave", "Slayer Ring","SLAY 1",false,new int[]{21268,11866,11867,11868,11869,11870,11871,11872,11872,11873}),
    DIGSITE_PENDANT(new WorldPoint(3341, 3445, 0), "Digsite", "Digsite Pendant","DIGS 1",false,new int[]{11194,11193,11192,11191,11190}),
    CHAOS_TEMPLE_BURNING_AMULET(new WorldPoint(3234, 3638, 0), "Chaos Temple", "Burning Amulet","BURN 1",true,new int[]{21166,21169,21171,21173,21175}),
    BANDIT_CAMP_BURNING_AMULET(new WorldPoint(3038, 3651, 0), "Bandit Camp", "Burning Amulet","BURN 2",true,new int[]{21166,21169,21171,21173,21175}),
    LAVA_MAZE_BURNING_AMULET(new WorldPoint(3028, 3841, 0), "Lava Maze", "Burning Amulet","BURN 3",true,new int[]{21166,21169,21171,21173,21175}),
    WIZARD_TOWER_NECKLACE_OF_PASSAGE(new WorldPoint(3113, 3178, 0), "Wizards' Tower", "Necklace of Passage","PASS 1",false,new int[]{21146,21149,21151,21153,21155}),
    OUTPOST_NECKLACE_OF_PASSAGE(new WorldPoint(2431, 3349, 0), "Outpost", "Necklace of Passage","PASS 2",false,new int[]{21146,21149,21151,21153,21155}),
    DESERT_EAGLE_STATION_NECKLACE_OF_PASSAGE(new WorldPoint(3404, 3156, 0), "Desert Eagle Station", "Necklace of Passage","PASS 3",false,new int[]{21146,21149,21151,21153,21155}),
    LLETYA_TELEPORT_CRYSTAL(new WorldPoint(2330, 3170, 0), "Lletya", "Teleport Crystal","LLET",false,	23946),
    GRAND_TREE_ROYAL_SEED_POD(new WorldPoint(2465, 3495, 0), "Grand Tree", "Royal Seed Pod","POD",false,19564),
    RELLEKKA_ENCHANTED_LYRE(new WorldPoint(2662, 3644, 0), "Rellekka", "Enchanted Lyre","LYRE 1",false,23458),
    WATERBIRTH_ISLAND_ENCHANTED_LYRE(new WorldPoint(2548, 3759, 0), "Waterbirth Island", "Enchanted Lyre","LYRE 2",false,23458),
    NEITIZNOT_ENCHANTED_LYRE(new WorldPoint(2336, 3802, 0), "Neitiznot", "Enchanted Lyre","LYRE 3",false,23458),
    JATIZSO_ENCHANTED_LYRE(new WorldPoint(2411, 3810, 0), "Jatizso", "Enchanted Lyre","LYRE 4",false,23458),
    ENAKHRAS_TEMPLE_CAMULET(new WorldPoint(3191, 2923, 0), "Enakhra's Temple", "Camulet","CAM 2",false,6707),
    ARCEUUS_BOOK_OF_THE_DEAD(new WorldPoint(1680, 3746, 0), "Arceuus", "Book of the Dead","BOTD 5",false,25818),
    HOSIDIUS_BOOK_OF_THE_DEAD(new WorldPoint(1713, 3611, 0), "Hosidius", "Book of the Dead","BOTD 1",false,25818),
    PORT_PISCARILLIUS_BOOK_OF_THE_DEAD(new WorldPoint(1803, 3748, 0), "Port Piscarillius", "Book of the Dead","BOTD 2",false,25818),
    LOVAKENGJ_BOOK_OF_THE_DEAD(new WorldPoint(1543, 3764, 0), "Lovakengj", "Book of the Dead","BOTD 4",false,25818),
    SHAYZIEN_BOOK_OF_THE_DEAD(new WorldPoint(1478, 3575, 0), "Shayzien", "Book of the Dead","BOTD 3",false,25818),
    WEISS_ICY_BASALT(new WorldPoint(2846, 3938, 0), "Weiss", "Icy Basalt","NEX WEISS",false,-1),
    VER_SINHAZA_DRAKANS_MEDALLION(new WorldPoint(3653, 3217, 0), "Ver Sinhaza", "Drakan's Medallion","DRAK 1",false,22400),
    DARKMEYER_DRAKANS_MEDALLION(new WorldPoint(3595, 3340, 0), "Darkmeyer", "Drakan's Medallion","DRAK 2",false,22400),
    AGILITY_PYRAMID_PHARAOHS_SCEPTRE(new WorldPoint(3341, 2827, 0), "Agility Pyramid", "Pharaoh's Sceptre","PHAR 2",false,new int[]{26948,26950}),
    ANCIENT_PYRAMID_PHARAOHS_SCEPTRE(new WorldPoint(3232, 2897, 0), "Ancient Pyramid", "Pharaoh's Sceptre","PHAR 3",false,new int[]{26948,26950}),
    NECROPOLIS_PHARAOHS_SCEPTRE(new WorldPoint(3311, 2720, 0), "Necropolis", "Pharaoh's Sceptre","PHAR 4",false,new int[]{26948,26950}),
    XERICS_LOOKOUT_XERICS_TALISMAN(new WorldPoint(1578, 3530, 0), "Xeric's Lookout", "Xeric's Talisman","XER 1",false,13393),
    XERICS_GLADE_XERICS_TALISMAN(new WorldPoint(1752, 3566, 0), "Xeric's Glade", "Xeric's Talisman","XER 2",false,13393),
    XERICS_INFERNO_XERICS_TALISMAN(new WorldPoint(1504, 3817, 0), "Xeric's Inferno", "Xeric's Talisman","XER 3",false,13393),
    XERICS_HEART_XERICS_TALISMAN(new WorldPoint(1646, 3743, 0), "Xeric's Heart", "Xeric's Talisman","XER 4",false,13393),
    XERICS_HONOUR_XERICS_TALISMAN(new WorldPoint(1254, 3562, 0), "Xeric's Honour", "Xeric's Talisman","XER 5",false,13393),
    FIRE_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(3314, 3277, 0), "Fire Altar", "Ring of the Elements","ROTE 4",false,26818),
    WATER_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(3170, 3155, 0), "Water Altar", "Ring of the Elements","ROTE 2",false,26818),
    AIR_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(2982, 3276, 0), "Air Altar", "Ring of the Elements","ROTE 1",false,26818),
    EARTH_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(3289, 3467, 0), "Earth Altar", "Ring of the Elements","ROTE 3",false,26818),
    DARKFROST_PENDANT_OF_ATES(new WorldPoint(1489, 3285, 0), "Darkfrost", "Pendant of Ates","ATES 1",false,29893),
    TWILIGHT_TEMPLE_PENDANT_OF_ATES(new WorldPoint(1664, 3224, 0), "Twilight Temple", "Pendant of Ates","ATES 2",false,29893),
    RALOS_RISE_PENDANT_OF_ATES(new WorldPoint(1459, 3137, 0), "Ralos' Rise", "Pendant of Ates","ATES 3",false,29893),
    NORTH_ALDARIN_PENDANT_OF_ATES(new WorldPoint(1424, 2991, 0), "North Aldarin", "Pendant of Ates","ATES 4",true,29893),
    OBELISK_13_WILDERNESS_OBELISK(new WorldPoint(3156, 3619, 0), "Obelisk 13", "Wilderness Obelisk","OBEL 1",true,-1),
    OBELISK_19_WILDERNESS_OBELISK(new WorldPoint(3228, 3667, 0), "Obelisk 19", "Wilderness Obelisk","OBEL 2",true,-1),
    OBELISK_27_WILDERNESS_OBELISK(new WorldPoint(3035, 3732, 0), "Obelisk 27", "Wilderness Obelisk","OBEL 3",true,-1),
    OBELISK_35_WILDERNESS_OBELISK(new WorldPoint(3106, 3794, 0), "Obelisk 35", "Wilderness Obelisk","OBEL 4",true,-1),
    OBELISK_44_WILDERNESS_OBELISK(new WorldPoint(2980, 3865, 0), "Obelisk 44", "Wilderness Obelisk","OBEL 5",true,-1),
    OBELISK_50_WILDERNESS_OBELISK(new WorldPoint(3307, 3915, 0), "Obelisk 50", "Wilderness Obelisk","OBEL 6",true,-1),
    RIMMINGTON_CONSTRUCTION_CAPE(new WorldPoint(2953, 3223, 0), "Rimmington", "Construction Cape","MAX A",false, new int[]{13280,9789,9790,11741}),
    TAVERLEY_CONSTRUCTION_CAPE(new WorldPoint(2894, 3465, 0), "Taverley", "Construction Cape","MAX B", false, new int[]{13280,9789,9790,11742}),
    POLLNIVNEACH_CONSTRUCTION_CAPE(new WorldPoint(3340, 3003, 0), "Pollnivneach", "Construction Cape","MAX C",false, new int[]{13280,9789,9790,11743}),
    HOSIDIUS_CONSTRUCTION_CAPE(new WorldPoint(1743, 3517, 0), "Hosidius", "Construction Cape","MAX D",false, new int[]{13280,9789,9790,19651}),
    RELLEKKA_CONSTRUCTION_CAPE(new WorldPoint(2670, 3631, 0), "Rellekka", "Construction Cape","MAX F",false, new int[]{13280,9789,9790,11744}),
    ALDARIN_CONSTRUCTION_CAPE(new WorldPoint(1420, 2963, 0), "Aldarin", "Construction Cape","MAX E",false, new int[]{13280,9789,9790,30149}),
    BRIMHAVEN_CONSTRUCTION_CAPE(new WorldPoint(2758, 3178, 0), "Brimhaven", "Construction Cape","MAX G",false, new int[]{13280,9789,9790,11745}),
    YANILLE_CONSTRUCTION_CAPE(new WorldPoint(2544, 3095, 0), "Yanille", "Construction Cape", "MAX H", false, new int[]{13280,9789,9790,11746});

	private final WorldPoint location;
	private final String name;
	private final String teleportType;
	private final String shortType;
	private final boolean wildernessTeleport;
	private final int[] itemIds;

	HotColdTeleports(final WorldPoint location, final String name, final String teleportType,
					 final String shortType, final boolean wildernessTeleport, final int itemId) {
		this(location, name, teleportType, shortType, wildernessTeleport,
			itemId > 0 ? new int[]{itemId} : new int[0]);
	}

	HotColdTeleports(final WorldPoint location, final String name, final String teleportType,
					 final String shortType, final boolean wildernessTeleport, final int[] itemIds) {
		this.location = location;
		this.name = name;
		this.teleportType = teleportType;
		this.shortType = shortType;
		this.wildernessTeleport = wildernessTeleport;
		this.itemIds = itemIds;
	}
}
