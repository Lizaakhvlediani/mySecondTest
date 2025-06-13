package org.example;

import net.datafaker.Faker;

public class addressUser {
    private String firstName;
    private String lastName;
    private Address address;

    public addressUser(Faker faker) {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.address = new Address(faker);
    }

    public void printInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
    }
}
