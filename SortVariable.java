package Algorythm.HomeWork_002;

import java.util.Comparator;

public class SortVariable {


    public static class InsertionSort {
        public static <T> void sort(T[] array, Comparator<T> tComparator) {
            for (int i = 1; i < array.length; i++) { // O(n)
                int j = i - 1;
                T value = array[i];

                while (j >= 0 && tComparator.compare(array[j], value) > 0) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = value;
            }
        }
    }


    public class MergeSort {
        public static <T> void sort(T[] array, Comparator<T> tComparator) {
            mergeSort(array,array.length,tComparator);
        }
        public static <T> void mergeSort(T[] array, int n, Comparator<T> tComparator) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            T[] leftArray = (T[]) new Object[mid];
            T[] rightArray = (T[]) new Object[n - mid];

            for (int i = 0; i < mid; i++) {
                leftArray[i] = array[i];
            }
            for (int i = mid; i < n; i++) {
                rightArray[i - mid] = array[i];
            }
            mergeSort(leftArray, mid,tComparator);
            mergeSort(rightArray, n - mid,tComparator);

            merge(array, leftArray, rightArray, mid, n - mid,tComparator);
        }
        public static <T>void merge(
                T[] array, T[] leftArray, T[] rightArray, int left, int right,Comparator<T> tComparator) {

            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (tComparator.compare(leftArray[i],rightArray[j])<0){
                    array[k++] = leftArray[i++];
                }
                else {
                    array[k++] = rightArray[j++];
                }
            }
            while (i < left) {
                array[k++] = leftArray[i++];
            }
            while (j < right) {
                array[k++] = rightArray[j++];
            }
        }
    }






}