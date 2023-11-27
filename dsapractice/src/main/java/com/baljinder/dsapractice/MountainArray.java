package com.baljinder.dsapractice;

public class MountainArray {
    public static void main(String[] args) {
       int[] arr = {-18, -12, 0, 2, 3, 5, 8, 10, 11, 9, 8,7};
       int ans = findPeakIndex(arr);
       System.out.println(ans);
    }
    static int findPeakIndex( int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            // find the middle element
            // int mid = (start + end) / 2 //  might be possible that start + end reach the limit of int
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
}