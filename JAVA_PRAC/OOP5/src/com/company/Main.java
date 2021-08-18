package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public  static  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Player p =new Player("Sanjay",10,100);
        System.out.println(p.toString());
        saveObject(p);
        p.setHitPoints(3);
        System.out.println(p);
        p.setWeapon("Storm");
        saveObject(p);
        loadObject(p);
        System.out.println(p.toString());

        ISaveable M = new Monster("shingami",78,200);
        System.out.println(M);
        System.out.println(((Monster)M).getStrength());



    }
    public static ArrayList<String> readValues(){
        ArrayList<String> value = new ArrayList<>();

        boolean quit=false;
        int i =0;
        System.out.println("Choose\n"+
                "1 to enter a string\n"+
                "0 to quit");
        while (!quit){
            System.out.print("Choose an option: ");
            int c = s.nextInt();
            s.nextLine();
            switch (c){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String sc = s.nextLine();
                    value.add(i,sc);
                    i++;
                    break;
            }
        }
        return value; //sanjay , 5, 100 , thor
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> value = readValues();  //sanjay , 5 ,100 , thor
        objectToLoad.read(value);
    }
}
