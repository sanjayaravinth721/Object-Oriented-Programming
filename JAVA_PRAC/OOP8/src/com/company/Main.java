package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);

        String INITPASSWord="1206";
        Password p = new Password(INITPASSWord);
        System.out.println("Enter you name");
        String name = s.nextLine();
        System.out.println("Enter your password");
        String password = s.nextLine();

        boolean quit = false;

            if (INITPASSWord.equals(password)) {
                p.letMeIn(password);
                quit=true;
            }


        SIBTesrtt sib = new SIBTesrtt();
        sib.getName();
        sib.Method();

    }
}
