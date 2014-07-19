package com.szy.common;

import java.util.Random;

/**
 * Created by lenovo on 2014/7/13.
 */
public class Utils {
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] genRandom(int len, int max) {
        int[] a = new int[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            a[i] = r.nextInt(max);
        }
        return a;
    }
}
