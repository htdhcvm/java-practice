package com.dsa.app.algorithms.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveElementsTest {

    RemoveElements removeElements;

    @Before
    public void setUp() {
        this.removeElements = new RemoveElements();
    }


    @Test
    public void removeElementsV1()
    {
        final int[] expect = {2, 2, 3, 3};
        int val = 3;
        int[] nums = {3,2,2,3};

        final int output = this.removeElements.removeElement(nums, val);
        assertArrayEquals(expect, nums);
    }
}

