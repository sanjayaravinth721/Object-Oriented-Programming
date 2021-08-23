package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        List<Students> stud = new ArrayList<>();
        System.out.println("How many students do you want to register?");
        int n = s.nextInt();
        System.out.println("Enter "+n+" students details");

        for(int i=1;i<=n;i++){
            System.out.println("Enter "+i+" person name");
            String name = s.nextLine();
            s.nextLine();
            System.out.println("Enter "+i+" person roll no");
            String roll = s.nextLine();
            System.out.println("Enter the "+i+" person marks");
            int marks = s.nextInt();
            stud.add(new Students(name,roll,marks));
            s.nextLine();
        }

        //In Students class we need to implement comparable<T> So then we can sort our object based on our compareTo method
        //COMPARABLE IS ALSO AN FUNCTIONAL INTERFACE
        Collections.sort(stud);
        for(Students i: stud){
            System.out.println(i);
        }
        



    }
}
