package com.sanefox;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {0, 5, -60, 4, 1, -4, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int m = partition(array, l, r);
            quickSort(array, l, m - 1);
            quickSort(array, m + 1, r);
        }
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static int partition(int[] array, int l, int r) {
        int m = l - 1;
        for (int j = l; j <= r - 1; j++) {
            if (array[j] <= array[r]) {
                swap(array, j, ++m);
            }
        }
        swap(array, r, m + 1);
        return m + 1;
    }
}
