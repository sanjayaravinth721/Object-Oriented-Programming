package com.company;

import java.util.Scanner;

public class Hamburger {
    Scanner s = new Scanner(System.in);
    private DeluxeBurger deluxeBurger;
    private HealthyBurger healthyBurger;
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price=0.0;
    private String addition2Name;
    private double addition2Price=0.0;
    private String addition3Name;
    private double addition3Price=0.0;
    private String addition4Name;
    private double addition4Price=0.0;

    public Hamburger(DeluxeBurger deluxeBurger,HealthyBurger healthyBurger, String name, String meat, double price, String breadRollType) {
        this.deluxeBurger = deluxeBurger;
        this.healthyBurger = healthyBurger;
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name,double price){
        this.addition1Name=name;
        this.addition1Price+=price;
    }
    public void addHamburgerAddition2(String name,double price){
        this.addition2Name=name;
        this.addition2Price+=price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3Name=name;
        this.addition3Price+=price;
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4Name=name;
        this.addition4Price+=price;
    }
    public double itemizeHamburger(){
        this.price=this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
        return price;
    }

    private double delux(){
        this.price=this.price+deluxeBurger.getPrice();
        return this.price;
    }
    private double healthy(){
        //int d=s.nextInt();
        System.out.println("In healthyBurger how many additions do you want?");
        //System.out.println("If you dont want pls press 5");

            System.out.println("Select upto 2 additions");
            int b = s.nextInt();
            switch (b) {
                case 1:
                    System.out.println("you have selected add 1");
                    healthyBurger.addHealthyAddition1("VeggieCheese", 23.8);
                    System.out.println(healthyBurger.getHealthyExtra1Name() + " is added cost was "+healthyBurger.getHealthyExtra1Price());
                    this.price += healthyBurger.getHealthyExtra1Price();
                    break;
                case 2:
                    System.out.println("you have selected add 2");
                    healthyBurger.addHealthyAddition2("pringleVeggie", 12.6);
                    System.out.println(healthyBurger.getHealthyExtra2Name() + " is added cost was "+healthyBurger.getHealthyExtra2Price());
                    this.price += healthyBurger.getHealthyExtra2Price();
                    break;
                default:
                    System.out.println("Sorry! you have entered more than 2");
                    break;
            }

        return this.price;

    }
    private double TotalPrice(){
        return this.price;
    }
    public void Burgers(){
        AddExtraBurgers();
        System.out.println("Your total price is: "+TotalPrice());
    }

    private void AddExtraBurgers(){
        System.out.println("There are" +
                           " 1: DeluxBurger " +
                           " 2: HealthyBurger " +
                           " What burgers do you want?");
        //int a = s.nextInt();


        while (true) {
            System.out.println("Enter your order number: ");
            System.out.println("To close your order press 0 please");
            int b=s.nextInt();

            switch (b) {
                case 1:
                    System.out.println("DeluxBurger Ordered+ SuccessFully");
                    delux();
                    break;
                case 2:
                    System.out.println("HealthyBurger Ordered+ SuccessFully");
                    healthy();
                    break;

            }
            if(b==0){
                System.out.println("Thanq u");
                break;
            }

        }

    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }
}

