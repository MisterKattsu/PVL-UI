package com.fayvl;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;

public class GuiRenderer implements ClientModInitializer, ModInitializer {


	public static KeyMapping screenMapping = KeyBindingHelper.registerKeyBinding(new KeyMapping(
			"com.fayvl.mod.open",
			InputConstants.Type.KEYSYM,
			InputConstants.KEY_F12,
			KeyMapping.CATEGORY_INTERFACE
	));


	@Override
	public void onInitialize(){

	}

	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while(screenMapping.consumeClick()) {
				client.setScreen(new ModScreen());
			}
		});
	}
}