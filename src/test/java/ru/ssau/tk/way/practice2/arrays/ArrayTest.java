package ru.ssau.tk.way.practice2.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    Array arr = new Array();
    @Test
    public void testArr() {

        assertEquals(arr.arr1(10).length, 10);
    }

    @Test
    public void testArr3() {
        assertEquals(arr.arr3(3),new int[]{1, 3, 5});
    }

    @Test
    public void testTestArr2() {
        assertEquals(arr.arr2(3),new int[]{2, 1, 2});
    }

    @Test
    public void testArr4() {
        assertEquals(arr.arr4(3),new int[]{6, 4, 2});
    }

    @Test
    public void testArr5() {
        assertEquals(arr.arr5(5),new int[]{0, 1, 1, 2, 3});
    }

    @Test
    public void testArr6() {
        assertEquals(arr.arr6(5),new int[]{1, 4, 9, 16, 25});
    }

    @Test
    public void testArr7() {
        Assert.assertEquals(arr.arr7(0, 1, 1), new double[]{-1}, 0.05);
        Assert.assertEquals(arr.arr7(1, -7, 12),new double[]{4, 3},0.05);
        Assert.assertEquals(arr.arr7(1, -8, 16), new double[]{4}, 0.05);
        Assert.assertEquals(arr.arr7(1, 1, 17), new double[]{}, 0.05);
    }
}