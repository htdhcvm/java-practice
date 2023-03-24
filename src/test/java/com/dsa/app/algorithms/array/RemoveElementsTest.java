package com.dsa.app.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveElementsTest {
    @Test
    public void removeElementsV1()
    {
        final int[] expect = {2, 2, 3, 3};
        int val = 3;
        int[] nums = {3,2,2,3};

        RemoveElements removeElements = new RemoveElements();
        final int output = removeElements.removeElement(nums, val);
        assertArrayEquals(expect, nums);
    }
}

