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
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b海绵&f2%个"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b海晶灯&f2%个"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b鳕鱼&f20%个"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b鲑鱼&f20%个"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b热带鱼&f20%个"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b墨囊&f20%个"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b鹦鹉螺&f6%个"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b木棍&f5%个"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.FISHING_ROD, null, "&f给予&b线&f5%个"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b海绵&f10%个"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b海晶灯&f10%个"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b鳕鱼&f5%个"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b鲑鱼&f5%个"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b热带鱼&f5%个"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b墨囊&f5%个"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b鹦鹉螺&f20%个"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b木棍&f20%个"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.TRIDENT, null, "&f给予&b线&f20%个"));
    displayRecipes.add(new ItemStack(Material.STRING));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b海绵&f1%个"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b海晶灯&f1%个"));
    displayRecipes.add(new ItemStack(Material.SEA_LANTERN));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b鳕鱼&f3%个"));
    displayRecipes.add(new ItemStack(Material.COD));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b鲑鱼&f3%个"));
    displayRecipes.add(new ItemStack(Material.SALMON));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b热带鱼&f2%个"));
    displayRecipes.add(new ItemStack(Material.TROPICAL_FISH));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b墨囊&f2%个"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b鹦鹉螺&f5%个"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&bS木棍&f50%个"));
    displayRecipes.add(new ItemStack(Material.STICK));
    displayRecipes.add(new CustomItemStack(Material.GOLDEN_HOE, null, "&f给予&b线&f33%个"));
    displayRecipes.add(new ItemStack(Material.STRING));
    return displayRecipes;
  }

}
