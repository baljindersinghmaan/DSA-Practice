package com.baljinder.dsapractice;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {-2,-1,3 ,5,2,1, 4};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int correct = arr[i] - 1;
            if( arr[i] > 0 && arr[i]  != arr[correct] ){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }


    }
    private static void swap(int[] arr, int first, int second){
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
