package ru.ssau.tk.way.practice2.types;

public class FourteenNumber {
    public static void main(String[] args) {
        Person person = new Person();
    person.setFirstName("Arkadiy");
    checkAnotherPerson(person);
    System.out.println(person.getFirstName());
    }
    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
    }
}