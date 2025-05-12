package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width , double height , double length){
        super(width, length);
        this.height = height < 0 ? 0 : height;

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
