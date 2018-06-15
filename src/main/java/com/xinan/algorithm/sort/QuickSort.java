package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;
import com.xinan.algorithm.util.Comparator;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/11 13:40
 */
public class QuickSort {

    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (ArrayUtils.check(arr)) {
            return;
        }
        if (leftIndex >= rightIndex) {
            return;
        }
        int leftPointer = leftIndex;
        int rightPointer = rightIndex;
        int key = arr[leftPointer];
        while (leftPointer != rightPointer) {
            while (arr[rightPointer] >= key) {
                rightPointer--;
                if (leftPointer >= rightPointer) {
                    break;
                }
            }
            if (leftPointer >= rightPointer) {
                break;
            }
            ArrayUtils.swap(arr, leftPointer, rightPointer);
            while (arr[leftPointer] <= key) {
                leftPointer++;
                if (leftPointer >= rightPointer) {
                    break;
                }
            }
            ArrayUtils.swap(arr, leftPointer, rightPointer);
        }
        quickSort(arr, leftIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, rightIndex);
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 10);
        System.out.println(Arrays.toString(arr));
        int[] copiedArray = ArrayUtils.copyArray(arr);
        quickSort(copiedArray, 0, copiedArray.length - 1);
        System.out.println(Arrays.toString(copiedArray));
        Comparator.compareSort(arr, copiedArray);
    }
}
