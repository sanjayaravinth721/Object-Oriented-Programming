package com.company;

public class SIBTesrtt {

    public static final String owner;




    static {
        owner="sanjay";
        System.out.println("Static 1 has called");
    }

    public void Method(){
        System.out.println("Method is called");
    }
    static{
        System.out.println("Static 2 is called");
    }
    public void getName(){
        System.out.println("Owner name is :"+this.owner);
    }
}
