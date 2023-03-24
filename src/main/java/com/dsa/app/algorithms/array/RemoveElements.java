package com.dsa.app.algorithms.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int q = nums.length - 1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == val) {
                for(int j = q; j >= 0; j--) {
                    if(j > i && nums[j] != val) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        q = j;
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }

        }

        return count;
    }
}
