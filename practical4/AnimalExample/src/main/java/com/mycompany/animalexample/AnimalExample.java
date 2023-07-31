
package com.mycompany.animalexample;

public class AnimalExample {

    public static void main(String[] args) {
   
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Reptile reptile = new Reptile();

        System.out.println("Animal class: " + animal.getClass().getSimpleName());
        System.out.println("Mammal class: " + mammal.getClass().getSimpleName());
        System.out.println("Reptile class: " + reptile.getClass().getSimpleName());
    }
}

    