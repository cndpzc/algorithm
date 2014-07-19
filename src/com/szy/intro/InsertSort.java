package com.szy.intro;

/**
 * Created by lenovo on 2014/7/13.
 */

import com.szy.common.TimeCost;

import static com.szy.common.Utils.*;

public class InsertSort {
    public static void isort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = genRandom(100000, 9999);
        print(a);
        TimeCost t = new TimeCost();
        isort(a);
        t.pcost();
        print(a);
    }
}
