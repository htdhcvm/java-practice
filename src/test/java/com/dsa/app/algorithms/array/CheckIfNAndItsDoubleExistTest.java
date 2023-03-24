package com.dsa.app.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckIfNAndItsDoubleExistTest {

    @Test
    public void checkIfExistV1()
    {
        final boolean expect = true;
        final int[] nums = { 10,2,5,3 };

        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        final boolean result = checkIfNAndItsDoubleExist.checkIfExist(nums);

        assertEquals(expect, result);
    }

    @Test
    public void checkIfExistV2()
    {
        final boolean expect = false;
        final int[] nums = { 3,1,7,11 };

        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        final boolean result = checkIfNAndItsDoubleExist.checkIfExist(nums);

        assertEquals(expect, result);
    }



    @Test
    public void checkIfExistV3()
    {
        final boolean expect = true;
        final int[] nums = { 10,2,5,3 };

        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        final boolean result = checkIfNAndItsDoubleExist.checkIfExistV2(nums);

        assertEquals(expect, result);
    }

    @Test
    public void checkIfExistV4()
    {
        final boolean expect = false;
        final int[] nums = { 3,1,7,11 };

        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        final boolean result = checkIfNAndItsDoubleExist.checkIfExistV2(nums);

        assertEquals(expect, result);
    }
}
