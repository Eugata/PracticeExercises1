package com.exercises.algorithm.sorting;

import java.util.Arrays;

public class MergeSort {
    static int[] leftSort(int[] arr){
        if(arr.length<2){
            return arr;
        }
        int mid = arr.length/2;
        int[] leftHalf = new int[mid];
//        left
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = arr[i];
        }
        return  leftHalf;
    }
    static int[]rightSort(int[]arr){
        if(arr.length<2){
            return arr;
        }
        int mid1 = arr.length / 2;
        int[] rightHalf = new int[arr.length - mid1];
        //right
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = arr[i] - mid1;
        }
        return rightHalf;
        }
        static int[] merge(int[] arr,int[]leftHalf, int[]rightHalf) {
            int leftLenght = leftHalf.length;
            int rightLength = rightHalf.length;

            int l = 0;
            int r = 0;
            int a = 0;
            while (l < leftLenght && r < rightLength) {
                if (leftHalf[l] <= rightHalf[r]) {
                    arr[a] = leftHalf[l];
                        l++;
                    }else{
                        arr[a] = rightHalf[r];
                        r++;
                    }
                    a++;
                }
                while (l < leftLenght) {
                    arr[a] = leftHalf[l];
                    l++;
                    a++;
                }
                return arr;
            }

    public static void main(String[] args) {
        int[] arr ={3,41,53,27,42,12,32,1};
        System.out.println(Arrays.toString(leftSort(arr)));
        System.out.println(Arrays.toString(rightSort(arr)));
        System.out.println(Arrays.toString(merge(arr,leftSort(arr),rightSort(arr))));
    }
        }
