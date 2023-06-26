package com.itavare0;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermakert = new LinkedList<>();
        supermakert.add(new Person("alex", 21));
        supermakert.add(new Person("Maria", 18));
        supermakert.add(new Person("Ali", 23));

//        System.out.println(supermakert.size());
//        System.out.println(supermakert.peek());
//        System.out.println(supermakert.poll());
//        System.out.println(supermakert.size());
//        System.out.println(supermakert.peek());

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
    }

    static record Person(String name, int age) {

    }
}
