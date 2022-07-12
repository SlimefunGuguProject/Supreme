package com.github.relativobr.supreme.machine.recipe;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobCollectorMachineRecipe(ItemStack input, ItemStack result, Predicate<LivingEntity> predicate) {
    super(15, new ItemStack[]{input}, new ItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&f需要&b蜜蜂&f在附近"));
    displayRecipes.add(new ItemStack(Material.HONEY_BOTTLE));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&f需要&b鱿鱼&f在附近"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&f需要&b荧光鱿鱼&f在附近"));
    displayRecipes.add(new ItemStack(Material.GLOW_INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&f需要&b凋灵&f在附近"));
    displayRecipes.add(new ItemStack(Material.EXPERIENCE_BOTTLE));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&f需要&b末影龙&f在附近"));
    displayRecipes.add(new ItemStack(Material.DRAGON_BREATH));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b蜜蜂&f在附近"));
    displayRecipes.add(new ItemStack(Material.HONEYCOMB));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b羊&f在附近(有颜色的)"));
    displayRecipes.add(new ItemStack(Material.WHITE_WOOL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b牛&f在附近"));
    displayRecipes.add(new ItemStack(Material.LEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b鸡&f在附近"));
    displayRecipes.add(new ItemStack(Material.FEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b守卫者&f在附近"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b蜘蛛&f在附近"));
    displayRecipes.add(new ItemStack(Material.SPIDER_EYE));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b凋灵骷髅&f在附近"));
    displayRecipes.add(new ItemStack(Material.COAL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b凋灵&f在附近"));
    displayRecipes.add(SlimefunItems.COMPRESSED_CARBON);
    if (!getSupremeOptions().isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&f需要&b铁傀儡&f在附近"));
      displayRecipes.add(SlimefunItems.BASIC_CIRCUIT_BOARD);
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b僵尸&f在附近"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b骷髅&f在附近"));
    displayRecipes.add(new ItemStack(Material.BONE));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b爬行者&f在附近"));
    displayRecipes.add(new ItemStack(Material.GUNPOWDER));
    if (!getSupremeOptions().isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b史莱姆&f在附近"));
      displayRecipes.add(new ItemStack(Material.SLIME_BALL));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b蜘蛛&f在附近"));
    displayRecipes.add(new ItemStack(Material.STRING));
    if (!getSupremeOptions().isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b凋灵骷髅&f在附近"));
      displayRecipes.add(new ItemStack(Material.WITHER_SKELETON_SKULL));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b末影人&f在附近"));
    displayRecipes.add(new ItemStack(Material.ENDER_PEARL));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b烈焰人&f在附近"));
    displayRecipes.add(new ItemStack(Material.BLAZE_ROD));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b岩浆怪&f在附近"));
    displayRecipes.add(new ItemStack(Material.MAGMA_CREAM));
    if (!getSupremeOptions().isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b凋灵&f在附近"));
      displayRecipes.add(new ItemStack(Material.NETHER_STAR));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b恶魂&f在附近"));
      displayRecipes.add(new ItemStack(Material.GHAST_TEAR));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b劫掠兽&f在附近"));
      displayRecipes.add(new ItemStack(Material.TOTEM_OF_UNDYING));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b牛&f在附近"));
    displayRecipes.add(new ItemStack(Material.BEEF));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b猪&f在附近"));
    displayRecipes.add(new ItemStack(Material.PORKCHOP));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b鸡&f在附近"));
    displayRecipes.add(new ItemStack(Material.CHICKEN));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b羊&f在附近"));
    displayRecipes.add(new ItemStack(Material.MUTTON));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b雪傀儡&f在附近"));
    displayRecipes.add(new ItemStack(Material.SNOWBALL));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b铁傀儡&f在附近"));
    displayRecipes.add(new ItemStack(Material.IRON_INGOT));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b溺尸&f在附近"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    if (!getSupremeOptions().isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b守卫者&f在附近"));
      displayRecipes.add(new ItemStack(Material.PRISMARINE_SHARD));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b远古守卫者&f在附近"));
      displayRecipes.add(new ItemStack(Material.PRISMARINE_CRYSTALS));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&f需要&b凋灵&f在附近"));
    displayRecipes.add(new ItemStack(Material.GLASS_BOTTLE));
    return displayRecipes;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

}
