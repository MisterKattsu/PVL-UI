package com.fayvl.components;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.renderer.RenderType;

// Container = a box with a background and maybe a border and maybe something else later on? TODO
// TODO: Delete most of what we've done. And Replace to a system closer to Framelayout
public class PVLContainer extends PVLAbstractGuiElement {

    public PVLContainer(PVLAbstractGuiElement parent, int x, int y, int w, int h) {
        super(parent, x, y, w, h);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int i, int j, float f) {
        guiGraphics.fill(RenderType.gui(), this.getAbsX(), this.getAbsY(), this.getW(), this.getH(), 0x77000000);
    }
}
