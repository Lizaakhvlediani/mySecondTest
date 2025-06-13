package org.example;

public class secondStudentMain {
    public static void main(String[] args) {
        secondStudent student1 = new secondStudent();
        secondStudent student2 = new secondStudent();

        student1.printInfo();
        student2.printInfo();

        System.out.println("Are they equal? " + student1.equals(student2));

        secondStudent student3 = student1;
        System.out.println("student1 equals student3? " + student1.equals(student3));
    }
}