package com.company;

public class HealthyBurger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat,double price){
        System.out.println(meat +" in healthy burger");
    }

    public double addHealthyAddition1(String name ,double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=this.healthyExtra1Price+price;

        return healthyExtra1Price;
    }
    public double addHealthyAddition2(String name , double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price+=price;
        return healthyExtra2Price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }
}
