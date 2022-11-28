package com.exercises.algorithm.sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class QuickSort {
     static int partition(int array[], int low, int high) {
         int pivot = array[high];
         int i = (low - 1);
         for (int j = low; j < high; j++) {
             if (array[j] <= pivot) {
                 i++;
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }
         }
         int temp = array[i + 1];
         array[i + 1] = array[high];
         array[high] = temp;
         return i + 1;
     }

     static void quickSort(int array[], int low, int high) {
         if (low < high) {
             int pi = partition(array, low, high);
             quickSort(array, low, pi - 1);

             quickSort(array, pi + 1, high);
         }
     }

     public static void main(String[] args) throws IOException {
   Scanner s =  new Scanner(System.in);
         System.out.println("Enter number of elements: ");
         int n=s.nextInt();
         int array1[]=new int[n];
         System.out.println("Enter elements: ");
         for (int i = 0; i < n; i++) {
             array1[i]=s.nextInt();

         }
         for (int i: array1) {
             System.out.println(i);
         }
         System.out.println("Unsorted Array");
         System.out.println(Arrays.toString(array1));
         int size = array1.length;
         QuickSort.quickSort(array1,0,size-1);
         System.out.println("Sorted Array ");
         System.out.println(Arrays.toString(array1));
     }
 }
