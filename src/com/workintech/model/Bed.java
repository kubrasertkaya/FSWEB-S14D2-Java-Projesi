package com.workintech.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private  int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public  void make(){
        System.out.println("The bed is being made.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("***********************\n");
        builder.append("style:" + style + "\n");
        builder.append("pillows:" + pillows + "\n");
        builder.append("height:" + height + "\n");
        builder.append("sheets:" + sheets + "\n");
        builder.append("quilt:" + quilt + "\n");
        builder.append("***********************");
        return builder.toString();
    }
}
