package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SimpleCard {

  /**
   * MUSIC_DISC_STRAD       1 branco MUSIC_DISC_13          2 amarelo/branco MUSIC_DISC_MELLOHI     3 rosa/branco
   * MUSIC_DISC_FAR         4 verdeclaro MUSIC_DISC_CAT         5 verde MUSIC_DISC_WARD        6 verde/verdeclaro
   * MUSIC_DISC_WAIT        7 azul
   */

  // cards basicos
  public static final SlimefunItemStack CARD_STONE = new SupremeItemStack("SUPREME_CARD_STONE",
      Material.MUSIC_DISC_STRAD, "&b石头卡片", "", "&f改为生产石头", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GRANITE = new SupremeItemStack("SUPREME_CARD_GRANITE",
      Material.MUSIC_DISC_STRAD, "&b花岗岩卡片", "", "&f改为生产花岗岩", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_DIORITE = new SupremeItemStack("SUPREME_CARD_DIORITE",
      Material.MUSIC_DISC_STRAD, "&b闪长岩卡片", "", "&f改为生产闪长岩", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ANDESITE = new SupremeItemStack("SUPREME_CARD_ANDESITE",
      Material.MUSIC_DISC_STRAD, "&b安山岩卡片", "", "&f改为生产安山岩", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GRAVEL = new SupremeItemStack("SUPREME_CARD_GRAVEL",
      Material.MUSIC_DISC_STRAD, "&b沙砾卡片", "", "&f改为生产沙砾", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_SAND = new SupremeItemStack("SUPREME_CARD_SAND", Material.MUSIC_DISC_STRAD,
      "&b沙子卡片", "", "&f改为生产沙子", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ENDSTONE = new SupremeItemStack("SUPREME_CARD_ENDSTONE",
      Material.MUSIC_DISC_STRAD, "&b末地石卡片", "", "&f改为生产末地石", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_CLAY = new SupremeItemStack("SUPREME_CARD_CLAY", Material.MUSIC_DISC_STRAD,
      "&b粘土卡片", "", "&f改为生产粘土", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_SNOW = new SupremeItemStack("SUPREME_CARD_SNOW", Material.MUSIC_DISC_STRAD,
      "&b雪卡片", "", "&f改为生产雪", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_APPLE = new SupremeItemStack("SUPREME_CARD_APPLE", Material.MUSIC_DISC_STRAD,
      "&b苹果卡片", "", "&f改为生产苹果", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_NETHER_STAR = new SupremeItemStack("SUPREME_CARD_NETHER_STAR", Material.MUSIC_DISC_STRAD,
          "&b下界之星卡片", "", "&f改为生产下界之星", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_WITHER_ROSE = new SupremeItemStack("SUPREME_CARD_WITHER_ROSE", Material.MUSIC_DISC_STRAD,
          "&b凋零玫瑰卡片", "", "&f改为生产凋零玫瑰", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_SLIME_BALL = new SupremeItemStack("SUPREME_CARD_SLIME_BALL", Material.MUSIC_DISC_STRAD,
          "&b粘液球卡片", "", "&f改为生产粘液球", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_INK_SAC = new SupremeItemStack("SUPREME_CARD_INK_SAC", Material.MUSIC_DISC_STRAD,
          "&b墨囊卡片", "", "&f改为生产墨囊", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_GLOW_INK_SAC = new SupremeItemStack("SUPREME_CARD_GLOW_INK_SAC", Material.MUSIC_DISC_STRAD,
          "&b发光墨囊卡片", "", "&f改为生产发光墨囊", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_HONEY_BOTTLE = new SupremeItemStack("SUPREME_CARD_HONEY_BOTTLE", Material.MUSIC_DISC_STRAD,
          "&b蜂蜜瓶卡片", "", "&f改为生产蜂蜜瓶", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_COAL = new SupremeItemStack("SUPREME_CARD_COAL", Material.MUSIC_DISC_13,
      "&b煤卡片", "", "&f改为生产煤", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_IRON = new SupremeItemStack("SUPREME_CARD_IRON", Material.MUSIC_DISC_13,
      "&b铁卡片", "", "&f改为生产铁", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_COPPER = new SupremeItemStack("SUPREME_CARD_COPPER",
      Material.MUSIC_DISC_13, "&b铜卡片", "", "&f改为生产铜", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GOLD = new SupremeItemStack("SUPREME_CARD_GOLD", Material.MUSIC_DISC_13,
      "&b金卡片", "", "&f改为生产金", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_QUARTZ = new SupremeItemStack("SUPREME_CARD_QUARTZ",
      Material.MUSIC_DISC_13, "&b下界石英卡片", "", "&f改为生产下界石英", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_QUARTZ_BLOCK = new SupremeItemStack("SUPREME_CARD_QUARTZ_BLOCK",
      Material.MUSIC_DISC_13, "&b石英块卡片", "", "&f改为生产石英块", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_LAPIS = new SupremeItemStack("SUPREME_CARD_LAPIS", Material.MUSIC_DISC_13,
      "&b青金石卡片", "", "&f改为生产青金石", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_REDSTONE = new SupremeItemStack("SUPREME_CARD_REDSTONE",
      Material.MUSIC_DISC_13, "&b红石卡片", "", "&f改为生产红石", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_DIAMOND = new SupremeItemStack("SUPREME_CARD_DIAMOND",
      Material.MUSIC_DISC_FAR, "&b钻石卡片", "", "&f改为生产钻石", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_EMERALD = new SupremeItemStack("SUPREME_CARD_EMERALD",
      Material.MUSIC_DISC_FAR, "&b绿宝石卡片", "", "&f改为生产绿宝石", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_BLAZE_ROD = new SupremeItemStack("SUPREME_CARD_BLAZE_ROD",
      Material.MUSIC_DISC_FAR, "&b烈焰棒卡片", "", "&f改为生产烈焰棒", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_NETHERITE = new SupremeItemStack("SUPREME_CARD_NETHERITE",
      Material.MUSIC_DISC_FAR, "&b下界合金卡片", "", "&f改为生产下界合金", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_AMETHYST = new SupremeItemStack("SUPREME_CARD_AMETHYST",
      Material.MUSIC_DISC_FAR, "&b紫水晶卡片", "", "&f改为生产紫水晶", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_IRON_DUST = new SupremeItemStack("SUPREME_CARD_IRON_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b铁粉卡片", "", "&f改为生产铁粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");

  public static final SlimefunItemStack CARD_LEAD_DUST = new SupremeItemStack("SUPREME_CARD_LEAD_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b铅粉卡片", "", "&f改为生产铅粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_GOLD_DUST = new SupremeItemStack("SUPREME_CARD_GOLD_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b金粉卡片", "", "&f改为生产金粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_COPPER_DUST = new SupremeItemStack("SUPREME_CARD_COPPER_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b铜粉卡片", "", "&f改为生产铜粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_MAGNESIUM_DUST = new SupremeItemStack("SUPREME_CARD_MAGNESIUM_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b镁粉卡片", "", "&f改为生产镁粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ALUMINUM_DUST = new SupremeItemStack("SUPREME_CARD_ALUMINUM_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b铝粉卡片", "", "&f改为生产铝粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_SILVER_DUST = new SupremeItemStack("SUPREME_CARD_SILVER_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b银粉卡片 ", "", "&f改为生产银粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_TIN_DUST = new SupremeItemStack("SUPREME_CARD_TIN_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b锡粉卡片", "", "&f改为生产锡粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");


  public static final SlimefunItemStack CARD_ZINC_DUST = new SupremeItemStack("SUPREME_CARD_ZINC_DUST",
      Material.MUSIC_DISC_MELLOHI, "&b锌粉卡片", "", "&f改为生产锌粉", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3至尊合成材料");

}
