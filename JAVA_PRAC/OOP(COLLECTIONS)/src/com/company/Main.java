package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre t = new Theatre("PriyaComplex",10,15);
        //t.getSeat();
        t.reserveSeat("A09");
        if(t.reserveSeat("A09")){
            System.out.println("A09 reserved");
        }
        else{
            System.out.println("Sorry! already reserved");
        }
        if(t.reserveSeat("B09")){
            System.out.println("B09 reserved");
        }
        else{
            System.out.println("Sorry! already reserved");
        }
        if(t.reserveSeat("C09")){
            System.out.println("C09 reserved");
        }
        else{
            System.out.println("Sorry! already reserved");
        }

        //copying list
        List<Theatre.Seat> priceSeats = new ArrayList<>(t.seats);
        //priceSeats.add(t.new Seat("B09",13.00));
        //priceSeats.add(t.new Seat("F09",9.00));




        Collections.sort(priceSeats,t.s);
        PrintList(priceSeats);






       /* List<Theatre.Seat> theatreSeat = new LinkedList<>(t.seats);

        PrintList(theatreSeat);
        Collections.reverse(theatreSeat);
        System.out.println("Theatre seat reversed");
        PrintList(theatreSeat);
        System.out.println("Now seats printing");
        PrintList(t.seats);
        System.out.println("Sorted list");
        Collections.reverse(theatreSeat);
        Collections.sort(theatreSeat);
        PrintList(theatreSeat);

        */


    }

    private static void PrintList(List<Theatre.Seat> ts){
        for(Theatre.Seat p:ts){
            System.out.print(p.getSeatNum()+"$"+p.getPrice()+" ");
        }
        System.out.println();
        System.out.println("=========================================");
    }

    private static void SortList(List<Theatre.Seat> seat){
        for(int i=0;i<seat.size()-1;i++){
            for(int j=i+1;j< seat.size()-1;j++){
                if(seat.get(i).compareTo(seat.get(j))>0){
                    Collections.swap(seat,i,j);
                }
            }
        }
    }
}
