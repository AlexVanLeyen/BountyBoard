package com.suaft.bountyboard.init;

import com.suaft.bountyboard.item.ItemBountyBoard;
import com.suaft.bountyboard.item.ItemTest;
import com.suaft.bountyboard.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemBountyBoard test = new ItemTest();
	
	public static void init()
	{
		GameRegistry.registerItem(test, "test");
	}
	
	
}
