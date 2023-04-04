package com.dsa.app.algorithms.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ReplaceElementsGreatestElemRightSideTest {

    @Test
    public void test1()
    {
        int[] nums = {17,18,5,4,6,1};
        final int[] expect = {18,6,6,6,1,-1};

        ReplaceElementsGreatestElemRightSide replaceElementsGreatestElemRightSide = new ReplaceElementsGreatestElemRightSide();
        final int[] result = replaceElementsGreatestElemRightSide.solution2(nums);

        System.out.println(Arrays.toString(result));
        assertArrayEquals(expect, result);
    }


    @Test
    public void test2()
    {
        int[] nums = {400};
        final int[] expect = {-1};

        ReplaceElementsGreatestElemRightSide replaceElementsGreatestElemRightSide = new ReplaceElementsGreatestElemRightSide();
        final int[] result = replaceElementsGreatestElemRightSide.solution2(nums);

        assertArrayEquals(expect, result);
    }


    @Test
    public void test4()
    {
        int[] nums = {};
        final int[] expect = {};

        ReplaceElementsGreatestElemRightSide replaceElementsGreatestElemRightSide = new ReplaceElementsGreatestElemRightSide();
        final int[] result = replaceElementsGreatestElemRightSide.solution2(nums);

        assertArrayEquals(expect, result);
    }
}
