package com.dsa.app.algorithms.array;

public class BestTimeBuySellStock {
    
    public int solution(int[] prices) {
        int res = 0;
        
        if (isDescending(prices)) {
            return res;
        }
        
        return res;
    }
    
    private boolean isDescending(int[] prices) {
        boolean res = true;
        int j = 1;
        
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1 && j == i + 1) {
                break;
            }
            
            if (prices[i] < prices[j]) {
                res = false;
            }
        }
        
        
        return res;
    }
}
