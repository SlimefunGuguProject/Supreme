package com.github.relativobr.supreme;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getNewIdSupremeLegacy;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getOldIdSupremeLegacy;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadComponents;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadCoreResource;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadGear;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadGenerators;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadMachines;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.machine.AbstractQuarryOutput;
import com.github.relativobr.supreme.machine.AbstractQuarryOutputItem;
import com.github.relativobr.supreme.setup.MainSetup;
import com.github.relativobr.supreme.util.CompatibilySupremeLegacyItem;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Nonnull;

import net.guizhanss.guizhanlibplugin.updater.GuizhanBuildsUpdaterWrapper;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Supreme extends JavaPlugin implements SlimefunAddon {

  private static Supreme instance;
  private static SupremeOptions supremeOptions = null;
  private static SupremeLocalization localization = null;
  private static List<CompatibilySupremeLegacyItem> legacyItem = null;

  public static Supreme inst() {
    return instance;
  }

  public static SupremeOptions getSupremeOptions() {
    if (supremeOptions == null) {
      ConfigurationSection typeSection = inst().getConfig().getConfigurationSection("options");
      if (typeSection != null) {
        supremeOptions = SupremeOptions.builder().autoUpdate(typeSection.getBoolean("auto-update"))
            .useLegacySupremeexpansionItemId(
                typeSection.getBoolean("use-legacy-supremeexpansion-item-id", false))
            .lang(typeSection.getString("lang", "en-US"))
            .customTickerDelay(typeSection.getInt("custom-ticker-delay"))
            .enableGenerators(typeSection.getBoolean("enable-generators", true))
            .limitProductionGenerators(typeSection.getBoolean("limit-production-generators", false))
            .enableQuarry(typeSection.getBoolean("enable-quarry", true))
            .limitProductionQuarry(typeSection.getBoolean("limit-production-quarry", false))
            .baseTimeVirtualGarden(typeSection.getInt("base-time-virtual-garden", 15))
            .baseTimeVirtualAquarium(typeSection.getInt("base-time-virtual-aquarium", 15))
            .baseTimeMobCollector(typeSection.getInt("base-time-mob-collector", 15))
            .baseTimeTechGenerator(typeSection.getInt("base-time-tech-generator", 1800))
            .enableWeapons(typeSection.getBoolean("enable-weapons", true))
            .enableTools(typeSection.getBoolean("enable-tools", true))
            .enableArmor(typeSection.getBoolean("enable-armor", true))
            .enableTech(typeSection.getBoolean("enable-tech", true))
            .enableItemConverter(typeSection.getBoolean("enable-item-converter-machine", true))
            .customBc(typeSection.getBoolean("custom-bc", false)).build();
      }
    }
    return supremeOptions;
  }

  public static SupremeLocalization getLocalization() {
    if (localization == null) {
      localization = new SupremeLocalization(inst());
      localization.addLanguage(getSupremeOptions().getLang());
    }
    return localization;
  }

  public static List<CompatibilySupremeLegacyItem> getLegacyItem() {
    if (legacyItem == null || legacyItem.isEmpty()) {
      if (legacyItem == null) {
        legacyItem = new ArrayList<>();
      }
      loadComponents(legacyItem);
      loadGear(legacyItem);
      loadGenerators(legacyItem);
      loadMachines(legacyItem);
      loadCoreResource(legacyItem);
    }
    return legacyItem;
  }

  @Nonnull
  private static Map<Enchantment, Integer> getEnchants(@Nonnull ConfigurationSection section) {
    Map<Enchantment, Integer> enchants = new HashMap<>();
    for (String path : section.getKeys(false)) {
      Enchantment e = new EnchantmentWrapper(path);
      if (e != null) {
        int level = section.getInt(path);
        if (level > 0 && level <= 100) {
          enchants.put(e, level);
        } else if (level != 0) {
          enchants.put(e, 1);
        }
      }
    }
    return enchants;
  }

  public static int getValueGeneratorsWithLimit(int value) {
    return getSupremeOptions().isLimitProductionGenerators() ? (value / 5) : value;
  }

  public static String buildNameTier(String newName, Integer tier) {
    switch (tier) {
      case 1:
        return ChatColor.GRAY + newName + " I";
      case 2:
        return ChatColor.DARK_GREEN + newName + " II";
      case 3:
        return ChatColor.GREEN + newName + " III";
      case 4:
        return ChatColor.DARK_BLUE + newName + " IV";
      case 5:
        return ChatColor.BLUE + newName + " V";
      case 6:
        return ChatColor.GOLD + newName + " VI";
      case 7:
        return ChatColor.YELLOW + newName + " VII";
      case 8:
        return ChatColor.DARK_RED + newName + " VIII";
      case 9:
        return ChatColor.DARK_PURPLE + newName + " IX";
      default:
        return ChatColor.DARK_GRAY + newName;
    }
  }

  public static String buildIdTier(String newName, Integer tier) {
    switch (tier) {
      case 1:
        return newName + "_I";
      case 2:
        return newName + "_II";
      case 3:
        return newName + "_III";
      case 4:
        return newName + "_IV";
      case 5:
        return newName + "_V";
      case 6:
        return newName + "_VI";
      case 7:
        return newName + "_VII";
      case 8:
        return newName + "_VIII";
      case 9:
        return newName + "_IX";
      default:
        return newName + "_0";
    }
  }

  public static String buildLoreRadioactivityType(MobTechType mobTechType) {
    Radioactivity radioactivity;
    switch (mobTechType) {
      case MUTATION_INTELLIGENCE:
      case MUTATION_BERSERK:
      case MUTATION_LUCK:
        radioactivity = Radioactivity.VERY_DEADLY;
        break;
      case ROBOTIC_CLONING:
      case ROBOTIC_ACCELERATION:
      case ROBOTIC_EFFICIENCY:
        radioactivity = Radioactivity.HIGH;
        break;
      case SIMPLE:
      default:
        radioactivity = Radioactivity.LOW;
    }
    return radioactivity.getLore();
  }

  public static String buildLoreType(MobTechType mobTechType, Integer tier) {
    String tierString = String.valueOf(tier + 1);
    switch (mobTechType) {
      case MUTATION_BERSERK:
      case ROBOTIC_ACCELERATION:
        return ChatColor.YELLOW + "+" + tierString + "x " + ChatColor.GRAY + "处理速度" +
            ChatColor.YELLOW + "+" + tierString + "0%" + ChatColor.GRAY +"电力消耗";
      case MUTATION_LUCK:
      case ROBOTIC_CLONING:
        return buildLoreTypeLuckAndCloning(tier);
      case MUTATION_INTELLIGENCE:
      case ROBOTIC_EFFICIENCY:
        return ChatColor.YELLOW + tierString + "0% " + ChatColor.GRAY + "减少电力消耗";
      case SIMPLE:
      default:
        return ChatColor.GRAY + "提升处理速度";
    }
  }

  private static String buildLoreTypeLuckAndCloning(Integer tier) {
    if (tier >= 8) {
      return ChatColor.YELLOW + "5x " + ChatColor.GRAY + "物品复制";
    } else if (tier >= 6) {
      return ChatColor.YELLOW + "4x " + ChatColor.GRAY + "物品复制";
    } else if (tier >= 4) {
      return ChatColor.YELLOW + "3x " + ChatColor.GRAY + "物品复制";
    } else {
      return ChatColor.YELLOW + "2x " + ChatColor.GRAY + "物品复制";
    }
  }

  private static String buildLoreTypeAmount(MobTechType mobTechType, Integer tier) {
    String tierString = String.valueOf(tier + 1);
    switch (mobTechType) {
      case MUTATION_BERSERK:
      case ROBOTIC_ACCELERATION:
        return ChatColor.YELLOW + "增加 (" + tierString+ " x 物品组数 x 0.5)  "
            + ChatColor.GRAY + " 处理速度";
      case MUTATION_INTELLIGENCE:
      case ROBOTIC_EFFICIENCY:
        return ChatColor.YELLOW + "减少 (" + tierString + " x 物品组数 x 0.15625)"
            + ChatColor.GRAY + " 电力消耗";
      case MUTATION_LUCK:
      case ROBOTIC_CLONING:
        return ChatColor.YELLOW + "(" + tierString + "x 物品组数)"
            + ChatColor.GRAY + " 处理速度 (上限: 64x)";
      case SIMPLE:
      default:
        return ChatColor.YELLOW + "1x 物品组数" + ChatColor.GRAY + " 处理速度";
    }
  }

  public static SlimefunItemStack buildItemFromMobTechDTO(MobTechGeneric mobTechGeneric,
      Integer tier) {
    return new SlimefunItemStack(buildIdTier(mobTechGeneric.getId(), tier),
        mobTechGeneric.getTexture(),
        buildNameTier(mobTechGeneric.getName(), tier), "",
        buildLoreRadioactivityType(mobTechGeneric.getMobTechType()),
        buildLoreType(mobTechGeneric.getMobTechType(), tier),
        buildLoreTypeAmount(mobTechGeneric.getMobTechType(), tier), "", "&3至尊合成材料");
  }

  public static AbstractQuarryOutput getOutputQuarry(@Nonnull SlimefunItemStack item) {

    ConfigurationSection typeSection = inst().getConfig()
        .getConfigurationSection("quarry-custom-output");

    if (typeSection == null) {
      inst().log(Level.SEVERE,
          "Config section \"quarry-custom-output\" missing, Check your config and report this!");
      return null;
    }

    // find path
    String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();
    ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);

    List<AbstractQuarryOutputItem> outputItems = new ArrayList<>();
    if (itemSection != null) {
      int checkLimitChance = 0;
      for (int i = 1; i <= 12; i++) {
        ConfigurationSection itemConfig = itemSection.getConfigurationSection(String.valueOf(i));
        if (itemConfig == null || checkLimitChance >= 100) {
          break;
        }
        int chance = itemConfig.getInt("chance");
        if (checkLimitChance + chance >= 100) {
          chance = 100 - checkLimitChance;
        }
        final String itemId = itemConfig.getString("item");
        if(itemId == null){
          continue;
        }
        if (itemConfig.getBoolean("is-slimefun")) {
          SlimefunItem slimefunItem = SlimefunItem.getById(itemId);
          //check Legacy Supreme
          if (slimefunItem == null && getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
            slimefunItem = SlimefunItem.getById(getOldIdSupremeLegacy(itemId));
          }
          if (slimefunItem != null) {
            outputItems.add(
                AbstractQuarryOutputItem.builder().itemStack(slimefunItem.getItem().clone())
                    .chance(getSupremeOptions().isLimitProductionQuarry() ? (chance / 2) : chance)
                    .build());
          }
        } else {
          final Material material = Material.matchMaterial(itemId);
          if (material != null) {
            outputItems.add(AbstractQuarryOutputItem.builder().itemStack(new ItemStack(material, 1))
                .chance(getSupremeOptions().isLimitProductionQuarry() ? (chance / 2) : chance)
                .build());
          }
        }
        checkLimitChance = checkLimitChance + chance;
      }
    } else {
      inst().log(Level.SEVERE,
          "Config section for " + itemPath + " missing, Check your config and report this!");
    }

    return AbstractQuarryOutput.builder().outputItems(outputItems).build();
  }

  @Override
  public void onEnable() {

    instance = this;

    Supreme.inst().log(Level.INFO, "########################################");
    Supreme.inst().log(Level.INFO, "      Supreme 2.0  作者:RelativoBR       ");
    Supreme.inst().log(Level.INFO, "         汉化:SlimefunGuguProject        ");
    Supreme.inst().log(Level.INFO, "########################################");

    Config cfg = new Config(this);
    if (getSupremeOptions() == null) {
      log(Level.SEVERE, "配置文件中 \"options\" 部分缺失, 请检查下载文件的完整性, 并汇报该问题!");
      inst().onDisable();
      return;
    }

    if (getSupremeOptions().isAutoUpdate()
        && cfg.getBoolean("options.auto-update")
        && getDescription().getVersion().startsWith("Build")) {
      Supreme.inst().log(Level.INFO, "自动更新: 已启用");
      GuizhanBuildsUpdaterWrapper.start(this, getFile(), "SlimefunGuguProject", "Supreme", "main", false);
    } else {
      Supreme.inst().log(Level.INFO, "自动更新: 已禁用");
    }

    // localization
    Supreme.inst().log(Level.INFO, "已加载语言: " + getSupremeOptions().getLang());
    getLocalization();

    // check Compatibily Legacy (SupremeExpansion)
    if (getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
      Supreme.inst().log(Level.INFO, "至尊研究院1.0物品ID兼容: 已启用");
      getLegacyItem();
    } else {
      Supreme.inst().log(Level.INFO, "至尊研究院1.0物品ID兼容: 已禁用");
    }

    MainSetup.setup(this);

  }

  @Override
  public void onDisable() {
    instance = null;
  }

  @Override
  public String getBugTrackerURL() {
    return "";
  }

  @Override
  public JavaPlugin getJavaPlugin() {
    return this;
  }

  public void addSupremeEnchantsAndSoulbound(@Nonnull SlimefunItemStack... items) {

    ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

    if (typeSection == null) {
      log(Level.SEVERE,
          "配置文件中 \"supreme-enchant\" 部分缺失, 请检查下载文件的完整性, 并汇报该问题!");
      return;
    }

    for (SlimefunItemStack item : items) {

      ItemMeta meta = item.getItemMeta();

      // lore
      List<String> lore;
      if (meta.hasLore()) {
        lore = meta.getLore();
      } else {
        lore = new ArrayList<>();
        lore.add("");
      }

      lore.add(ChatColor.AQUA + "灵魂绑定");

      // find path
      String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();

      String amplifier = "I";
      if (itemPath.contains("legendary") || itemPath.contains("supreme")) {
        amplifier = "III";
      } else if (itemPath.contains("epic") || itemPath.contains("rare")) {
        amplifier = "II";
      }

      if (itemPath.contains("helmet")) {
        lore.add(ChatColor.DARK_PURPLE + "夜视 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "水下速掘 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "水下呼吸 " + amplifier);
      } else if (itemPath.contains("chestplate")) {
        lore.add(ChatColor.DARK_PURPLE + "伤害抵抗 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "提升伤害 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "饱和 " + amplifier);
      } else if (itemPath.contains("leggings")) {
        lore.add(ChatColor.DARK_PURPLE + "速度 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "急迫 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "再生 " + amplifier);
      } else if (itemPath.contains("boots")) {
        lore.add(ChatColor.DARK_PURPLE + "海豚的恩惠 " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "抗火 " + amplifier);
      }

      meta.setLore(lore);

      ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
      if (itemSection != null) {
        // unbreakable and enchants
        meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
        for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
          meta.addEnchant(entry.getKey(), entry.getValue(), true);
        }
      } else {
        log(Level.SEVERE,
            "配置文件中 " + itemPath + " 部分缺失, 请检查下载文件的完整性, 并汇报该问题!");
      }

      // add meta
      item.setItemMeta(meta);

    }
  }

  public void addGearEnchants(@Nonnull SlimefunItemStack... items) {
    ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

    if (typeSection == null) {
      log(Level.SEVERE,
          "配置文件中 \"supreme-enchant\" 部分缺失, 请检查下载文件的完整性, 并汇报该问题!");
      return;
    }

    for (SlimefunItemStack item : items) {

      ItemMeta meta = item.getItemMeta();

      // lore
      List<String> lore;
      if (meta.hasLore()) {
        lore = meta.getLore();
      } else {
        lore = new ArrayList<>();
        lore.add("");
      }

      lore.add(ChatColor.AQUA + "灵魂绑定");

      // find path
      String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();

      meta.setLore(lore);

      ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
      if (itemSection != null) {
        // unbreakable and enchants
        meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
        for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
          meta.addEnchant(entry.getKey(), entry.getValue(), true);
        }
      } else {
        log(Level.SEVERE,
            "配置文件中 " + itemPath + " 部分缺失, 请检查下载文件的完整性, 并汇报该问题!");
      }

      // add meta
      item.setItemMeta(meta);

    }
  }

  public final void log(Level level, String messages) {
    this.getLogger().log(level, messages);
  }

}
