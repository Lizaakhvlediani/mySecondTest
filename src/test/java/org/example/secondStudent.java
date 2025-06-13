package org.example;

import net.datafaker.Faker;
import java.util.Objects;

public class secondStudent {
    private final String studentId;

    public secondStudent() {
        Faker faker = new Faker();
        this.studentId = faker.idNumber().valid(); 
    }

    public String getStudentId() {
        return studentId;
    }

    public void printInfo() {
        System.out.println("Student ID: " + studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        secondStudent other = (secondStudent) obj;
        return Objects.equals(this.studentId, other.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
