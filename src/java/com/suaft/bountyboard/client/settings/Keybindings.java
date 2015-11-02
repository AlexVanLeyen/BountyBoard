package com.suaft.bountyboard.client.settings;

import org.lwjgl.input.Keyboard;

import com.suaft.bountyboard.reference.Names;

import net.minecraft.client.settings.KeyBinding;

public class Keybindings 
{
	public static KeyBinding charge = new KeyBinding( Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY );
	public static KeyBinding release = new KeyBinding( Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY );
}
