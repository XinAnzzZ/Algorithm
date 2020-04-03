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
        // 6 17 4 0 19 4 18 19
        String a = "greatest";
        String b = "eat";
        System.out.println(bf(a, b));
        System.out.println("RK -> 第一次出现的位置是：" + rk(a, b));
    }

    /**
     * brute force
     * 暴力算法
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

    /**
     * RK 算法：发明者 Rabin-Karp
     */
    private static int rk(String a, String b) {
        int n = a.length();
        int m = b.length();

        int hash = hash(a, m);
        int h = hash(b, m);

        char[] chars = a.toCharArray();
        for (int i = m - 1; i < n; i++) {
            int offset = i - m + 1;
            hash = nextHash(chars, hash, offset, m);
            if (hash == h && a.substring(offset, offset + m).equals(b)) {
                return offset;
            }
        }

        return -1;
    }

    /**
     * 27 21 23 23 41 41
     * <p>
     * 6 17 4 0 19 4 18 19
     * g r  e a  t e  s  t
     */
    private static int nextHash(char[] chars, int hash, int offset, int length) {
        if (offset <= 0) {
            return hash;
        }
        return hash - (chars[offset - 1] - 'a') + (chars[offset + length - 1] - 'a');
    }

    private static int hash(String s, int length) {
        if (length > s.length()) {
            throw new IllegalArgumentException("length 必须小于等于 s 的长度！");
        }
        char[] chars = s.toCharArray();
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash = hash + (chars[i] - 'a');
        }
        return hash;
    }
}
