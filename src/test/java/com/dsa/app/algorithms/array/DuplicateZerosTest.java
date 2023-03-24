package com.dsa.app.algorithms.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertArrayEquals;

public class DuplicateZerosTest {
    @Test
    public void maxConsecutiveOnesTest1()
    {
        final int[] expect = {1,0,0,2,3,0,0,4};
        final int[] nums = { 1,0,2,3,0,4,5,0 };

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(nums);

//        assertArrayEquals(nums, expect);
    }

    @Test
    public void maxConsecutiveOnesTest2()
    {
        final int[] expect = { 1,2,3 };
        final int[] nums = { 1,2,3 };

        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(nums);

        assertArrayEquals(nums, expect);
    }
}
