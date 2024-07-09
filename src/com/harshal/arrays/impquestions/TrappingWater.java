package com.harshal.arrays.impquestions;

import java.util.Arrays;

// Time complexity O(n)

public class TrappingWater {
    public static void main(String[] args) {

        int width = 1;
        int[] heights = {4,2,0,6,3,2,5};
        System.out.println(calculateTrappedWater(heights,width));
    }

    private static void leftMaximumArray(int[] heights, int[] leftMaximumAuxiliaryArray){
        leftMaximumAuxiliaryArray[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftMaximumAuxiliaryArray[i] = Math.max(leftMaximumAuxiliaryArray[i - 1], heights[i]);
        }
    }

    private static void rightMaximumArray(int[] heights, int[] rightMaximumAuxiliaryArray){
        rightMaximumAuxiliaryArray[rightMaximumAuxiliaryArray.length-1] = heights[heights.length-1];
        for (int i = heights.length-2; i >= 0; i--) {
            rightMaximumAuxiliaryArray[i] = Math.max(heights[i], rightMaximumAuxiliaryArray[i + 1]);
        }
    }

    private static int calculateTrappedWater(int[] heights, int width){
        int totalTrappedWater = 0;

        int[] leftMaximumAuxiliaryArray = new int[heights.length];
        int[] rightMaximumAuxiliaryArray = new int[heights.length];

        leftMaximumArray(heights,leftMaximumAuxiliaryArray);
        rightMaximumArray(heights,rightMaximumAuxiliaryArray);

        for (int i = 0; i < heights.length; i++) {
            int waterLevel = Math.min(leftMaximumAuxiliaryArray[i],rightMaximumAuxiliaryArray[i]);
            int trappedWater = (waterLevel-heights[i])*width;
            totalTrappedWater += Math.max(trappedWater, 0);
        }
        return totalTrappedWater;
    }
}
