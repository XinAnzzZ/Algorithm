package com.xinan.algorithm.util;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/6/8 13:22
 */
public class ArrayUtils {

    public static final int ARRAY_MIN_LENGTH = 2;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(generateRandomArray(5, -10, 10)));
        }
    }

    /**
     * 生成 [start, end) 区间上的随机数组
     *
     * @param size  the size
     * @param start the start
     * @param end   the end
     * @return the array
     */
    public static int[] generateRandomArray(int size, int start, int end) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomInteger(start, end);
        }
        return arr;
    }

    /**
     * 生成 [0, end) 区间上的随机数组
     *
     * @param size the size
     * @param end  the end
     * @return the array
     */
    public static int[] generateRandomArray(int size, int end) {
        return generateRandomArray(size, 0, end);
    }

    /**
     * 交换数组 arr 第 i 个位置和第 i + 1 位置上的元素
     *
     * @param arr 目标数组
     * @param i   the i
     * @param j   the i + 1
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 在 [start, end) 区间上生成一个随机数，前闭后开
     *
     * @param start the start
     * @param end   the end
     * @return random integer
     */
    private static int generateRandomInteger(int start, int end) {
        return (start + (int) (Math.random() * (end - start)));
    }
}
