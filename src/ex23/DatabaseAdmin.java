package ex23;

import java.time.LocalDateTime;

class DatabaseAdmin extends Employee{
    String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, LocalDateTime birthday, String address) {
        super(firstName, lastName, birthday, address);
    }

    @Override
    public String getAddress(){
        return "db admin" + super.getAddress();
    }
}


