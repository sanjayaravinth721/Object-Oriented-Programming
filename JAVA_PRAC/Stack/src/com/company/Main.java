package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("STACK......");
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter no of ele");
        int n = s.nextInt();

        System.out.println("Enter "+n+" integers");
        for(int i=0;i<n;i++){
            stack.push(s.nextInt());
        }
        System.out.println("PEEKING.. "+stack.peek());  //displaying top
        System.out.println("POPING.. "+stack.pop());   //deleting top of stack
        for(int i=0;i< stack.size();i++){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
        System.out.println("Stack capacity: "+stack.capacity());


        System.out.println("NOW QUEUE......");
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter no of ele");
        int k = s.nextInt();

        System.out.println("Enter "+k+" integers");
        for(int i=0;i<n;i++){
            queue.add(s.nextInt());
        }
        System.out.println("Element "+queue.element()); //DISPLAYING FRONT VALUE
        queue.remove(6);   //removing number 6 not index
        System.out.println("DELETING FRONT VALUE.. "+queue.poll()); //->Like stack it pop front of queue value
        System.out.println("DISPLAYING GIVEN INDEX "+queue.toArray()[2]);
        for(int i:queue){
            System.out.print(i+" ");
        }
    }
}
