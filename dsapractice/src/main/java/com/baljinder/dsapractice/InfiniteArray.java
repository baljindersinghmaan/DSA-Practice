package com.baljinder.dsapractice;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 2, 3, 5, 8, 10, 11};
        int target = 8;
        int ans = findAns(arr, target);
        System.out.println(ans);
    }

    public static int findAns(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start < end) {
            // find the middle element
            // int mid = (start + end) / 2 //  might be possible that start + end reach the limit of int
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}