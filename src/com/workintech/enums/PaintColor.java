package com.workintech.enums;

public enum PaintColor {
    RED(0),
    BLACK(1),
    WHITE(2),
    GREEN(3);

    private  int colorCode;

    PaintColor(int colorCode) {
        this.colorCode = colorCode;
    }
}
