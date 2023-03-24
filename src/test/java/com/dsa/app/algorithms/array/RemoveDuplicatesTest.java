package com.dsa.app.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    public void removeElementsV1()
    {
        int[] nums = {1, 1, 2};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        final int output = removeDuplicates.removeDuplicates(nums);

        assertEquals(2, output);
    }


    @Test
    public void removeElementsV2()
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        final int output = removeDuplicates.removeDuplicates(nums);

        assertEquals(5, output);
    }
}
