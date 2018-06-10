package com.xinan.algorithm.sort;

import com.xinan.algorithm.util.ArrayUtils;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/8 22:38
 * 归并排序
 */
public class MergeSort {

    private static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (ArrayUtils.check(arr)) {
            return;
        }
        if (leftIndex == rightIndex) {
            return;
        }
        int middleIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
        mergeSort(arr, leftIndex, middleIndex);
        mergeSort(arr, middleIndex + 1, rightIndex);
        merge(arr, leftIndex, middleIndex, rightIndex);
    }

    /**
     * 对左右排序完成的子数组进行合并
     * 也就是对已排序的 leftIndex - middleIndex 之间的数据
     * 以及 middleIndex - rightIndex 之间的数据进行合并
     *
     * @param arr         目标数组
     * @param leftIndex   左边起始索引
     * @param middleIndex 中间索引
     * @param rightIndex  右边终止索引
     *                    <p>
     *                    for example：
     *                    int[] arr = {2, 4, 6, 1, 3, 7,         9, 4};
     *                    merge(arr, 0, 3, 6)
     *                    结果为 arr = {1, 2, 3, 4, 6, 7,        9, 4};
     *                    </p>
     */
    private static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
        int[] temp = new int[rightIndex - leftIndex + 1];
        int i = 0;
        int leftPointer = leftIndex;
        int rightPointer = middleIndex + 1;
        while (leftPointer <= middleIndex && rightPointer <= rightIndex) {
            temp[i++] = arr[leftPointer] < arr[rightPointer]
                    ? arr[leftPointer++] : arr[rightPointer++];
        }
        while (rightPointer <= rightIndex) {
            temp[i++] = arr[rightPointer++];
        }
        while (leftPointer <= middleIndex) {
            temp[i++] = arr[leftPointer++];
        }
        for (i = 0; i < temp.length; i++) {
            arr[i + leftIndex] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = ArrayUtils.generateRandomArray(5, 10);
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


}
