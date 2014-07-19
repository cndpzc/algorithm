package com.szy.intro;

import com.szy.common.TimeCost;

/**
 * Created by lenovo on 2014/7/13.
 */
public class Fibonacci {

    /**
     * 递归，指数级时间
     * @param n
     * @return
     */
    public static int f1(int n) {
        if (n <= 1) {
            return n;
        }
        return f1(n - 1) + f1(n - 2);
    }

    public static int f2(int n) {
        if (n <= 1) {
            return n;
        }
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    public static int f3(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 45;

        TimeCost t1 = new TimeCost();
        System.out.println(f1(n));
        t1.pcost();

        TimeCost t2 = new TimeCost();
        System.out.println(f2(n));
        t2.pcost();

        TimeCost t3 = new TimeCost();
        System.out.println(f3(n));
        t3.pcost();
    }
}
