package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double height=s.nextDouble();
        Cylinder c = new Cylinder(radius,height);
        Circle c1=new Circle(radius);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c.getVolume());
    }
}
