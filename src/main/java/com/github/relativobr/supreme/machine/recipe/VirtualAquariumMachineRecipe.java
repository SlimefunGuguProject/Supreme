package com.github.relativobr.supreme.machine.recipe;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VirtualAquariumMachineRecipe extends MachineRecipe {

  @ParametersAreNonnullByDefault
  public VirtualAquariumMachineRecipe(ItemStack input, ItemStack[] result) {
    super(15, new ItemStack[]{input}, result);
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f2%几率获得&b海绵"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f2%几率获得&b海晶灯"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%几率获得&b鳕鱼"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%几率获得&b鲑鱼"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%几率获得&b热带鱼"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f20%几率获得&b墨囊"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f6%几率获得&b鹦鹉螺"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f5%几率获得&b木棍"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f5%几率获得&b线"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f10%几率获得&b海绵"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f10%几率获得&b海晶灯"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%几率获得&b鳕鱼"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%几率获得&b鲑鱼"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%几率获得&b热带鱼"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f5%几率获得&b墨囊"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f20%几率获得&b鹦鹉螺"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f20%几率获得&b木棍"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f20%几率获得&b线"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f1%几率获得&b海绵"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f1%几率获得&b海晶灯"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f3%几率获得&b鳕鱼"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f3%几率获得&b鲑鱼"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f2%几率获得&b热带鱼"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f2%几率获得&b墨囊"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f5%几率获得&b鹦鹉螺"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f50%几率获得&bS木棍"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f33%几率获得&b线"));
    displayRecipes.add(new ItemStack(Material.STRING));
    return displayRecipes;
  }

}
