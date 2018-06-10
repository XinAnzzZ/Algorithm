package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/8 21:09
 * <p>
 * 插入排序
 */
public class InsertionSort {

    private static int[] insertionSort(int[] arr) {
        if (ArrayUtils.check(arr)) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    ArrayUtils.swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = ArrayUtils.generateRandomArray(10, 10);
        System.out.println(Arrays.toString(array));
        int[] sortedArray = insertionSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
