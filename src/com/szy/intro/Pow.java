package com.szy.intro;

import com.szy.common.TimeCost;

/**
 * Created by lenovo on 2014/7/13.
 */
public class Pow {

    public static long pow(int x, int n) {
        if (n <= 0) {
            return 0;
        }
        long r = x;
        for (int i = 1; i < n; i++) {
            r *= x;
        }
        return r;
    }
    /**
     * 分治法计算乘方
     * 需考虑n为偶数和奇数的不同情况
     * @param x 底
     * @param n 次方，大于0
     * @return
     */
    public static long dpow(int x, int n) {
        if (n == 1) {
            return x;
        }
        if ((n & 1) == 0) {
            // 偶数
            n = n / 2;
            long r = dpow(x, n);
            return r * r;
        } else {
            // 奇数
            n = (n - 1) / 2;
            long r = dpow(x, n);
            return  r * r * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 54;
        TimeCost t1 = new TimeCost();
        System.out.println(pow(x, n));
        t1.pcost();

        TimeCost t2 = new TimeCost();
        System.out.println(dpow(x, n));
        t2.pcost();

        TimeCost t3 = new TimeCost();
        System.out.println(Math.pow(x, n));
        t3.pcost();
    }
}
