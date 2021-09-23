package ru.ssau.tk.way.practice2.types;

public class Person {
    private String firstName ;
    private String lastName;
    private int passportid;
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportid() {
        return passportid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportid(int passportid) {
        this.passportid = passportid;
    }
}
