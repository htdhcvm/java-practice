package com.dsa.app.algorithms.array;

public class MoveZeroes {
    private final int FIND_VALUE = 0;
    
    public void solution(int[] nums) {
        int writePointer = 0;
        boolean isChange = false;
        
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (isChange && nums[readPointer] != this.FIND_VALUE) {
                int tmp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = tmp;
                
                writePointer++;
                isChange = false;
            }
            
            if (nums[writePointer] == this.FIND_VALUE && isChange == false) {
                isChange = true;
            }
            
            if (nums[readPointer] == this.FIND_VALUE && isChange == false) {
                writePointer = readPointer;
                isChange = true;
            }
        }
    }
}
