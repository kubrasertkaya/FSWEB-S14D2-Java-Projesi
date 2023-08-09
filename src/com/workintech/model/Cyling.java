package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Cyling {
    private int height;
    private PaintColor paintedColor;

    public Cyling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println("Ceiling with "+height+"and with "+paintedColor+"has been craeted");
    }

}
