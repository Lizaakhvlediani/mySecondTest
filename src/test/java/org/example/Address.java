package org.example;

import net.datafaker.Faker;

public class Address {
    private String street;
    private String city;
    private String country;
    private String zipCode;

    public Address(Faker faker) {
        this.street = faker.address().streetAddress();
        this.city = faker.address().city();
        this.country = faker.address().country();
        this.zipCode = faker.address().zipCode();
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + country + " " + zipCode;
    }
}