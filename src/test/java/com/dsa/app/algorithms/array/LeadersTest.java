package com.dsa.app.algorithms.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class LeadersTest {

    Leaders leaders;

    @Before
    public void setUp() {
        this.leaders = new Leaders();
    }

    @Test
    public void solution1()
    {
        final int[] expect = { 17, 5, 2 };
        final int[] nums = { 16, 17, 4, 3, 5, 2 };


        final int[] result =  this.leaders.solution(nums);


        assertArrayEquals(expect, result);
    }

    @Test
    public void solution2()
    {
        final int[] expect = { 5, 2 };
        final int[] nums = { 1, 2, 3, 4, 5, 2 };

        final int[] result = this.leaders.solution(nums);

        assertArrayEquals(expect, result);
    }
}
