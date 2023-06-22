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
    }

}
