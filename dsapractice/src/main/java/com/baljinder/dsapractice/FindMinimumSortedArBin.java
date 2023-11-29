package com.baljinder.dsapractice;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?source=submission-noac
public class FindMinimumSortedArBin {
    public static void main(String[] args) {

    }
    public static int findMin(int[] nums) {
        int res = nums[0];

        int left = 0;
        int right = nums.length -1;
        if(nums.length == 1){
            return nums[0];
        }

        while(left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }else if (nums[mid] >= nums[left] && nums[left] > nums[right]) {
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        return nums[left];
    }
}
