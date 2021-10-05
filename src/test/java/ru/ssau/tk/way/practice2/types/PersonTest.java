package ru.ssau.tk.way.practice2.types;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    Person firstPerson = new Person();

    @Test
    public void testFirstName() {
        assertNull(firstPerson.getFirstName());
        firstPerson.setFirstName("Marry");
        assertEquals(firstPerson.getFirstName(), "Marry");
        firstPerson.setFirstName(null);
        assertNull(firstPerson.getFirstName());
    }

    @Test
    public void testLastName() {
        assertNull(firstPerson.getLastName());
        firstPerson.setLastName("Yandex");
        assertEquals(firstPerson.getLastName(), "Yandex");
        firstPerson.setLastName(null);
        assertNull(firstPerson.getLastName());
    }

    @Test
    public void testPassportid() {
        assertEquals(firstPerson.getPassportid(), 0);
        firstPerson.setPassportid(3616289);
        assertEquals(firstPerson.getPassportid(), 3616289);
        firstPerson.setPassportid(0);
        assertEquals(firstPerson.getPassportid(), 0);
    }

}