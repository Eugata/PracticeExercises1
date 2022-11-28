package com.exercises.algorithm.sorting;

import java.io.IOException;
import java.util.Scanner;

 class BubbleSort {
    public static void bubbleSort(int[] sort_arr, int len){
        for (int i = 0; i <len-1 ; ++i) {
            for (int j = 0; j < len-i-1; ++j) {
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }

        }
    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of elements: ");
        int n=s.nextInt();
        int array[]=new int[n];
        System.out.println("enter elements of the array: ");
        for (int i = 0; i <n ; i++) {
            array[i]=s.nextInt();
        }
        for (int i: array) {

        }
        int len= array.length;
        bubbleSort(array,len);

        System.out.println("Sorted array using Bubble Sort algorithm \n");
        for (int i = 0; i < len;++i) {
            System.out.println(array[i] + " ");
        }
    }
}
