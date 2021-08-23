package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first List size");
        int n = s.nextInt();
        System.out.println("Enter the lists");
        List<Integer> o1 = new LinkedList<>();
        for(int i=0;i<n;i++){
            o1.add(s.nextInt());
        }
        System.out.println("Enter second List size");
        int m = s.nextInt();
        System.out.println("Enter the lists");
        List<Integer> o2 = new LinkedList<>();
        for(int i=0;i<n;i++){
            o2.add(s.nextInt());
        }

        Comparator<Integer> c1 = new comp();
        System.out.println("Sorting 1st List");
        Collections.sort(o1,c1);   //Collections.sort(object,Comparator<T>)
        for(int i: o1){
            System.out.print(i+" ");
        }

        //we dont need to create class to implement the interface but we can alse use anonymous class which is..
        Comparator<Integer> c2 = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return -1;
                }
                else if(o1>02){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };
        System.out.println();
        System.out.println("Now using anonymous class sorting 2nd List");
        Collections.sort(o2,c2);
        for(int i:o2){
            System.out.print(i+" ");
        }



        //we can also reduce the lines of code using lambda expression which is...
        /*As we can see we "dont need" to type the "object or datatype" in the parameters
        because in compare method the parameter is "Type T->any datatype or object can be used"
         */
        /*""(IMPORTANT)""-> COMPARATOR ARE FUNCTIONAL INTERFACE WHICH MEANS IT WILL HAVE ONLY ONE ABSTRACT METHOD,
                            THEREFORE WE CAN USE LAMBDA EXPRESSION ONLY IN FUNCTIONAL INTERFACE
         */
        Comparator<Integer> c3=(p1,p2)->{
            if(p1<p2){
                return -1;
            }
            else if(p1>p2){
                return 1;
            }
            else{
                return 0;
            }
        };


    }
}
