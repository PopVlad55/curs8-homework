package ex23;

import java.time.LocalDateTime;

class Programmer extends Employee {
    String language;

    public Programmer(String firstName, String lastName, LocalDateTime birthday, String address) {
        super(firstName, lastName, birthday, address);
    }

    @Override
    public String getPosition(){
        return "programmer";
    }
}
