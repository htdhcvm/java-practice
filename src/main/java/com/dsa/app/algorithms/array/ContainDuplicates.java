package com.dsa.app.algorithms.array;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public boolean solution(int[] nums) {
        boolean isContain = false;
        
        HashSet<Integer> s = new HashSet();
        
        for (int num : nums) {
            final boolean isContainS = s.contains(num);
            if (isContainS) {
                isContain = true;
                return isContain;
            }
            s.add(num);
        }
        
        return isContain;
    }
}
