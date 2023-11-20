package ex23;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Data {
    private Person person;

    public Data(Person person) {
        this.person = person;
    }

    public String fullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int age() {
        LocalDateTime currentDate = LocalDateTime.now();
        return (int) ChronoUnit.YEARS.between(person.getBirthday(), currentDate);
    }

    public String address() {
        return person.getAddress();
    }
}