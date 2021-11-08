package ru.ssau.tk.way.practice2.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

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

    @Test
    public void testArr8() {
        assertEquals(arr.arr8(7), new int[] {1,2,4,5,7,8,10});
    }

    @Test
    public void testArr9() {
        assertEquals(arr.arr9(5, 10, 5), new int[]{5, 15, 25, 35, 45});
    }

    @Test
    public void testArr10() {
        assertEquals(arr.arr10(5, 10, 0.5),new double[]{10, 20, 40, 80, 160});
    }

    @Test
    public void testArr11() {
        assertEquals(arr.arr11(36), new int[]{1, 2, 3, 4, 6, 9, 12, 18, 36});
    }

    @Test
    public void testArr12() {
        assertEquals(arr.arr12(5), new Integer[] {2, 3, 5});
        assertEquals(arr.arr12(10), new Integer[]{2, 3, 5, 7});
    }
}