package com.playground.java.generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {

        //Type erasure
        List<String> lista = new ArrayList();
        lista.add("Douglas");
        lista.add("Blue");
        lista.add("Sao Paulo - Brazil");

        for(Object list :  lista) {
            System.out.println(list);
        }

        add(lista, 1L);

        for(Object list :  lista) {
            System.out.println(list);
        }


    }

    //passing List without any type, but java in code compile dont see any type, this is why I can add a noun type object Long in the list.
    public static void add(List lista, Long number){
        lista.add(number);
    }
}
