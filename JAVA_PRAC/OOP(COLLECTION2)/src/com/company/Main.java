package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,String> newMap = new HashMap<>();
        newMap.put("Java","OOP");
        newMap.replace("Java","OOP","DataBase");
        newMap.put("Python","Ml");
        newMap.put("C++","Game");

        for(String i:newMap.keySet()){
            System.out.println(i+": "+newMap.get(i));
        }

        if(newMap.remove("C++","Gam")){
            System.out.println("C++ removed");
        }
        else{
            System.out.println("Not");
        }


    }
}
