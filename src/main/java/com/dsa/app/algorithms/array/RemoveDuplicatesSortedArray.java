package com.dsa.app.algorithms.array;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public int solution(int[] nums) {
        int response = 0;

        int finalIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (i == 0) {
                    i = 0;
                } else {
                    i--;
                }

                int tmp = nums[i + 1];

                for (int k = i + 2; k < nums.length; k++) {
                    nums[k - 1] = nums[k];
                }

                nums[nums.length - 1] = tmp;
            }
        }

        System.out.println(Arrays.toString(nums));
        return response;
    }
}
