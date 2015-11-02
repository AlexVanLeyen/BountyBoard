package com.suaft.bountyboard.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipies {
	public static void init()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.test), " s ", "sss", " s ", 's', "stickWood"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.foo), new ItemStack(ModItems.test), new ItemStack(ModItems.test)));
	}
}
