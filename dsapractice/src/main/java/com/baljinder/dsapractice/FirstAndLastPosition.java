package com.baljinder.dsapractice;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] num = {1,7,7,7,8,9,10};
        int[] ans = {-1,-1};
        ans[0]= search(num,7,true);
        ans[1] = search(num, 7, false);
        System.out.println(ans[0]);

    }
   static int search(int[] nums, int target, boolean isFirstIndex){
        int ans = 0;
        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if(isFirstIndex){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
