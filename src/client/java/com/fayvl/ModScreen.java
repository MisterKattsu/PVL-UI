package com.fayvl;

import com.fayvl.components.PVLButton;
import com.fayvl.components.PVLContainer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;

public class ModScreen extends Screen {
    PVLContainer rootContainer;
    public ModScreen() {
        super(Component.literal("Example screen"));
    }

    @Override
    public void render(GuiGraphics guiGraphics, int i, int j, float f) {
        renderBlurredBackground();
        if(this.rootContainer == null && this.minecraft != null){
            this.rootContainer = new PVLContainer(null, 0, 0, this.minecraft.getWindow().getGuiScaledWidth(), this.minecraft.getWindow().getGuiScaledHeight());
        }

        if(this.rootContainer != null) {
            rootContainer.render(guiGraphics, i, j, f);
        }
    }

    @Override
    public boolean mouseClicked(double d, double e, int i) {
//        if(btn.mouseClicked(d, e, i)) return true;
        return false;
    }
}
