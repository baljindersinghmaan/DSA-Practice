package com.baljinder.dsapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircleSortFindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2};
       ;
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));
       // System.out.println(findDuplicateNumbers(arr));
    }

    private static int sort(int[] arr) {
        int index = 0;

        while (index < arr.length) {
            if (arr[index] != index) {
                if (arr[index] != arr[index - 1]) {
                    swap(arr, arr[index], index);
                } else {
                    return arr[index];
                }
            }else {
                index++;
            }
        }
        return -1;

    }

    private static void swap(int[] arr, int first, int index) {
        int tmp = arr[first];
        arr[first] = arr[index];
        arr[index] = tmp;
    }
    private static int findMissingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }
    private static List<Integer> findDuplicateNumbers(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
