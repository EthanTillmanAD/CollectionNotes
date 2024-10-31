package notes;

import java.util.*;

public class QueueNotes {
    public static void main(String[] args) {

        /*
        queues its first in first out(FIFO)
        stacks its last in first out(LIFO)
        deque its both (FIFO) and (LIFO)
         */

        Queue<String> x = new LinkedList<>();
        System.out.println("-----------------");
        System.out.println("``Queue``");
        x.add("HI");
        x.add("Hello");
        x.add("Hola");

        System.out.println(x);// this will print the entire list

        System.out.println(x.peek());// this prints the next item on the list
        x.poll();// this works similar to remove, except once the Queue is empty this prints null, remove gives an error
        x.remove();
        System.out.println(x.peek());// from top to bottom it removes the first element first before anything else


        Deque<String> y = new ArrayDeque<>();// with a Deque we have access to .addFirst and .addLast
        //with this we can access elements from front and back Queue is only (FIFO) where as Deque is both (FIFO) and (LIFO)
        System.out.println("-----------------");
        System.out.println("``Deque``");
        y.addFirst("Hi");
        y.addFirst("Hello");
        y.addLast("Hola");


        System.out.println(y.peek());


        Stack<String> i = new Stack<>();// the stack
        System.out.println("-----------------");
        System.out.println("``Stack``");
        i.add("Hi");
        i.add("Hello");
        i.add("Hola");

        System.out.println(i.peek());//this prints Hola or last element
        i.pop(); // this removes Hola
        System.out.println(i.peek());// this prints Hello/ next to last element


    }
}
