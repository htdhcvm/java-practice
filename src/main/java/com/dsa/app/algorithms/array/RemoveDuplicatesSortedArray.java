package com.dsa.app.algorithms.array;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public int solution(int[] nums) {
        int res = nums.length;

        for(int i = 1; i < res; i++) {
           if(nums[i] == nums[i - 1]) {
               int tmp = nums[i];

               for(int j = i + 1; j < nums.length; j++) {
                   nums[j -1] = nums[j];
               }

               nums[nums.length - 1] = tmp;

               i--;
               res--;
           }
        }

        return res;
    }
}
