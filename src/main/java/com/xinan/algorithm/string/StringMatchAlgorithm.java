package com.xinan.algorithm.string;

/**
 * 字符串匹配算法
 * <p>
 * 两个字符串 A、B，计算 B 串是否为 A 串的子串，若是，则返回 B 串在 A 串中首次出现的索引，若不是，返回 -1。
 * <p>
 * 例：A = "great" B = "eat"，则返回 2.
 *
 * @author Moore
 * @since 2020/03/31
 */
public class StringMatchAlgorithm {

    public static void main(String[] args) {
        String a = "greatest";
        String b = "eat";
        System.out.println(bf(a, b));
    }

    /**
     * brute force
     */
    private static int bf(String a, String b) {
        String[] aArray = a.split("");
        String[] bArray = b.split("");
        for (int i = 0; i < aArray.length; i++) {
            for (int j = 0; j < bArray.length; j++) {
                if (i + j >= aArray.length || !bArray[j].equals(aArray[i + j])) {
                    break;
                }
                if (j == bArray.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
