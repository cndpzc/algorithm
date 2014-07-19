package com.szy.intro;

import com.szy.common.TimeCost;

import static com.szy.common.Utils.genRandom;
import static com.szy.common.Utils.print;

/**
 * Created by lenovo on 2014/7/13.
 */
public class MergeSort {
    public static void msort(int a[], int begin, int end) {
        if (begin >= end) {
            return;
        }
        int mid = begin + (end - begin) / 2;
        msort(a, begin, mid);
        msort(a, mid + 1, end);
        merge(a, begin, mid, end);
    }

    private static void merge(int[] a, int begin, int mid, int end) {
        int[] b = new int[mid - begin + 1];
        int[] c = new int[end - mid];
        int p = begin, q = mid + 1;
        for (int i = 0; i < b.length; i++) {
            b[i] = a[p++];
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = a[q++];
        }

        p = 0;
        q = 0;
        int i = begin;
        while (p < b.length && q < c.length) {
            if (b[p] < c[q]) {
                a[i++] = b[p++];
            } else {
                a[i++] = c[q++];
            }
        }
        while (p < b.length) {
            a[i++] = b[p++];
        }
        while (q < c.length) {
            a[i++] = c[q++];
        }
    }
    public static void main(String[] args) {
        int[] a = genRandom(100000, 9999);
        print(a);
        TimeCost t = new TimeCost();
        msort(a, 0, a.length - 1);
        t.pcost();
        print(a);
    }

}
