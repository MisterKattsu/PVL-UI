package com.fayvl.components;

import net.minecraft.client.gui.components.AbstractButton;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.network.chat.Component;

public class PVLButton extends AbstractButton {


    public PVLButton(int x, int y, int w, int h, Component component){
        super(x, y, w, h, component);
    }

    @Override
    protected void updateWidgetNarration(NarrationElementOutput narrationElementOutput) {

    }

    public void onPress() {

    }


}
