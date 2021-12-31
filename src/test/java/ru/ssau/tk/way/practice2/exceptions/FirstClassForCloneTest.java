package ru.ssau.tk.way.practice2.exceptions;

import org.testng.annotations.Test;

public class FirstClassForCloneTest {
    @Test
    public void testClone() {
        try {
            FirstClassForClone object = new FirstClassForClone(2);
            FirstClassForClone cloneObject = object.clone();
        } catch (CloneNotSupportedException e) {                       //Было поймано исключение, так как нет интерфейса Cloneable
            e.printStackTrace();
        }
    }
}