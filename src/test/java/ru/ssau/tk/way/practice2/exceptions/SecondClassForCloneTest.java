package ru.ssau.tk.way.practice2.exceptions;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SecondClassForCloneTest {
    @Test
    public void testClone() {
        try {
            SecondClassForClone object = new SecondClassForClone(1);
            SecondClassForClone cloneObject = object.clone();
            System.out.println("Object:" + object);
            System.out.println("Clone object:" + cloneObject);
            assertEquals(cloneObject.x, object.x);
        } catch (CloneNotSupportedException e) {                           //Исключение не было выброшено
            e.printStackTrace();
        }
    }
}