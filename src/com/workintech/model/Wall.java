package com.workintech.model;

import com.workintech.enums.Direction;

public class Wall {

    private Direction direction; //NORTH ,WEST,EAST,SOUTH BUNLAR OLABİLİR.Bu yüzden enum yapablirim.

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void create(){
        System.out.println("Wall has been created on:" + direction);
    }
}
