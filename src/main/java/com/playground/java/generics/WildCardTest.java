package com.playground.java.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
    public abstract void consulta();

}

class Dog extends Animal implements Comparable{
    @Override
    public void consulta() {
        System.out.println("Consulting dogs");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Cat extends Animal implements Comparable{
    @Override
    public void consulta() {
        System.out.println("Consulting cats");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Dog[] cachorros = {new Dog(), new Dog()};
        Cat[] gatos = {new Cat(), new Cat()};
//        consultaAnimais(cachorros);
//        consultaAnimais(gatos);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Animal> cats = new ArrayList<>();
        cats.add(new Cat());

        List<Dog> dogObject = new ArrayList<>();
        dogObject.add(new Dog());

       // consultaAnimaisList(dogs);
        // consultaAnimaisList(cats);

//        consultaDogsInTheList(dogs);
//        consultaDogsInTheList(cats);

        consultarListaAnimals(dogObject);
    }

    public static void consultaAnimais(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
    }

    public static void consultaAnimaisList(List<? extends Animal> animalList){
        for (Animal animal : animalList){
            animal.consulta();
        }
    }

//    public static void consultaDogsInTheList(List<? super Dog> dogs){
//        Dog dog = new Dog();
//        Animal animal = new Dog();
//        Animal animal1 = new Cat();
//        System.out.println("===");
//        animal.consulta();
//        animal1.consulta();
//    }

    public static void consultarListaAnimals(List<? extends Comparable> list){
        Collections.sort(list);

    }
}
