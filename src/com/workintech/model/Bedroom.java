package com.workintech.model;

public class Bedroom  extends Room{

    private Wardrobe wardrobe;
    private Carpet carpet;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Cyling cyling,
                   Lamp lamp, Wardrobe wardrobe, Carpet carpet, Bed bed) {
        super(name, wall1, wall2, wall3, wall4, cyling, lamp);
        this.wardrobe = wardrobe;
        this.carpet = carpet;
        this.bed = bed;
    }

    //Boilerplate code :amelelik kodu bunun ileride daha kısa yolunu öğreneceğiz.


    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Bed getBed() {
        return bed;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + getName() + '\'' +     //Burada get metoduyla ulaştıklarımızı Room sınıfında private
                ", wall1=" + getWall1() +         //olarak tanımladık.
                ", wall2=" + getWall2() +
                ", wall3=" + getWall3() +
                ", wall4=" + getWall4() +
                ", cyling=" + getCyling() +
                ", lamp=" + getLamp() +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                ", bed=" + bed +
                '}';
    }
}
