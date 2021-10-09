package ru.ssau.tk.way.practice2.types;

import org.testng.annotations.Test;

import java.security.spec.RSAOtherPrimeInfo;

import static org.testng.Assert.*;

public class OperationTest {

    @Test
    public void testAll() {
        Operation first = new IdenticalOperation();
        assertEquals(first.apply(134),134);
        assertEquals(first.tripleApply(1), 1);
        assertEquals(first.apply(Double.NaN), Double.NaN);
        assertEquals(first.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        assertEquals(first.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);

        Operation second = new SqrtOperation();
        assertEquals(second.apply(144),12);
        assertEquals(second.tripleApply(1), 1);
        assertEquals(second.apply(Double.NaN), Double.NaN);
        assertEquals(second.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        assertEquals(second.apply(Double.NEGATIVE_INFINITY), Double.NaN);

        Operation third = new TangentOperation();
        assertEquals(third.apply(0), 0);
        assertEquals(third.apply(Double.NaN), Double.NaN);
        assertEquals(third.apply(Double.POSITIVE_INFINITY), Double.NaN);
        assertEquals(third.apply(Double.NEGATIVE_INFINITY), Double.NaN);
    }
}