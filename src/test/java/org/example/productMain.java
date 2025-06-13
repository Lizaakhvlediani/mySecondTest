package org.example;

import net.datafaker.Faker;

public class productMain {
    public static void main(String[] args) {
        Faker faker = new Faker();

        double price = faker.number().randomDouble(2, 20, 250);

        double discount = faker.number().randomDouble(2, 10, 50);

        Product product = new Product(price, discount);

        System.out.println("ფასი: " + product.getPrice());
        System.out.println("ფასდაკლება: " + product.getDiscount());
        System.out.println("ფასი ფასდაკლების შემდეგ: " + product.getPriceAfterDiscount());
    }
}
