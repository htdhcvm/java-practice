package com.dsa.app.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersEvenNumberDigitsTest {
    @Test
    public void numbersEvenNumberDigitsTest1()
    {
        final int expect = 2;
        final int[] nums = { 12,345,2,6,7896 };

        NumbersEvenNumberDigits numbersEvenNumberDigits = new NumbersEvenNumberDigits();
        final int max = numbersEvenNumberDigits.findNumbers(nums);

        assertEquals(expect, max);
    }


    @Test
    public void numbersEvenNumberDigitsTest2()
    {
        final int expect = 1;
        final int[] nums = { 555,901,482,1771};

        NumbersEvenNumberDigits numbersEvenNumberDigits = new NumbersEvenNumberDigits();
        final int max = numbersEvenNumberDigits.findNumbers(nums);

        assertEquals(expect, max);
    }
}
