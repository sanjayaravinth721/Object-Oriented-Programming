package com.company;

public class DeluxeBurger {
    private double price;
    public DeluxeBurger(){
        this.price=19.10;
    }

    public double getPrice() {
        System.out.println("Fixings + chips + drink ="+price);
        return price;
    }
}
