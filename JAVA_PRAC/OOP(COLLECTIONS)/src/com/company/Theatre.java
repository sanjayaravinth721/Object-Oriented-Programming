package com.company;

import java.util.*;

public class Theatre {
    private final String SeatNum;
    public List<Seat> seats = new LinkedList<>();
    private double price;
    public Theatre(String SeatNum, int num_Rows, int seatCol) {
        this.SeatNum = SeatNum;

        int num = 'A' + (num_Rows - 1);

        for (char row = 'A'; row <= num; row++) {
            for (int i = 1; i <= seatCol; i++) {
                price=12.00;
                if(row<'D' && (i>=4 && i<=9)){
                    price=7.00;
                }
                else if(row>'D' || (i<4 || i>9)){
                    price=14.00;
                }
                Seat seat = new Seat(row + String.format("%02d", i),price);
                seats.add(seat);
            }
        }

    }

    static final Comparator<Seat> s = new Comparator<Seat>() {
        @Override
        public int compare(Seat s1, Seat s2) {
            if (s1.getPrice() < s2.getPrice()) {
                return -1;
            } else if (s1.getPrice() > s2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public boolean reserveSeat(String seat) {
        Seat req = new Seat(seat,0);
        int foundSeat = Collections.binarySearch(seats,req,null);
        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }
        else{
            System.out.println("There is no seats");
            return false;
        }
        /*for (Seat s : seats) {
            if (s.getSeatNum().equals(seat)) {

                req = s; //A09
                break;
            }
        }
        if (req == null) {
            System.out.println("There is no seats");
            return false;
        }
        return req.reserve();
       */
    }

    public Collection<Seat> getSeat() {
        return seats;
    }

    public double getPrice(){
        return price;
    }


    public class Seat implements Comparable<Seat>{
        private final String seatNum;
        private boolean reserved=false;
        private Double price;

        public Seat(String seatNum,double price){
            this.seatNum=seatNum;
            this.price=price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNum.compareToIgnoreCase(seat.getSeatNum());
        }

        public boolean reserve(){
            if(!this.reserved){
                System.out.println("Seat " + seatNum + " is reserved successfully");
                this.reserved=true;
                return true;
            }
            else{
                return false;
            }

        }

        public boolean cancel(){
            if(this.reserved){
                System.out.println("Seat "+seatNum+" is cancelled");
                this.reserved=false;
                return true;
            }
            else{
                return false;
            }
        }

        public String getSeatNum() {
            return seatNum;
        }
        public double getPrice(){
            return price;
        }
    }
}


