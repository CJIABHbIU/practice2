package ru.ssau.tk.way.practice2.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    Array arr = new Array();
    int[] a = new int[]{1, 2, -3};

    @Test
    public void testArr() {

        assertEquals(arr.arr1(10).length, 10);
    }

    @Test
    public void testArr3() {
        assertEquals(arr.arr3(3), new int[]{1, 3, 5});
    }

    @Test
    public void testTestArr2() {
        assertEquals(arr.arr2(3), new int[]{2, 1, 2});
    }

    @Test
    public void testArr4() {
        assertEquals(arr.arr4(3), new int[]{6, 4, 2});
    }

    @Test
    public void testArr5() {
        assertEquals(arr.arr5(5), new int[]{0, 1, 1, 2, 3});
    }

    @Test
    public void testArr6() {
        assertEquals(arr.arr6(5), new int[]{1, 4, 9, 16, 25});
    }

    @Test
    public void testArr7() {
        Assert.assertEquals(arr.arr7(0, 1, 1), new double[]{-1}, 0.05);
        Assert.assertEquals(arr.arr7(1, -7, 12), new double[]{4, 3}, 0.05);
        Assert.assertEquals(arr.arr7(1, -8, 16), new double[]{4}, 0.05);
        Assert.assertEquals(arr.arr7(1, 1, 17), new double[]{}, 0.05);
    }

    @Test
    public void testArr8() {
        assertEquals(arr.arr8(7), new int[]{1, 2, 4, 5, 7, 8, 10});
    }

    @Test
    public void testArr9() {
        assertEquals(arr.arr9(5, 10, 5), new int[]{5, 15, 25, 35, 45});
    }

    @Test
    public void testArr10() {
        assertEquals(arr.arr10(5, 10, 0.5), new double[]{10, 20, 40, 80, 160});
    }

    @Test
    public void testArr11() {
        assertEquals(arr.arr11(36), new int[]{1, 2, 3, 4, 6, 9, 12, 18, 36});
    }

    @Test
    public void testArr12() {
        assertEquals(arr.arr12(5), new Integer[]{2, 3, 5});
        assertEquals(arr.arr12(10), new Integer[]{2, 3, 5, 7});
    }

    @Test
    public void testArr13() {
        assertEquals(arr.arr13(4), new int[]{1, 2, 3, 4, 3, 2, 1});
        assertEquals(arr.arr13(1), new int[]{1});
    }

    @Test
    public void testArr14() {
        arr.arr14(a);
        assertEquals(a, new int[]{-1, -2, 3});
    }

    @Test
    public void testArr15() {
        assertFalse(arr.arr15(a, -1));
        assertFalse(arr.arr15(a, 3));
        assertTrue(arr.arr15(a, 1));
    }

    @Test
    public void testArr16() {
        Integer[] a = new Integer[]{1, 3, null};
        Integer[] b = new Integer[]{1, 2, 3};
        assertTrue(arr.arr16(a));
        assertFalse(arr.arr16(b));
    }

    @Test
    public void testArr17() {
        int[] a = new int[]{2, 66, 3, 0};
        assertEquals(arr.arr17(a), 2);
    }

    @Test
    public void testArr18() {
        int[] a = new int[]{2, 4, 60, 30};
        int[] b = new int[]{};
        assertEquals(arr.arr18(a), 60);
        assertNull(arr.arr18(b));
    }

    @Test
    public void testArr19() {
        int[] a = new int[]{2, 4, 60, 30};
        int[] b = new int[]{1, 4, 50, 60, 70};
        assertEquals(arr.arr19(a), 62);
        assertEquals(arr.arr19(b), 121);
    }

    @Test
    public void testArr20() {
        int[] a = new int[]{2, 4, 60, 30};
        int[] b = new int[]{3, 4, 50, 60, 1};
        assertTrue(arr.arr20(a));
        assertFalse(arr.arr20(b));
    }
}