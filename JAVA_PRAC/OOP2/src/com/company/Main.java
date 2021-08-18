package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer p = new Printer(50,false);
        System.out.println("The amount of toner is "+p.addToner(50));
        System.out.println("Initial page count is "+p.printPages(4));
        int pagesPrinted = p.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count was "+p.getPagesPrinted());

    }
}
