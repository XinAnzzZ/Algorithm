package com.xinan.algorithm.util;

import java.util.Arrays;

/**
 * @author Moore
 * @since 2018/6/11
 */
public class Comparator {

    public static void compareSort(int[] array, int[] sortedArray) {
        Arrays.sort(array);
        if (array.length != sortedArray.length) {
            System.out.println("Wrong Answer! Cause different length!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != sortedArray[i]) {
                System.out.println("Wrong Answer! Cause different item!");
                return;
            }
        }
        System.out.println("Nice! Accepted! ");
    }
}
