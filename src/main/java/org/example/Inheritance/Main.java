package org.example.Inheritance;

public class Main {
    public static void main(String[] args){
        //Example of hierarchical inheritance
        Puppy puppy = new Puppy();
        puppy.enter();
        puppy.bark();
        puppy.weep();

        //Example of override inheritance
        UnknownAnimal unknownAnimal = new UnknownAnimal();
        unknownAnimal.enter();
    }
}

//Base class
class Animal {
    void enter() {
        System.out.println("Animal is coming.");
    }
}

// Derived class 1 for hierarchical inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Derived class 2 for hierarchical inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

class UnknownAnimal extends Animal {
    @Override
    void enter() {
        System.out.println("An unknown animal is coming, hide!");
    }
}