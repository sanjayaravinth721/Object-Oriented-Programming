package com.company;

public class Circle {
    private double radius;

    public Circle(double Radius){
        if(Radius<0){
            this.radius=0;
        }
        else {
            this.radius = Radius;
        }
    }

    public void setRadius(double Radius){
        this.radius=Radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
