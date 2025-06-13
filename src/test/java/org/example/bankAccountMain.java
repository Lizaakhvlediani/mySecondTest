package org.example;
import net.datafaker.Faker;

public class bankAccountMain {
    public static void main(String[] args) {
        Faker faker = new Faker();

        double initialBalance = faker.number().randomDouble(2, 0, 500);

        BankAccount account = new BankAccount(initialBalance);

        System.out.println("მომხმარებლის ბალანსი: " + account.getBalance());
        account.checkBalanceLimit();
    }
}