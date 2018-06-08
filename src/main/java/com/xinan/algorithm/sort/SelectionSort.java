package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/8 13:22
 */
public class SelectionSort {

    private static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length < ArrayUtils.ARRAY_MIN_LENGTH) {
            return arr;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            int temp = 0;
            for (int i = 1; i < end; i++) {
                if (arr[i] > arr[temp]) {
                    temp = i;
                }
            }
            ArrayUtils.swap(arr, temp, end);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        System.out.println(Arrays.toString(arr));
        int[] target = selectionSort(arr);
        System.out.println(Arrays.toString(target));
    }
}
