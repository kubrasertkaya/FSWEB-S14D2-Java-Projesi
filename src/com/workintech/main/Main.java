package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom=new Bedroom("Kübra",
                new Wall(Direction.EAST),
                new Wall(Direction.NORTH),
                new Wall(Direction.WEST),
                new Wall(Direction.SOUTH),
                new Cyling(1, PaintColor.BLACK),
                new Lamp(LampType.LAVA,true,3),
                new Wardrobe(5,10,20.5),
                new Carpet(5,10,PaintColor.RED),
                new Bed("Çift kişilik",5,6,3,4));

           bedroom.getBed().make();
           bedroom.getCarpet().lying();
           bedroom.getLamp().turnOn();
           bedroom.getWardrobe().add();

        System.out.println(bedroom);
        System.out.println("************************");
        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());
    }
}