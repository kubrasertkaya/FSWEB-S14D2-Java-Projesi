package com.workintech.model;

public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Cyling cyling;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Cyling cyling, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.cyling = cyling;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Cyling getCyling() {
        return cyling;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
