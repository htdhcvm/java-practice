package com.dsa.app.algorithms.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxConsecutiveOnesTest
{

    MaxConsecutiveOnes maxConsecutive;

    @Before
    public void setUp() {
        this.maxConsecutive = new MaxConsecutiveOnes();
    }


    @Test
    public void maxConsecutiveOnesTest1()
    {
        final int expect = 3;
        final int[] nums = { 1,1,0,1,1,1 };

        final int max = this.maxConsecutive.findMaxConsecutiveOnes(nums);
        assertEquals(expect, max);
    }

    @Test
    public void maxConsecutiveOnesTest2()
    {
        final int expect = 2;
        final int[] nums = { 1,0,1,1,0,1 };

        final int max = this.maxConsecutive.findMaxConsecutiveOnes(nums);
        assertEquals(expect, max);
    }
}
