package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1=new Wall("pring");
        Wall wall2 = new Wall("asp");
        Wall wall3=new Wall("lop");
        Wall wall4=new Wall("rio");
        Ceiling c = new Ceiling(23,"Red");
        Bed b = new Bed("Mystry",4,28,2,6);
        Lamp l = new Lamp("joy",false,9);
        Bedroom bedroom = new Bedroom("SanjBed",wall1,wall2,wall3,wall4,c,b,l);
        bedroom.BedArrangements();



    }
}
