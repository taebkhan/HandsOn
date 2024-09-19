package org.example.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded versions of the add method
        System.out.println("Addition of two integers: " + calc.add(5, 3));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
        System.out.println("Addition of two doubles: " + calc.add(2.5, 3.7));
        System.out.println("Addition of an array of integers: " + calc.add(new int[]{1, 2, 3, 4}));
    }
}

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an array of integers
    int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
