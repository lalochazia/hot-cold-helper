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
    ARDOUGNE_DIARY_CAPE(new WorldPoint(2573, 3324, 0), "Ardougne", "Diary Cape",false),
    DESERT_DIARY_CAPE(new WorldPoint(3300, 3121, 0), "Desert", "Diary Cape",false),
    FALADOR_DIARY_CAPE(new WorldPoint(2977, 3346, 0), "Falador", "Diary Cape",false),
    FREMENNIK_DIARY_CAPE(new WorldPoint(2659, 3627, 0), "Fremennik", "Diary Cape",false),
    KANDARIN_DIARY_CAPE(new WorldPoint(2743, 3445, 0), "Kandarin", "Diary Cape",false),
    KARAMJA_JACKIE_DIARY_CAPE(new WorldPoint(2809, 3192, 0), "Karamja (Jackie)", "Diary Cape",false),
    KARAMJA_FORESTER_DIARY_CAPE(new WorldPoint(2796, 2944, 0), "Karamja (Forester)", "Diary Cape",false),
    KOUREND_DIARY_CAPE(new WorldPoint(1647, 3667, 0), "Kourend", "Diary Cape",false),
    LUMBRIDGE_DIARY_CAPE(new WorldPoint(3240, 3219, 0), "Lumbridge", "Diary Cape",false),
    MORYTANIA_DIARY_CAPE(new WorldPoint(3464, 3476, 0), "Morytania", "Diary Cape",false),
    VARROCK_DIARY_CAPE(new WorldPoint(3225, 3413, 0), "Varrock", "Diary Cape",false),
    WILDERNESS_DIARY_CAPE(new WorldPoint(3121, 3515, 0), "Wilderness", "Diary Cape",false),
    WESTERN_PROVINCES_DIARY_CAPE(new WorldPoint(2466, 3459, 0), "Western Provinces", "Diary Cape",false),
    TWIGGY_DIARY_CAPE(new WorldPoint(3097, 3226, 0), "Twiggy", "Diary Cape",false),
    LUMBRIDGE_STANDARD(new WorldPoint(3220, 3218, 0), "Lumbridge", "Standard",false),
    VARROCK_STANDARD(new WorldPoint(3211, 3427, 0), "Varrock", "Standard",false),
    FALADOR_STANDARD(new WorldPoint(2965, 3378, 0), "Falador", "Standard",false),
    CAMELOT_STANDARD(new WorldPoint(2757, 3478, 0), "Camelot", "Standard",false),
    SEERS_VILLAGE_STANDARD(new WorldPoint(2726, 3484, 0), "Seers' Village", "Standard",false),
    KOUREND_STANDARD(new WorldPoint(1641, 3673, 0), "Kourend", "Standard",false),
    ARDOUGNE_STANDARD(new WorldPoint(2660, 3301, 0), "Ardougne", "Standard",false),
    CIVITAS_ILLA_FORTIS_STANDARD(new WorldPoint(1680, 3134, 0), "Civitas illa Fortis", "Standard",false),
    YANILLE_STANDARD(new WorldPoint(2583, 3097, 0), "Yanille", "Standard",false),
    TROLLHEIM_STANDARD(new WorldPoint(2890, 3679, 0), "Trollheim", "Standard",false),
    APE_ATOLL_STANDARD(new WorldPoint(2799, 2792, 0), "Ape Atoll", "Standard",false),
    SENNTISTEN_ANCIENTS(new WorldPoint(3323, 3334, 0), "Senntisten", "Ancients",false),
    KHARYLL_ANCIENTS(new WorldPoint(3492, 3471, 0), "Kharyll", "Ancients",false),
    LASSAR_ANCIENTS(new WorldPoint(3004, 3470, 0), "Lassar", "Ancients",false),
    DAREEYAK_ANCIENTS(new WorldPoint(2969, 3697, 0), "Dareeyak", "Ancients",true),
    CARRALLANGER_ANCIENTS(new WorldPoint(3159, 3667, 0), "Carrallanger", "Ancients",true),
    ANNAKARL_ANCIENTS(new WorldPoint(3287, 3886, 0), "Annakarl", "Ancients",true),
    GHORROCK_ANCIENTS(new WorldPoint(2976, 3872, 0), "Ghorrock", "Ancients",true),
    MOONCLAN_LUNARS(new WorldPoint(2114, 3898, 0), "Moonclan", "Lunars",false),
    OURANIA_LUNARS(new WorldPoint(2466, 3246, 0), "Ourania", "Lunars",false),
    WATERBIRTH_LUNARS(new WorldPoint(2545, 3755, 0), "Waterbirth", "Lunars",false),
    BARBARIAN_LUNARS(new WorldPoint(2541, 3568, 0), "Barbarian", "Lunars",false),
    KHAZARD_LUNARS(new WorldPoint(2635, 3168, 0), "Khazard", "Lunars",false),
    FISHING_GUILD_LUNARS(new WorldPoint(2604, 3401, 0), "Fishing Guild", "Lunars",false),
    CATHERBY_LUNARS(new WorldPoint(2801, 3449, 0), "Catherby", "Lunars",false),
    ICE_PLATEAU_LUNARS(new WorldPoint(2972, 3916, 0), "Ice Plateau", "Lunars",true),
    ARCEUUS_LIBRARY_ARCEUUS(new WorldPoint(1631, 3833, 0), "Arceuus Library", "Arceuus",false),
    DRAYNOR_MANOR_ARCEUUS(new WorldPoint(3108, 3351, 0), "Draynor Manor", "Arceuus",false),
    BATTLEFRONT_ARCEUUS(new WorldPoint(1348, 3739, 0), "Battlefront", "Arceuus",false),
    MIND_ALTAR_ARCEUUS(new WorldPoint(2979, 3509, 0), "Mind Altar", "Arceuus",false),
    SALVE_GRAVEYARD_ARCEUUS(new WorldPoint(3432, 3460, 0), "Salve Graveyard", "Arceuus",false),
    FENKENSTRAINS_CASTLE_ARCEUUS(new WorldPoint(3546, 3528, 0), "Fenkenstrains Castle", "Arceuus",false),
    WEST_ARDOUGNE_ARCEUUS(new WorldPoint(2500, 3291, 0), "West Ardougne", "Arceuus",false),
    HARMONY_ISLAND_ARCEUUS(new WorldPoint(3796, 2867, 0), "Harmony Island", "Arceuus",false),
    CEMETERY_ARCEUUS(new WorldPoint(2980, 3763, 0), "Cemetery", "Arceuus",true),
    BARROWS_ARCEUUS(new WorldPoint(3565, 3311, 0), "Barrows", "Arceuus",false),
    APE_ATOLL_ARCEUUS(new WorldPoint(2764, 2704, 0), "Ape Atoll", "Arceuus",false),
    NARDAH_MASTER_SCROLL_BOX(new WorldPoint(3420, 2917, 0), "Nardah", "Master Scroll Book",false),
    DIGSITE_MASTER_SCROLL_BOX(new WorldPoint(3325, 3412, 0), "Digsite", "Master Scroll Book",false),
    FELDIP_HILLS_MASTER_SCROLL_BOX(new WorldPoint(2541, 2925, 0), "Feldip Hills", "Master Scroll Book",false),
    LUNAR_ISLE_MASTER_SCROLL_BOX(new WorldPoint(2094, 3913, 0), "Lunar Isle", "Master Scroll Book",false),
    MORTTON_MASTER_SCROLL_BOX(new WorldPoint(3489, 3287, 0), "Mort'ton", "Master Scroll Book",false),
    PEST_CONTROL_MASTER_SCROLL_BOX(new WorldPoint(2658, 2659, 0), "Pest Control", "Master Scroll Book",false),
    PISCATORIS_MASTER_SCROLL_BOX(new WorldPoint(2339, 3649, 0), "Piscatoris", "Master Scroll Book",false),
    TAI_BWO_WANNAI_MASTER_SCROLL_BOX(new WorldPoint(2789, 3066, 0), "Tai Bwo Wannai", "Master Scroll Book",false),
    IORWERTH_CAMP_MASTER_SCROLL_BOX(new WorldPoint(2194, 3258, 0), "Iorwerth Camp", "Master Scroll Book",false),
    MOS_LE_HARMLESS_MASTER_SCROLL_BOX(new WorldPoint(3701, 2996, 0), "Mos Le'Harmless", "Master Scroll Book",false),
    LUMBERYARD_MASTER_SCROLL_BOX(new WorldPoint(3302, 3487, 0), "Lumberyard", "Master Scroll Book",false),
    ZUL_ANDRA_MASTER_SCROLL_BOX(new WorldPoint(2196, 3056, 0), "Zul-Andra", "Master Scroll Book",false),
    REVENANT_CAVE_MASTER_SCROLL_BOX(new WorldPoint(3128, 3832, 0), "Revenant Cave", "Master Scroll Book",true),
    WATSON_MASTER_SCROLL_BOX(new WorldPoint(1645, 3579, 0), "Watson", "Master Scroll Book",false),
    CRAFTING_GUILD_CRAFTING_CAPE(new WorldPoint(2931, 3286, 0), "Crafting Guild", "Crafting Cape",false),
    FISHING_GUILD_FISHING_CAPE(new WorldPoint(2604, 3401, 0), "Fishing Guild", "Fishing Cape",false),
    OTTO_GROTTO_FISHING_CAPE(new WorldPoint(2504, 3484, 0), "Otto's Grotto", "Fishing Cape",false),
    FARMING_GUILD_FARMING_CAPE(new WorldPoint(1249, 3724, 0), "Farming Guild", "Farming Cape",false),
    RED_CHINCHOMPAS_HUNTER_CAPE(new WorldPoint(2556, 2918, 0), "Red Chinchompas", "Hunter Cape",false),
    BLACK_CHINCHOMPAS_HUNTER_CAPE(new WorldPoint(3144, 3772, 0), "Black Chinchompas", "Hunter Cape",true),
    HUNTER_GUILD_HUNTER_CAPE(new WorldPoint(1577, 3046, 0), "Hunter Guild", "Hunter Cape",false),
    WARRIOR_GUILD_STRENGTH_CAPE(new WorldPoint(2865, 3546, 0), "Warrior's Guild", "Strength Cape",false),
    LEGEND_GUILD_QP_CAPE(new WorldPoint(2729, 3348, 0), "Legend's Guild", "QP Cape",false),
    FALO_MUSIC_CAPE(new WorldPoint(2689, 3547, 0), "Falo", "Music Cape",false),
    BARBARIAN_ASSAULT_GAMES_NECKLACE(new WorldPoint(2519, 3571, 0), "Barbarian Assault", "Games Necklace",false),
    BURTHORPE_GAMES_NECKLACE(new WorldPoint(2898, 3553, 0), "Burthorpe", "Games Necklace",false),
    WINTERTODT_CAMP_GAMES_NECKLACE(new WorldPoint(1631, 3940, 0), "Wintertodt Camp", "Games Necklace",false),
    EMIR_ARENA_RING_OF_DUELING(new WorldPoint(3316, 3235, 0), "Emir's Arena", "Ring of Dueling",false),
    FEROX_ENCLAVE_RING_OF_DUELING(new WorldPoint(3150, 3634, 0), "Ferox Enclave", "Ring of Dueling",false),
    CASTLE_WARS_RING_OF_DUELING(new WorldPoint(2440, 3090, 0), "Castle Wars", "Ring of Dueling",false),
    FORTIS_COLOSSEUM_RING_OF_DUELING(new WorldPoint(1791, 3106, 0), "Fortis Colosseum", "Ring of Dueling",false),
    WARRIORS_GUILD_COMBAT_BRACELET(new WorldPoint(2881, 3546, 0), "Warriors' Guild", "Combat Bracelet",false),
    CHAMPIONS_GUILD_COMBAT_BRACELET(new WorldPoint(3191, 3336, 0), "Champions' Guild", "Combat Bracelet",false),
    EDGEVILLE_MONASTERY_COMBAT_BRACELET(new WorldPoint(3052, 3487, 0), "Edgeville Monastery", "Combat Bracelet",false),
    RANGING_GUILD_COMBAT_BRACELET(new WorldPoint(2655, 3442, 0), "Ranging Guild", "Combat Bracelet",false),
    FISHING_GUILD_SKILLS_NECKLACE(new WorldPoint(2611, 3390, 0), "Fishing Guild", "Skills Necklace",false),
    CRAFTING_GUILD_SKILLS_NECKLACE(new WorldPoint(2932, 3294, 0), "Crafting Guild", "Skills Necklace",false),
    COOKS_GUILD_SKILLS_NECKLACE(new WorldPoint(3143, 3442, 0), "Cooks' Guild", "Skills Necklace",false),
    WOODCUTTING_GUILD_SKILLS_NECKLACE(new WorldPoint(1660, 3504, 0), "Woodcutting Guild", "Skills Necklace",false),
    FARMING_GUILD_SKILLS_NECKLACE(new WorldPoint(1248, 3725, 0), "Farming Guild", "Skills Necklace",false),
    EDGEVILLE_AMULET_OF_GLORY(new WorldPoint(3087, 3496, 0), "Edgeville", "Amulet of Glory",false),
    KARAMJA_AMULET_OF_GLORY(new WorldPoint(2918, 3176, 0), "Karamja", "Amulet of Glory",false),
    DRAYNOR_VILLAGE_AMULET_OF_GLORY(new WorldPoint(3105, 3251, 0), "Draynor Village", "Amulet of Glory",false),
    AL_KHARID_AMULET_OF_GLORY(new WorldPoint(3293, 3163, 0), "Al Kharid", "Amulet of Glory",false),
    MISCELLANIA_RING_OF_WEALTH(new WorldPoint(2531, 3860, 0), "Miscellania", "Ring of Wealth",false),
    GRAND_EXCHANGE_RING_OF_WEALTH(new WorldPoint(3164, 3477, 0), "Grand Exchange", "Ring of Wealth",false),
    FALADOR_PARK_RING_OF_WEALTH(new WorldPoint(2996, 3373, 0), "Falador Park", "Ring of Wealth",false),
    SLAYER_TOWER_SLAYER_RING(new WorldPoint(3423, 3535, 0), "Slayer Tower", "Slayer Ring",false),
    FREMENNIK_SLAYER_DUNGEON_SLAYER_RING(new WorldPoint(2974, 3613, 0), "Fremennik Slayer Dungeon", "Slayer Ring",false),
    STRONGHOLD_SLAYER_CAVE_SLAYER_RING(new WorldPoint(2434, 3424, 0), "Stronghold Slayer Cave", "Slayer Ring",false),
    DIGSITE_PENDANT(new WorldPoint(3341, 3445, 0), "Digsite", "Digsite Pendant",false),
    CHAOS_TEMPLE_BURNING_AMULET(new WorldPoint(3234, 3638, 0), "Chaos Temple", "Burning Amulet",true),
    BANDIT_CAMP_BURNING_AMULET(new WorldPoint(3038, 3651, 0), "Bandit Camp", "Burning Amulet",true),
    LAVA_MAZE_BURNING_AMULET(new WorldPoint(3028, 3841, 0), "Lava Maze", "Burning Amulet",true),
    WIZARD_TOWER_NECKLACE_OF_PASSAGE(new WorldPoint(3113, 3178, 0), "Wizards' Tower", "Necklace of Passage",false),
    OUTPOST_NECKLACE_OF_PASSAGE(new WorldPoint(2431, 3349, 0), "Outpost", "Necklace of Passage",false),
    DESERT_EAGLE_STATION_NECKLACE_OF_PASSAGE(new WorldPoint(3404, 3156, 0), "Desert Eagle Station", "Necklace of Passage",false),
    LLETYA_TELEPORT_CRYSTAL(new WorldPoint(2330, 3170, 0), "Lletya", "Teleport Crystal",false),
    GRAND_TREE_ROYAL_SEED_POD(new WorldPoint(2465, 3495, 0), "Grand Tree", "Royal Seed Pod",false),
    RELLEKKA_ENCHANTED_LYRE(new WorldPoint(2662, 3644, 0), "Rellekka", "Enchanted Lyre",false),
    WATERBIRTH_ISLAND_ENCHANTED_LYRE(new WorldPoint(2548, 3759, 0), "Waterbirth Island", "Enchanted Lyre",false),
    NEITIZNOT_ENCHANTED_LYRE(new WorldPoint(2336, 3802, 0), "Neitiznot", "Enchanted Lyre",false),
    JATIZSO_ENCHANTED_LYRE(new WorldPoint(2411, 3810, 0), "Jatizso", "Enchanted Lyre",false),
    ENAKHRAS_TEMPLE_CAMULET(new WorldPoint(3191, 2923, 0), "Enakhra's Temple", "Camulet",false),
    ARCEUUS_BOOK_OF_THE_DEAD(new WorldPoint(1680, 3746, 0), "Arceuus", "Book of the Dead",false),
    HOSIDIUS_BOOK_OF_THE_DEAD(new WorldPoint(1713, 3611, 0), "Hosidius", "Book of the Dead",false),
    PORT_PISCARILLIUS_BOOK_OF_THE_DEAD(new WorldPoint(1803, 3748, 0), "Port Piscarillius", "Book of the Dead",false),
    LOVAKENGJ_BOOK_OF_THE_DEAD(new WorldPoint(1543, 3764, 0), "Lovakengj", "Book of the Dead",false),
    SHAYZIEN_BOOK_OF_THE_DEAD(new WorldPoint(1478, 3575, 0), "Shayzien", "Book of the Dead",false),
    WEISS_ICY_BASALT(new WorldPoint(2846, 3938, 0), "Weiss", "Icy Basalt",false),
    VER_SINHAZA_DRAKANS_MEDALLION(new WorldPoint(3653, 3217, 0), "Ver Sinhaza", "Drakan's Medallion",false),
    DARKMEYER_DRAKANS_MEDALLION(new WorldPoint(3595, 3340, 0), "Darkmeyer", "Drakan's Medallion",false),
    AGILITY_PYRAMID_PHARAOHS_SCEPTRE(new WorldPoint(3341, 2827, 0), "Agility Pyramid", "Pharaoh's Sceptre",false),
    ANCIENT_PYRAMID_PHARAOHS_SCEPTRE(new WorldPoint(3232, 2897, 0), "Ancient Pyramid", "Pharaoh's Sceptre",false),
    NECROPOLIS_PHARAOHS_SCEPTRE(new WorldPoint(3311, 2720, 0), "Necropolis", "Pharaoh's Sceptre",false),
    XERICS_LOOKOUT_XERICS_TALISMAN(new WorldPoint(1578, 3530, 0), "Xeric's Lookout", "Xeric's Talisman",false),
    XERICS_GLADE_XERICS_TALISMAN(new WorldPoint(1752, 3566, 0), "Xeric's Glade", "Xeric's Talisman",false),
    XERICS_INFERNO_XERICS_TALISMAN(new WorldPoint(1504, 3817, 0), "Xeric's Inferno", "Xeric's Talisman",false),
    XERICS_HEART_XERICS_TALISMAN(new WorldPoint(1646, 3743, 0), "Xeric's Heart", "Xeric's Talisman",false),
    XERICS_HONOUR_XERICS_TALISMAN(new WorldPoint(1254, 3562, 0), "Xeric's Honour", "Xeric's Talisman",false),
    FIRE_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(3314, 3277, 0), "Fire Altar", "Ring of the Elements",false),
    WATER_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(3170, 3155, 0), "Water Altar", "Ring of the Elements",false),
    AIR_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(2982, 3276, 0), "Air Altar", "Ring of the Elements",false),
    EARTH_ALTAR_RING_OF_THE_ELEMENTS(new WorldPoint(3289, 3467, 0), "Earth Altar", "Ring of the Elements",false),
    DARKFROST_PENDANT_OF_ATES(new WorldPoint(1489, 3285, 0), "Darkfrost", "Pendant of Ates",false),
    TWILIGHT_TEMPLE_PENDANT_OF_ATES(new WorldPoint(1664, 3224, 0), "Twilight Temple", "Pendant of Ates",false),
    RALOS_RISE_PENDANT_OF_ATES(new WorldPoint(1459, 3137, 0), "Ralos' Rise", "Pendant of Ates",false),
    NORTH_ALDARIN_PENDANT_OF_ATES(new WorldPoint(1424, 2991, 0), "North Aldarin", "Pendant of Ates",true),
    OBELISK_13_WILDERNESS_OBELISK(new WorldPoint(3156, 3619, 0), "Obelisk 13", "Wilderness Obelisk",true),
    OBELISK_19_WILDERNESS_OBELISK(new WorldPoint(3228, 3667, 0), "Obelisk 19", "Wilderness Obelisk",true),
    OBELISK_27_WILDERNESS_OBELISK(new WorldPoint(3035, 3732, 0), "Obelisk 27", "Wilderness Obelisk",true),
    OBELISK_35_WILDERNESS_OBELISK(new WorldPoint(3106, 3794, 0), "Obelisk 35", "Wilderness Obelisk",true),
    OBELISK_44_WILDERNESS_OBELISK(new WorldPoint(2980, 3865, 0), "Obelisk 44", "Wilderness Obelisk",true),
    OBELISK_50_WILDERNESS_OBELISK(new WorldPoint(3307, 3915, 0), "Obelisk 50", "Wilderness Obelisk",true),
    RIMMINGTON_CONSTRUCTION_CAPE(new WorldPoint(2953, 3223, 0), "Rimmington", "Construction Cape",false),
    TAVERLEY_CONSTRUCTION_CAPE(new WorldPoint(2894, 3465, 0), "Taverley", "Construction Cape",false),
    POLLNIVNEACH_CONSTRUCTION_CAPE(new WorldPoint(3340, 3003, 0), "Pollnivneach", "Construction Cape",false),
    HOSIDIUS_CONSTRUCTION_CAPE(new WorldPoint(1743, 3517, 0), "Hosidius", "Construction Cape",false),
    RELLEKKA_CONSTRUCTION_CAPE(new WorldPoint(2670, 3631, 0), "Rellekka", "Construction Cape",false),
    ALDARIN_CONSTRUCTION_CAPE(new WorldPoint(1420, 2963, 0), "Aldarin", "Construction Cape",false),
    BRIMHAVEN_CONSTRUCTION_CAPE(new WorldPoint(2758, 3178, 0), "Brimhaven", "Construction Cape",false),
    YANILLE_CONSTRUCTION_CAPE(new WorldPoint(2544, 3095, 0), "Yanille", "Construction Cape",false);

    private final WorldPoint location;
    private final String name;
    private final String teleportType;
    private final boolean wildernessTeleport;

    HotColdTeleports(final WorldPoint location, final String name, final String teleportType, final boolean wildernessTeleport) {
        this.location = location;
        this.name = name;
        this.teleportType = teleportType;
        this.wildernessTeleport = wildernessTeleport;
    }

}