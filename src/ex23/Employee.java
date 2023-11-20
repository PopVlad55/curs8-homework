package ex23;

import java.time.LocalDateTime;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String adress;

    public Employee(String firstName, String lastName, LocalDateTime birthday, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.adress = address;
    }

    LocalDateTime dateOfEmployment;
    String position;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return adress;
    }

    String getPosition() {
        return "employee";
    }
}

