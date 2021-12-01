package ru.ssau.tk.way.practice2.strings;

import org.testng.annotations.Test;
import ru.ssau.tk.way.practice2.types.Person;
import ru.ssau.tk.way.practice2.types.Point;

import static java.nio.charset.StandardCharsets.UTF_16;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.testng.Assert.*;
import static ru.ssau.tk.way.practice2.strings.ClassForStrings.*;

public class ClassForStringsTest {
    @Test
    public void testPrintChar() {
        printChar("This method works!");
    }

    @Test
    public void testPrintBytes() {
        printBytes("This method works!");
    }

    @Test
    public void testStringComparison() {
        stringComparison();
    }

    @Test
    public void testPalindrome() {
        assertTrue(palindrome("level"));
        assertFalse(palindrome("levels"));
    }

    @Test
    public void testStringComparisonIgnoreCase() {
        assertTrue(stringComparisonIgnoreCase("string", "STRING"));
        assertFalse(stringComparisonIgnoreCase("string", null));
        assertFalse(stringComparisonIgnoreCase("string", "STRINGS"));
        assertTrue(stringComparisonIgnoreCase("string", "StRiNg"));
    }

    @Test
    public void testStudyingScreening() {
        studyingScreening();
    }

    @Test
    public void testIndexOfTheOccurrence() {
        assertEquals(indexOfTheOccurrence("Class", "s"), 3);
        assertEquals(indexOfTheOccurrence("Class", "b"), -1);
    }

    @Test
    public void testFirstIndexOfTheOccurrenceHalf() {
        assertEquals(firstIndexOfTheOccurrenceHalf("Levels", "l"), 4);
        assertEquals(firstIndexOfTheOccurrenceHalf("LevelsLevels", "Levels"), 6);
        assertEquals(firstIndexOfTheOccurrenceHalf("Class", "cl"), -1);
    }

    @Test
    public void testLastIndexOfTheOccurrenceHalf() {
        assertEquals(lastIndexOfTheOccurrenceHalf("Levels", "e"), 1);
        assertEquals(lastIndexOfTheOccurrenceHalf("Levels", "n"), -1);
        assertEquals(lastIndexOfTheOccurrenceHalf("Class", "Cl"), 0);
        assertEquals(lastIndexOfTheOccurrenceHalf("LevelsLevels", "ls"), 4);
    }

    @Test
    public void testCountOfLines() {
        assertEquals(countOfLines(new String[]{"This method works!"}, "This", "works!"), 1);
        assertEquals(countOfLines(new String[]{"This method works!"}, "This", "method"), 0);
        assertEquals(countOfLines(new String[]{"This method works!", "This method works again!", "This method again works!"}, "This", "works!"), 2);
    }
    @Test
    public void testCountOfLinesIgnoreTheSpace() {
        assertEquals(countOfLinesIgnoreTheSpace(new String[]{" This method  works!  "}, "This", "works!"), 1);
        assertEquals(countOfLinesIgnoreTheSpace(new String[]{"This method works!"}, "This", "method"), 0);
        assertEquals(countOfLinesIgnoreTheSpace(new String[]{"  This  method works!  ", "  This method works again! ", "This method again   works! "}, "This", "works!"), 2);
    }

    @Test
    public void testReplacementTheString() {
        assertEquals(replacementTheString("ороророро", "оро", "ро"), "роррро");
        assertEquals(replacementTheString("This method works!", "This", "And this"), "And this method works!");
    }

    @Test
    public void testSubstringOfString() {
        assertEquals(substringOfString("This method works!", 5, 19), "method works!");
    }

    @Test
    public void testDescriptionOfObjects() {
        Person human = new Person("Jane", "Austen", 234567);
        System.out.println(descriptionOfObjects(human));

        Point firstPoint = new Point(12, -29, 52.3);
        System.out.println(descriptionOfObjects(firstPoint));
    }

    @Test
    public void testSplittingTheString() {
        assertEquals(splittingTheString("This method works!"), new String[]{"This", "Method", "Works!"});
    }

    @Test
    public void testCreateOneString() {
        assertEquals(createOneString(new String[]{"This", "method", "works!"}), "This, method, works!");
    }

    @Test
    public void testCreateObject() {
        assertEquals(createObject("This works!"), "01s8r6w4s2h0");
    }

    @Test
    public void testFormTheString() {
        assertEquals(formTheString(10), "0 1 2 3 4 5 6 7 8 9 ");
        System.out.println(formTheString(10000));
    }

    public static void main(String[] args) {
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    @Test
    public void testChangingTheEncoding() {
        System.out.println(changingTheEncoding("This method works!", UTF_8, UTF_16));
    }
}