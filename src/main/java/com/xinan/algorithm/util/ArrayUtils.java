package com.xinan.algorithm.util;


/**
 * @author Moore
 * @since 2018/6/8
 */
public class ArrayUtils {

    private static final int ARRAY_MIN_LENGTH = 2;

    public static void main(String[] args) {
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
        if (size <= 0) {
            return null;
        }
        int[] arr = new int[size];
        if (start >= end) {
            throw new IllegalArgumentException("无效的参数");
        }
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
        if (i == j) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static boolean check(int[] arr) {
        return arr == null || arr.length < ARRAY_MIN_LENGTH;
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

    public static int[] copyArray(int[] arr) {
        int[] copiedArray = new int[arr.length];
        System.arraycopy(arr, 0, copiedArray, 0, arr.length);
        return copiedArray;
    }
}
