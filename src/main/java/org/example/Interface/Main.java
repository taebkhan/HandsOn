package org.example.Interface;

public class Main {
    public static void main(String[] args) {
        //Basic Interface
        Dog oDog = new Dog();
        oDog.makeSound();

        System.out.println();
        //Multiple Interface
        Animal oAnimal1 = new Dog();
        Animal oAnimal2 = new Cat();
        oAnimal1.makeSound();
        oAnimal2.makeSound();

        System.out.println();
        //Multiple methods Interface
        Male oPerson = new Male(); //Person oPerson = new Male(); will also give the same output
        oPerson.name();
        oPerson.age();

        System.out.println();
        //Default Methods in interface
        Car myCar = new Car();
        myCar.start();
        myCar.stop();

        System.out.println();
        //Multiple Inheritance Using Interfaces
        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.drive();
        myFlyingCar.fly();
    }
}

interface Animal {
    void makeSound();  // Abstract method
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

interface Person {
    void name();  // Abstract method
    void age();  // Abstract method
}

class Male implements Person{
    @Override
    public void name() {
        System.out.println("Name is Ramesh");
    }

    @Override
    public void age() {
        System.out.println("Age is 25 y/o");
    }
}

interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// First interface
interface Drivable {
    void drive();
}

// Second interface
interface Flyable {
    void fly();
}

// Implementing both interfaces
class FlyingCar implements Drivable, Flyable {
    @Override
    public void drive() {
        System.out.println("Driving on the road");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the sky");
    }
}