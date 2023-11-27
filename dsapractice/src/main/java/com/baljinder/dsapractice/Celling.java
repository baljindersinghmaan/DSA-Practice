package com.baljinder.dsapractice;

public class Celling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 2, 3, 5, 8, 10, 11};
       int target = 8;
       int ans = celling(arr, target);
       System.out.println(ans);
    }
    // return the index of smalled no >= target
    static int celling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            // find the middle element
            // int mid = (start + end) / 2 //  might be possible that start + end reach the limit of int
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}