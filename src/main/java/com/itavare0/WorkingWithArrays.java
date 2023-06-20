package com.itavare0;

import java.util.Arrays;

public class WorkingWithArrays
{
    public static void main( String[] args )
    {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++ ) {
            nums[i] = i;
            System.out.println(nums[i]);
        }
    }
}
