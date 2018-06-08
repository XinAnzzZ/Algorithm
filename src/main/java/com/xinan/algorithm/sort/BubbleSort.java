package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/8 10:59
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 15, 7, 20, 5};
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
        if (arr == null || arr.length < ArrayUtils.ARRAY_MIN_LENGTH) {
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
