package org.example;

import net.datafaker.Faker;

public class calculatorMain {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Calculator calc = new Calculator();

        int x = faker.number().numberBetween(1, 55);
        int y = faker.number().numberBetween(1, 55);
        int z = faker.number().numberBetween(1, 55);


        int resultTwo = calc.multiply(x, y);
        System.out.println("Multiply two numbers are: " + x + " * " + y + " = " + resultTwo);

        int resultThree = calc.multiply(x, y, z);
        System.out.println("Multiply three numbers are: " + x + " * " + y + " * " + z + " = " + resultThree);
    }
}