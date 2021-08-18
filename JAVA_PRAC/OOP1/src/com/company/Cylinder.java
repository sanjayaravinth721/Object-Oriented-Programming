package com.company;

public class Cylinder extends  Circle{
    private double height;

    public Cylinder(double Radius,double height) {
        super(Radius);
        if(height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }

}
