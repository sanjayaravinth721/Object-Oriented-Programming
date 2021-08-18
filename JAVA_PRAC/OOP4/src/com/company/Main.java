package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        DeluxeBurger d = new DeluxeBurger();
        HealthyBurger h1=new HealthyBurger("ChipMeat",12.6);
        Hamburger h = new Hamburger(d,h1,"Spiceychick","Chicken",23.9,"tiny");
        //h.Burgers();


            System.out.println("enter the hamburger");
            int a=s.nextInt();
            switch (a){
                case 1:
                    h.addHamburgerAddition1("lampymutton",7.8);
                    System.out.println(h.getAddition1Name()+" is ordered");
                    h.Burgers();
                    break;
                case 2:
                    h.addHamburgerAddition2("creepkit",32.5);
                    System.out.println(h.getAddition2Name()+" is ordered");
                    h.Burgers();
                    break;
                case 3:
                    h.addHamburgerAddition3("juicypron",7.4);
                    System.out.println(h.getAddition3Name()+" is ordered");
                    h.Burgers();
                    break;
                case 4:
                    h.addHamburgerAddition4("brickyPron",8.4);
                    System.out.println(h.getAddition4Name()+" is ordered");
                    h.Burgers();
                    break;
                default:
                    System.out.println("Sorry this burger is not available");
                    break;
            }
        }

}
