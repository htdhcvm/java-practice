package com.dsa.app.algorithms.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicates {



    public int removeDuplicates(int[] nums) {



        int q = nums.length;

        for(int i = 0; i < q; i++) {
            System.out.println(i);
            if(i > 0 && nums[i] == nums[i - 1]) {
                int tmp = nums[i];

                for(int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }

                nums[nums.length - 1] = tmp;
                q--;
                i--;
            }
        }

        return q;
    }
}
