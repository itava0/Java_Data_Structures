package com.itavare0;

import java.util.LinkedList;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<WorkingWithQueues.Person> linkedList = new LinkedList<>();
        linkedList.add(new WorkingWithQueues.Person("Alex", 21));
        linkedList.add(new WorkingWithQueues.Person("Adrian", 26));

        for (WorkingWithQueues.Person person : linkedList) {
            System.out.println(person);
        }

        LinkedList<String> linkedList1 = new LinkedList<>();

        linkedList1.add("Milk");
        linkedList1.add("Eggs");
        linkedList1.add("Cheese");


        System.out.println(linkedList1);
        System.out.println(linkedList1.indexOf("Eggs"));

    }

}
