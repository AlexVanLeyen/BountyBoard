package com.suaft.bountyboard.block;

import com.suaft.bountyboard.creativetab.CreativeTabBountyBoard;
import com.suaft.bountyboard.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockBountyBoard extends Block
{
	
	/**
	 * Requried constructor.
	 * @param material
	 */
	public BlockBountyBoard(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabBountyBoard.BOUNTYBOARD_TAB);
	}
	
	/**
	 * Generic constructor with default material type
	 */
	public BlockBountyBoard()
	{
		this(Material.rock);
	}
	
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		// tile.modif:blockname.name
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}
