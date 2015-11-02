package com.suaft.bountyboard.init;

import com.suaft.bountyboard.block.BlockBountyBoard;
import com.suaft.bountyboard.block.BlockFoo;
import com.suaft.bountyboard.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockBountyBoard foo = new BlockFoo();
	
	public static void init()
	{
		GameRegistry.registerBlock(foo, "foo");
	}
}
