package ru.ssau.tk.way.practice2.types;

public class ThirteenNumber {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }
    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }
    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }
}
