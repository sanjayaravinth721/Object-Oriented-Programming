package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> obj = new HashSet<>();

        boolean t = true;
        Scanner s = new Scanner(System.in);


        while (t){
            System.out.println("1 to add");
            System.out.println("2 to exit");
            int a = s.nextInt();
            switch (a){
                case 1:
                    int add = s.nextInt();
                    System.out.println("Adding");
                    obj.add(add);
                    break;
                case 2:
                    System.out.println("Exit");
                    t=false;
                    break;
            }
        }
        List<Integer> obj2 = new LinkedList<>(obj);
       // Collections.sort(obj2);

        for(int i:obj2){
            obj.addAll(obj2);
        }
        System.out.println("Adding all");
        for(int i:obj){
            System.out.println(i);
        }

        Set<String> str = new HashSet<>();
        t=true;
        while (t){
            System.out.println("1 to add");
            System.out.println("2 to exit");
            int a = s.nextInt();
            s.nextLine();
            switch (a){
                case 1:
                    String add1 = s.nextLine();
                    System.out.println("Adding");
                    str.add(add1);
                    break;
                case 2:
                    System.out.println("Exit");
                    t=false;
                    break;
            }
        }
        List<String> sortstr = new LinkedList<>(str);
        Collections.sort(sortstr);
        for(String i: sortstr){
            System.out.println(i);
        }

    }
}
