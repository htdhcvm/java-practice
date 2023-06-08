package com.dsa.app.algorithms.array;

import java.util.HashSet;

public class SingleNumber {
    
    public int solution(int[] nums) {
        HashSet<Integer> h = new HashSet();
        
        for (int num : nums) {
            if (h.contains(num)) {
                h.remove(num);
            } else {
                h.add(num);
            }
            
        }
        return (int) h.toArray()[0];
    }
    
    
    public int solution1(int[] nums) { // ?
        int res = 0;
        
        for (int num : nums) {
            int a = num ^ res;
            System.out.println("num: " + num);
            System.out.println("res: " + res);
            System.out.println("num ^ res: " + a);
            res = num ^ res;
            
            System.out.println("\n");
        }
        
        return res;
    }
}
