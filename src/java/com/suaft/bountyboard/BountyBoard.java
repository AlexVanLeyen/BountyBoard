package com.suaft.bountyboard;

import com.suaft.bountyboard.client.handler.KeyInputEventHandler;
import com.suaft.bountyboard.handler.ConfigurationHandler;
import com.suaft.bountyboard.init.ModBlocks;
import com.suaft.bountyboard.init.ModItems;
import com.suaft.bountyboard.init.Recipies;
import com.suaft.bountyboard.proxy.IProxy;
import com.suaft.bountyboard.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Axle <alex.vanleyen@gmail.com>
 *
 */


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class BountyBoard {

	@Mod.Instance(Reference.MOD_ID)
	public static BountyBoard instance;
	
	@SidedProxy( clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		proxy.registerKeyBindings();
		
		ModItems.init();
		
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		Recipies.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
