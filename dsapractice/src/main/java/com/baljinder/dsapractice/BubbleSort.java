package com.baljinder.dsapractice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,8,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for(int i=0; i < arr.length; i++){
            int last = arr.length -i -1 ;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }
    static void swap(int[] arr, int first, int last){
        int tmp = arr[first];
        arr[first] = arr[last];
        arr[last] = tmp;
    }
    static int getMaxIndex(int[] arr, int first, int last){
        int max = first;
        for(int i = first; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0; i< arr.length;i++){
            swapped = false;
            for(int j = 1; j < arr.length -i; j++){
                if (arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
