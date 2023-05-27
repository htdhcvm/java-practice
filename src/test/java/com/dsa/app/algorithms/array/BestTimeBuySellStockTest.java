package com.dsa.app.algorithms.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeBuySellStockTest {
    
    BestTimeBuySellStock bestTimeBuySellStock;
    
    @Before
    public void setUp() {
        this.bestTimeBuySellStock = new BestTimeBuySellStock();
    }
    
    
    @Test
    public void test1() {
        final int expect = 0;
        final int[] nums = {10, 9, 8, 7, 2};
        
        final int result = this.bestTimeBuySellStock.solution(nums);
        
        assertEquals(expect, result);
    }
    
    
    @Test
    public void test2() {
        final int expect = 0;
        final int[] nums = {7, 6, 4, 3, 1};
        
        final int result = this.bestTimeBuySellStock.solution(nums);
        
        assertEquals(expect, result);
    }
    
}
