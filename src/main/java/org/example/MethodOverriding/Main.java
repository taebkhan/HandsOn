package org.example.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the superclass
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Calls the method in Animal class

        // Creating an instance of the subclass
        Dog myDog = new Dog();
        myDog.makeSound();  // Calls the overridden method in Dog class

        // Using superclass reference to refer to a subclass object
        Animal myPet = new Dog();
        myPet.makeSound();  // Calls the overridden method in Dog class (runtime polymorphism)
    }
}

// Superclass
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
