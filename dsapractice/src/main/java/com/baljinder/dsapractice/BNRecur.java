package com.baljinder.dsapractice;

public class BNRecur {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5,77, 88, 99};
        System.out.print(search(arr, 4,0, arr.length));

    }
   static int search(int[]  arr, int target, int s, int e){
        if(s > e)
            return -1;
        int m = s +(e -s) /2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] < target)
            return search(arr,target,m+1,e);
        else
            return search(arr, target, s,m-1);
   }
}
