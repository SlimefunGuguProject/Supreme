package com.github.relativobr.supreme.resource;

import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeComponents {

  public static final SlimefunItemStack SUPREME_NUGGET = new SupremeItemStack("SUPREME_SUPREME_NUGGET",
      "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&a至尊金块", "",
      "&7来自至尊金矿机", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack SUPREME = new SupremeItemStack("SUPREME_SUPREME",
      "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&a至尊", "", "&7至尊", "",
      "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_SUPREME = {SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
      SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
      SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
      SupremeComponents.SUPREME_NUGGET};

  public static final SlimefunItemStack THORNIUM_BIT = new SupremeItemStack("SUPREME_THORNIUM_BIT",
      Material.IRON_NUGGET, "&a一点钍", "", "&7来自钍矿机", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_BIT = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack THORNIUM_DUST = new SupremeItemStack("SUPREME_THORNIUM_DUST",
      Material.GUNPOWDER, "&a钍粉", "", "&7来自一点钍", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_DUST = {SupremeComponents.THORNIUM_BIT,
      SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT,
      SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT,
      SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT};

  public static final SlimefunItemStack THORNIUM_INGOT = new SupremeItemStack("SUPREME_THORNIUM_INGOT",
      Material.IRON_INGOT, "&a钍锭", "", "&7来自钍粉", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {SupremeComponents.THORNIUM_DUST,
      SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
      SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
      SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST};

  public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SupremeItemStack("SUPREME_THORNIUM_BIT_SYNTHETIC",
      Material.GOLD_NUGGET, "&a一点钍合成物", "", "&7来自一点钍", "",
      "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.DAMASCUS_STEEL_INGOT,
      SupremeComponents.THORNIUM_BIT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE};

  public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_DUST_SYNTHETIC", Material.GLOWSTONE_DUST, "&a钍粉合成物", "",
      "&7来自钍粉", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.THORNIUM_DUST, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD};

  public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_INGOT_SYNTHETIC", Material.GOLD_INGOT, "&a钍锭合成物", "",
      "&7来自钍锭", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {SlimefunItems.SYNTHETIC_DIAMOND,
      SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.STEEL_PLATE,
      SupremeComponents.THORNIUM_INGOT, SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND,
      SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND};

  public static final SlimefunItemStack THORNIUM_CARBONADO = new SupremeItemStack("SUPREME_THORNIUM_CARBONADO",
      Material.NETHERITE_INGOT, "&a钍金刚石", "", "&7来自钍锭", "",
      "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE,
      SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE, SupremeComponents.THORNIUM_INGOT,
      SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO};

  public static final SlimefunItemStack THORNIUM_ENERGIZED = new SupremeItemStack("SUPREME_THORNIUM_ENERGIZED",
      Material.NETHERITE_INGOT, "&a充能钍", "", "&7来自钍锭", "",
      "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {SlimefunItems.BLISTERING_INGOT_3,
      SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.THORNIUM_CARBONADO, SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3,
      SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3};

  public static final SlimefunItemStack ALLOY_ZIRCONIUM = new SupremeItemStack("SUPREME_ALLOY_ZIRCONIUM",
      Material.IRON_INGOT, "&a锆合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {SlimefunItems.ZINC_DUST, SlimefunItems.SOLDER_INGOT,
      SlimefunItems.ZINC_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack ZIRCONIUM_PLATE = new SupremeItemStack("SUPREME_ZIRCONIUM_PLATE",
      Material.IRON_BLOCK, "&a锆板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {SupremeComponents.ALLOY_ZIRCONIUM,
      SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.ALLOY_ZIRCONIUM, SupremeCoreBlock.RESOURCE_CORE_DIORITE,
      SupremeCoreBlock.RESOURCE_CORE_DIORITE, SupremeCoreBlock.RESOURCE_CORE_DIORITE, SupremeComponents.ALLOY_ZIRCONIUM,
      SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.ALLOY_ZIRCONIUM};

  public static final SlimefunItemStack ALLOY_TITANIUM = new SupremeItemStack("SUPREME_ALLOY_TITANIUM",
      Material.IRON_INGOT, "&a钛合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {SlimefunItems.TIN_DUST, SlimefunItems.DAMASCUS_STEEL_INGOT,
      SlimefunItems.TIN_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack TITANIUM_PLATE = new SupremeItemStack("SUPREME_TITANIUM_PLATE",
      Material.IRON_BLOCK, "&a钛板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {SupremeComponents.ALLOY_TITANIUM,
      SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_TITANIUM, SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
      SupremeCoreBlock.RESOURCE_CORE_ANDESITE, SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
      SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_TITANIUM};

  public static final SlimefunItemStack ALLOY_IRIDIUM = new SupremeItemStack("SUPREME_ALLOY_IRIDIUM",
      Material.IRON_INGOT, "&a铱合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {SlimefunItems.SILVER_DUST, SlimefunItems.BILLON_INGOT,
      SlimefunItems.SILVER_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack IRIDIUM_PLATE = new SupremeItemStack("SUPREME_IRIDIUM_PLATE",
      Material.IRON_BLOCK, "&a铱板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {SupremeComponents.ALLOY_IRIDIUM,
      SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.ALLOY_IRIDIUM, SupremeCoreBlock.RESOURCE_CORE_GRAVEL,
      SupremeCoreBlock.RESOURCE_CORE_GRAVEL, SupremeCoreBlock.RESOURCE_CORE_GRAVEL, SupremeComponents.ALLOY_IRIDIUM,
      SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.ALLOY_IRIDIUM};

  public static final SlimefunItemStack ALLOY_AURUM = new SupremeItemStack("SUPREME_ALLOY_AURUM", Material.GOLD_INGOT,
      "&a古金合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_AURUM = {SlimefunItems.GOLD_DUST, SlimefunItems.COBALT_INGOT,
      SlimefunItems.GOLD_24K, null, null, null, null, null, null};

  public static final SlimefunItemStack AURUM_PLATE = new SupremeItemStack("SUPREME_AURUM_PLATE", Material.GOLD_BLOCK,
      "&a古金板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_AURUM_PLATE = {SupremeComponents.ALLOY_AURUM, SupremeComponents.ALLOY_AURUM,
      SupremeComponents.ALLOY_AURUM, SupremeCoreBlock.RESOURCE_CORE_SAND, SupremeCoreBlock.RESOURCE_CORE_SAND,
      SupremeCoreBlock.RESOURCE_CORE_SAND, SupremeComponents.ALLOY_AURUM, SupremeComponents.ALLOY_AURUM,
      SupremeComponents.ALLOY_AURUM};

  public static final SlimefunItemStack ALLOY_MANGANESE = new SupremeItemStack("SUPREME_ALLOY_MANGANESE",
      Material.GOLD_INGOT, "&a锰合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {SlimefunItems.MAGNESIUM_DUST, SlimefunItems.DURALUMIN_INGOT,
      SlimefunItems.MAGNESIUM_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack MANGANESE_PLATE = new SupremeItemStack("SUPREME_MANGANESE_PLATE",
      Material.GOLD_BLOCK, "&a锰板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {SupremeComponents.ALLOY_MANGANESE,
      SupremeComponents.ALLOY_MANGANESE, SupremeComponents.ALLOY_MANGANESE, SupremeCoreBlock.RESOURCE_CORE_GRANITE,
      SupremeCoreBlock.RESOURCE_CORE_GRANITE, SupremeCoreBlock.RESOURCE_CORE_GRANITE, SupremeComponents.ALLOY_MANGANESE,
      SupremeComponents.ALLOY_MANGANESE, SupremeComponents.ALLOY_MANGANESE};

  public static final SlimefunItemStack ALLOY_PLATINUM = new SupremeItemStack("SUPREME_ALLOY_PLATINUM",
      Material.GOLD_INGOT, "&a铂金合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {SlimefunItems.LEAD_DUST, SlimefunItems.BRASS_INGOT,
      SlimefunItems.LEAD_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack PLATINUM_PLATE = new SupremeItemStack("SUPREME_PLATINUM_PLATE",
      Material.GOLD_BLOCK, "&a铂金板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {SupremeComponents.ALLOY_PLATINUM,
      SupremeComponents.ALLOY_PLATINUM, SupremeComponents.ALLOY_PLATINUM, SupremeCoreBlock.RESOURCE_CORE_CLAY,
      SupremeCoreBlock.RESOURCE_CORE_CLAY, SupremeCoreBlock.RESOURCE_CORE_CLAY, SupremeComponents.ALLOY_PLATINUM,
      SupremeComponents.ALLOY_PLATINUM, SupremeComponents.ALLOY_PLATINUM};

  public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SupremeItemStack("SUPREME_ALLOY_ADAMANTIUM",
      Material.NETHERITE_INGOT, "&a精金合金", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {SlimefunItems.ALUMINUM_DUST,
      SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ALUMINUM_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack ADAMANTIUM_PLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_PLATE",
      Material.NETHERITE_BLOCK, "&a精金板", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.ALLOY_ADAMANTIUM, SupremeCoreBlock.RESOURCE_CORE_STONE,
      SupremeCoreBlock.RESOURCE_CORE_STONE, SupremeCoreBlock.RESOURCE_CORE_STONE, SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.ALLOY_ADAMANTIUM};

  public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SupremeItemStack("SUPREME_SYNTHETIC_AMETHYST",
      Material.PURPLE_DYE, "&a人造紫水晶", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3,
      new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE};

  public static final SlimefunItemStack SYNTHETIC_RUBY = new SupremeItemStack("SUPREME_SYNTHETIC_RUBY",
      Material.PINK_DYE, "&a人造红宝石", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND,
      SupremeComponents.SYNTHETIC_AMETHYST, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD};

  public static final SlimefunItemStack THORNERITE = new SupremeItemStack("SUPREME_THORNERITE",
      Material.NETHERITE_INGOT, "&a钍", "", "&3终极至尊合成材料");
  public static final ItemStack[] RECIPE_THORNERITE = {SupremeComponents.THORNIUM_INGOT,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.ALLOY_PLATINUM,
      SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_ZIRCONIUM, null, null, null};

  public static final SlimefunItemStack INDUCTIVE_MACHINE = new SupremeItemStack("SUPREME_INDUCTIVE_MACHINE",
      Material.DEAD_FIRE_CORAL_BLOCK, "&a电器", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.ALLOY_PLATINUM, SlimefunItems.REDSTONE_ALLOY, SupremeComponents.ALLOY_IRIDIUM,
      SlimefunItems.ELECTRO_MAGNET, SupremeComponents.ALLOY_IRIDIUM, SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.ALLOY_PLATINUM, SlimefunItems.REDSTONE_ALLOY};

  public static final SlimefunItemStack INDUCTOR_MACHINE = new SupremeItemStack("SUPREME_INDUCTOR_MACHINE",
      Material.FIRE_CORAL_BLOCK, "&a电器", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.PLATINUM_PLATE, SlimefunItems.REDSTONE_ALLOY, SupremeComponents.IRIDIUM_PLATE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.IRIDIUM_PLATE, SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.PLATINUM_PLATE, SlimefunItems.REDSTONE_ALLOY};

  public static final SlimefunItemStack RUSTLESS_MACHINE = new SupremeItemStack("SUPREME_RUSTLESS_MACHINE",
      Material.DEAD_BRAIN_CORAL_BLOCK, "&a除锈零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ALLOY_ZIRCONIUM, SlimefunItems.HARDENED_METAL_INGOT, SupremeComponents.ALLOY_MANGANESE,
      SlimefunItems.ELECTRO_MAGNET, SupremeComponents.ALLOY_MANGANESE, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ALLOY_ZIRCONIUM, SlimefunItems.HARDENED_METAL_INGOT};

  public static final SlimefunItemStack STAINLESS_MACHINE = new SupremeItemStack("SUPREME_STAINLESS_MACHINE",
      Material.BRAIN_CORAL_BLOCK, "&a无锈零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ZIRCONIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT, SupremeComponents.MANGANESE_PLATE,
      SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.MANGANESE_PLATE, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ZIRCONIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT};

  public static final SlimefunItemStack CARRIAGE_MACHINE = new SupremeItemStack("SUPREME_CARRIAGE_MACHINE",
      Material.DEAD_HORN_CORAL_BLOCK, "&a运输零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {SlimefunItems.GILDED_IRON, SupremeComponents.ALLOY_AURUM,
      SlimefunItems.GILDED_IRON, SupremeComponents.ALLOY_TITANIUM, SlimefunItems.ELECTRO_MAGNET,
      SupremeComponents.ALLOY_TITANIUM, SlimefunItems.GILDED_IRON, SupremeComponents.ALLOY_AURUM,
      SlimefunItems.GILDED_IRON};

  public static final SlimefunItemStack CONVEYANCE_MACHINE = new SupremeItemStack("SUPREME_CONVEYANCE_MACHINE",
      Material.HORN_CORAL_BLOCK, "&a输送零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {SlimefunItems.GILDED_IRON, SupremeComponents.AURUM_PLATE,
      SlimefunItems.GILDED_IRON, SupremeComponents.TITANIUM_PLATE, SupremeComponents.CARRIAGE_MACHINE,
      SupremeComponents.TITANIUM_PLATE, SlimefunItems.GILDED_IRON, SupremeComponents.AURUM_PLATE,
      SlimefunItems.GILDED_IRON};

  public static final SlimefunItemStack PETRIFIER_MACHINE = new SupremeItemStack("SUPREME_PETRIFIER_MACHINE",
      Material.DEAD_TUBE_CORAL_BLOCK, "&a石化零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_COAL,
      SupremeComponents.RUSTLESS_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_COAL, SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeComponents.CARRIAGE_MACHINE, SupremeComponents.ALLOY_ADAMANTIUM, SupremeCoreBlock.RESOURCE_CORE_STONE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeCoreBlock.RESOURCE_CORE_STONE};

  public static final SlimefunItemStack CRYSTALLIZER_MACHINE = new SupremeItemStack("SUPREME_CRYSTALLIZER_MACHINE",
      Material.TUBE_CORAL_BLOCK, "&a结晶零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_DIAMOND,
      new ItemStack(STAINLESS_MACHINE), SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, SupremeComponents.SYNTHETIC_RUBY,
      SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.SYNTHETIC_RUBY, SupremeCoreAlloy.RESOURCE_CORE_EMERALD,
      SupremeComponents.INDUCTOR_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_EMERALD};

  public static final SlimefunItemStack BLEND_MACHINE = new SupremeItemStack("SUPREME_BLEND_MACHINE",
      Material.BUBBLE_CORAL_BLOCK, "&a融合零件", "", "&3高级至尊合成材料");
  public static final ItemStack[] RECIPE_BLEND_MACHINE = {SupremeComponents.INDUCTOR_MACHINE,
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.CRYSTALLIZER_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_EMERALD,
      SupremeComponents.CRYSTALLIZER_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, SupremeComponents.CONVEYANCE_MACHINE};

  public static final SlimefunItemStack CENTER_CARD_SIMPLE = new SupremeItemStack("SUPREME_CENTER_CARD_SIMPLE",
      Material.MUSIC_DISC_11, "&a卡片基础合成材料", "", "&f机器生产物品的合成材料", "",
      "&3至尊合成材料");
  public static final ItemStack[] RECIPE_CENTER_CARD_SIMPLE = new ItemStack[]{SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SupremeComponents.SYNTHETIC_AMETHYST, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD};

  public static final SlimefunItemStack CENTER_CARD_ADVANCED = new SupremeItemStack("SUPREME_CENTER_CARD_ADVANCED",
      Material.MUSIC_DISC_PIGSTEP, "&a卡片高级合成材料", "", "&f机器生产物品的合成材料", "",
      "&3至尊合成材料");
  public static final ItemStack[] RECIPE_CENTER_CARD_ADVANCED = new ItemStack[]{SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SupremeComponents.CENTER_CARD_SIMPLE, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SupremeComponents.CENTER_CARD_SIMPLE,
      SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL,
      SupremeComponents.CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL};

  public static final SlimefunItemStack CENTER_CARD_ULTIMATE = new SupremeItemStack("SUPREME_CENTER_CARD_ULTIMATE",
      Material.MUSIC_DISC_MALL, "&a卡片终极合成材料", "", "&f机器生产物品的合成材料", "",
      "&3至尊合成材料");
  public static final ItemStack[] RECIPE_CENTER_CARD_ULTIMATE = new ItemStack[]{SupremeComponents.SYNTHETIC_RUBY,
      SupremeComponents.CENTER_CARD_ADVANCED, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.CENTER_CARD_ADVANCED,
      SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE,
      SupremeComponents.CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE};

  public static final SlimefunItemStack DUST_NETHERITE = new SupremeItemStack("SUPREME_DUST_NETHERITE",
      Material.MELON_SEEDS, "&a下界合金粉", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_DUST_NETHERITE = new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_GLOW_INK = new SupremeItemStack("SUPREME_DUST_GLOW_INK",
      Material.PUMPKIN_SEEDS, "&a荧光墨囊粉", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_DUST_GLOW_INK = new ItemStack[]{new ItemStack(Material.GLOW_INK_SAC), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_AMETHYST = new SupremeItemStack("SUPREME_DUST_AMETHYST",
      Material.BEETROOT_SEEDS, "&a紫水晶粉", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_DUST_AMETHYST = new ItemStack[]{new ItemStack(Material.AMETHYST_SHARD), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack EMPTY_MOBTECH = new SupremeItemStack("SUPREME_EMPTY_MOBTECH",
      Material.FIRE_CHARGE, "&a空生物科技", "", "&3至尊合成材料");
  public static final ItemStack[] RECIPE_EMPTY_MOBTECH = new ItemStack[]{SlimefunItems.MAGIC_LUMP_2,
      SlimefunItems.STONE_CHUNK, SlimefunItems.ENDER_LUMP_2, null, null, null, null, null, null};

  public static final SlimefunItemStack GENE_BERSERK = new SupremeItemStack("SUPREME_GENE_BERSERK", Material.FIRE_CORAL,
      "&a狂暴基因", "", "&3至尊合成材料");

  public static final SlimefunItemStack GENE_INTELLIGENCE = new SupremeItemStack("SUPREME_GENE_INTELLIGENCE",
      Material.TUBE_CORAL, "&f智慧基因", "", "&3至尊合成材料");

  public static final SlimefunItemStack GENE_LUCK = new SupremeItemStack("SUPREME_GENE_LUCK", Material.HORN_CORAL,
      "&a幸运基因", "", "&3至尊合成材料");

}
