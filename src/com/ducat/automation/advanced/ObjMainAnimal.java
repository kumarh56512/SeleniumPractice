package com.ducat.automation.advanced;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class ObjMainAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting (Child -> Parent)

        // Downcasting (Parent -> Child)
        Dog dog = (Dog) animal;  // Manual cast required
        dog.bark();  // Now you can access subclass method
    }
}
