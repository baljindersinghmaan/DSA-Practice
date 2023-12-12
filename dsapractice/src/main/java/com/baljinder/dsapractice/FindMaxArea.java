package com.baljinder.dsapractice;

public class FindMaxArea {
    // https://leetcode.com/problems/container-with-most-water/submissions/
    public int maxArea(int[] height) {
        int area = 0, left = 0, right = height.length -1;

        while(left < right) {

            int a = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(a,area);
            if(height[left] > height[right]) {
                right--;
            } else {
                left ++;
            }
        }
        return area;
    }
}
