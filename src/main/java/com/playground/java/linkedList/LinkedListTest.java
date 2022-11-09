package com.playground.java.linkedList;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> nameLinkedList = new LinkedList<>();
        nameLinkedList.add("Douglas");
        nameLinkedList.add("Fabricia");
        nameLinkedList.add("Amelie");
        nameLinkedList.add("Anastacia");
        nameLinkedList.add("Ivone");

        for (String name : nameLinkedList) {
            System.out.println(name);
        }

        nameLinkedList.remove(3);

        System.out.println("---------------------");
        for (String name : nameLinkedList) {
            System.out.println(name);
        }

        //great for add and remove a new object.
        //not good enough for iterator.

    }
}
