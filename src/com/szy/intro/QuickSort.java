package com.szy.intro;

import com.szy.common.TimeCost;

import static com.szy.common.Utils.genRandom;
import static com.szy.common.Utils.print;

/**
 * Created by lenovo on 2014/7/19.
 */
public class QuickSort {

    public static void qsort(int[] a, int begin, int end) {
        if (begin < end) {
            int i = partition2(a, begin, end);
            qsort(a, begin, i - 1);
            qsort(a, i + 1, end);
        }
    }

    /**
     * 选取p为pivot，从左到右遍历，将小于pivot的元素交换到左边
     * @param a
     * @param p
     * @param q
     * @return
     */
    private static int partition(int[] a, int p, int q) {
        int x = a[p];
        int i = p;
        for (int j = p + 1; j <= q; j++) {
            if (a[j] <= x) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, p, i);
        return i;
    }

    /**
     * 另一种划分方法，两头往中间遍历
     * @param a
     * @param p
     * @param q
     * @return
     */
    private static int partition2(int[] a, int p, int q) {
        int x = a[q];
        int i = p, j = q;
        while (true) {
            while (a[i] <= x && i < j) {
                i++;
            }
            while (a[j] >= x && i < j) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            } else {
                break;
            }
        }
        swap(a, j, q);
        return j;
    }

    private static void swap(int a[], int p, int q) {
        int tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }

    public static void main(String[] args) {
        int[] a = genRandom(100000, 9999);
        print(a);
        TimeCost t = new TimeCost();
        qsort(a, 0, a.length - 1);
        t.pcost();
        print(a);
    }
}
