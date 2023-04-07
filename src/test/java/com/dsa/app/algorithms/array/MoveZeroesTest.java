package com.dsa.app.algorithms.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MoveZeroesTest {
    MoveZeroes moveZeroes;
    
    @Before
    public void setUp() {
        this.moveZeroes = new MoveZeroes();
    }
    
    
    @Test
    public void test1() {
        final int[] expect = {1, 3, 12, 0, 0};
        final int[] nums = {0, 1, 0, 3, 12};
        
        this.moveZeroes.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test2() {
        final int[] expect = {0};
        final int[] nums = {0};
        
        this.moveZeroes.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test3() {
        final int[] expect = {1, 0};
        final int[] nums = {1, 0};
        
        this.moveZeroes.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test4() {
        final int[] expect = {1, 0};
        final int[] nums = {0, 1};
        
        this.moveZeroes.solution(nums);
        assertArrayEquals(expect, nums);
    }
    
    @Test
    public void test5() {
        final int[] expect = {1, 3, 12, 0, 0, 0, 0};
        final int[] nums = {0, 1, 0, 0, 0, 3, 12};
        
        this.moveZeroes.solution(nums);
        assertArrayEquals(expect, nums);
    }
}