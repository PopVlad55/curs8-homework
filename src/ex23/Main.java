package ex23;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1995, 5, 3, 3, 25);
        Person employee = new Employee("Ionescu", "Mihai", birthday, "Bucuresti");
        Data personData = new Data(employee);

        System.out.println("Full Name: " + personData.fullName());
        System.out.println("Age: " + personData.age());
        System.out.println("Address: " + personData.address());
    }
}
