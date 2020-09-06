package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Horse();
        for (Animal animal : animals) {
            Vet.treatAnimal(animal);
        }
    }
}
