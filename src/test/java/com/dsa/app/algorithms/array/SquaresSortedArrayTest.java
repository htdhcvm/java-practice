package com.dsa.app.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SquaresSortedArrayTest {

    @Test
    public void sortedSquares1()
    {
        final int[] expect = {0,1,9,16,100 };
        final int[] nums = {-4,-1,0,3,10 };

        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        final int[] sortedSquares = squaresSortedArray.sortedSquares(nums);

        assertArrayEquals(expect, sortedSquares);
    }

    @Test
    public void sortedSquares2()
    {
        final int[] expect = {4,9,9,49,121};
        final int[] nums = {-7,-3,2,3,11};

        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        final int[] sortedSquares = squaresSortedArray.sortedSquares(nums);

        assertArrayEquals(expect, sortedSquares);
    }

}
