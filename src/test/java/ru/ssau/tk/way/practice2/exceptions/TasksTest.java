package ru.ssau.tk.way.practice2.exceptions;

import org.testng.annotations.Test;
import ru.ssau.tk.way.practice2.types.Person;

import java.io.*;

import static org.testng.Assert.*;
import static ru.ssau.tk.way.practice2.exceptions.Tasks.*;

public class TasksTest {

    @Test
    public void testDataOutput() {

        assertThrows(NullPointerException.class, () -> dataOutput(null));
    }

    @Test
    public void testArrayOfCharactersByIndex() {
        assertEquals(arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 2), new char[]{'л', 'д', 'у'});

        assertThrows(NullPointerException.class, () -> arrayOfCharactersByIndex(null, 2));
        assertThrows(NullPointerException.class, () -> arrayOfCharactersByIndex(new String[]{null, "лёд", "груша"}, 2));
        assertThrows(StringIndexOutOfBoundsException.class, () -> arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 10));
        assertThrows(StringIndexOutOfBoundsException.class, () -> arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, -1));
    }

    @Test
    public void testCharactersByIndex() {
        assertEquals(charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 2, 3), 'ш');

        assertThrows(NullPointerException.class, () -> charactersByIndex(null, 2, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 3, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, -1, 4));
        assertThrows(StringIndexOutOfBoundsException.class, () -> charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 1, 3));
    }

    @Test
    public void testDividingFromStrings() {
        assertEquals(dividingFromStrings("6", "2"), 3);
        assertEquals(dividingFromStrings("5", "2"), 2);

        assertThrows(NumberFormatException.class, () -> dividingFromStrings("6", null));
        assertThrows(NumberFormatException.class, () -> dividingFromStrings(null, "2"));
        assertThrows(NumberFormatException.class, () -> dividingFromStrings("six", "2"));
        assertThrows(ArithmeticException.class, () -> dividingFromStrings("6", "0"));
    }

    @Test
    public void testSerialization() {
        try {
            Person human = new Person("Jane", "Austen", 234567);
            serialization(new ByteArrayOutputStream(), human);
            System.out.println(human);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertThrows(FileNotFoundException.class, () -> serialization(new FileOutputStream(""), new Person()));
        assertThrows(NotSerializableException.class, () -> serialization(new ByteArrayOutputStream(), new Object()));
    }
}