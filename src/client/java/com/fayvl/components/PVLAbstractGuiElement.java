package com.fayvl.components;

import net.minecraft.client.gui.components.Renderable;

public abstract class PVLAbstractGuiElement implements Renderable {


    private final PVLAbstractGuiElement parent;
    private int x, y, w, h;

    PVLAbstractGuiElement(PVLAbstractGuiElement parent, int x, int y, int w, int h) {
        this.parent = parent;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }


    int getAbsX() {
        return this.x;
    }

    int getAbsY() {
        return this.y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    int getW() {
        return this.w;
    }

    int getH() {
        return this.h;
    }

    PVLAbstractGuiElement getParent(){
        return this.parent;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setY(int y) {
        this.y = y;
    }
}
