package com.github.relativobr.supreme.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.annotation.Nonnull;

public class UtilEnergy {

  private static final DecimalFormat FORMAT = new DecimalFormat("###,###,##0.00",
      DecimalFormatSymbols.getInstance(Locale.ENGLISH));

  @Nonnull
  public static String format(double number) {
    return FORMAT.format(number);
  }

  @Nonnull
  public static String energyCapacity(Integer energy) {
    return "&8⇨ &e⚡ &7" + ((energy == null) ? "无限" : format((double) energy)) + " J 容量";
  }

  @Nonnull
  public static String energyBuffer(Integer energy) {
    return "&8⇨ &e⚡ &7" + ((energy == null) ? "无限" : format((double) energy)) + " J 可存储";
  }

  @Nonnull
  public static String energyPowerPerSecond(int energy) {
    return "&8⇨ &b⚡ &7" + format(energy) + " J/s";
  }

  @Nonnull
  public static String energyPowerPerTick(int energy) {
    return "&8⇨ &b⚡ &7" + format(energy) + " J/tick";
  }

  @Nonnull
  public static String energyPowerPerItem(int energy) {
    return "&8⇨ &b⚡ &7" + format(energy) + " J/物品";
  }

  @Nonnull
  public static String timePerItem(double time) {
    return "&8⇨ &b⚡ &7" + (int) time + " 秒/物品";
  }

  @Nonnull
  public static String chancePerItem(double energy) {
    return "&8⇨ &b⚡ &7几率: " + format(energy) + " %";
  }

}
