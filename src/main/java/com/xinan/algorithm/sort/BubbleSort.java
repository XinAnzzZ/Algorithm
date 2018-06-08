package com.xinan.algorithm.sort;

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
        int minLength = 2;
        if (arr == null || arr.length < minLength) {
            return arr;
        }
        for (int end = arr.length - 1; end >= 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }

    /**
     * 交换数组 arr 第 i 个位置和第 i + 1 位置上的元素
     *
     * @param arr 目标数组
     * @param i   the i
     * @param i1  the i + 1
     */
    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

}
