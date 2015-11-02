package com.suaft.bountyboard.creativetab;

import com.suaft.bountyboard.init.ModItems;
import com.suaft.bountyboard.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBountyBoard {

	public static final CreativeTabs BOUNTYBOARD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem()
		{
			return ModItems.test;
		}
	};
	
}
