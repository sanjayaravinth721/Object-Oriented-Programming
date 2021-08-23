package com.company;

//To use Comparable we must implements its interface//

public class Students implements Comparable<Students>{
    String name;
    String rollNo;
    int marks;

    public Students(String name, String rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name = "+this.name +", "+"rollNo = "+this.rollNo+", "+"marks = "+this.marks;
    }

    @Override
    public int compareTo(Students i) {
        if(marks>i.marks){
            return 1;
        }
        else{
            return 0;
        }
    }
}
