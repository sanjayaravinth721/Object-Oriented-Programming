package com.company;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name,Wall wall1,Wall wall2,Wall wall3,Wall wall4,Ceiling ceiling,Bed bed,Lamp lamp){
        this.name=name;
        this.wall1=wall1;
        this.wall2=wall2;
        this.wall3=wall3;
        this.wall4=wall4;
        this.ceiling=ceiling;
        this.bed=bed;
        this.lamp=lamp;
    }
    public void BedArrangements(){
        turn();
        make();
        ceil();
        bedStyle();
        walls();
    }
    private void turn(){
        if(lamp.isBattery()){
            lamp.turnOn();
        }
        else{
            System.out.println("Lamp is off");
        }
    }
    private void make(){
        bed.make();
    }
    private void ceil(){
        System.out.println(ceiling.getPaintedColor());
        System.out.println(ceiling.getHeight());
    }
    private void bedStyle(){
        System.out.println("Bed Style: "+bed.getStyle());
        System.out.println("Bed height is: "+bed.getHeight());
        System.out.println("Bed pillows are: "+bed.getPillows());
        System.out.println("Bed sheets are: "+bed.getSheets());
        System.out.println("Bed quilts are: "+bed.getQuilt());

    }
    private void walls(){
        System.out.println("Wall1->"+wall1.getWall());
        System.out.println("Wall2->"+wall2.getWall());
        System.out.println("Wall3->"+wall3.getWall());
        System.out.println("Wall4->"+wall4.getWall());
    }


}
