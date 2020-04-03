package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author Moore
 * @since 2018/6/8
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateRandomArray(10, 0, 10);
        System.out.println(Arrays.toString(arr));
        int[] sortedArray = bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    /**
     * 冒泡排序
     *
     * @param arr 目标数组
     * @return 排序后的数组
     */
    private static int[] bubbleSort(int[] arr) {
        if (ArrayUtils.check(arr)) {
            return arr;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    ArrayUtils.swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }

}
