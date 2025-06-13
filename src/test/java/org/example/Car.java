package org.example;

import net.datafaker.Faker;

public class Car {
    private final String brand;
    private final String model;
    private final int year;

    public Car() {
        Faker faker = new Faker();
        this.brand = faker.company().name();
        this.model = faker.bothify("Model-??##");
        this.year = faker.number().numberBetween(1995, 2025);
    }

    public void printInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}