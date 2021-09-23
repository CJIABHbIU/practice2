package ru.ssau.tk.way.practice2.types;

public class Test {
    public static void main(String[] args){
        Person first=new Person();
        first.setFirstName("Luke");
        first.setLastName("Sky");
        first.setPassportid(3616202);
        System.out.println(first.getFirstName());
        System.out.println(first.getLastName());
        System.out.println(first.getPassportid());

        Person second= new Person();
        first.setFirstName("Han");
        first.setLastName("Tot");
        first.setPassportid(3616150);
    }
}
