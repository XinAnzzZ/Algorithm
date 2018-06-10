package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/8 13:22
 * 选择排序
 */
public class SelectionSort {

    private static int[] selectionSort(int[] arr) {
        if (ArrayUtils.check(arr)) {
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
        int[] arr = ArrayUtils.generateRandomArray(10, 10);
        System.out.println(Arrays.toString(arr));
        int[] sortedArray = selectionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}
