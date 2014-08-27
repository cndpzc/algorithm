package com.szy.intro;

/**
 * 在一个无序数组中找到第K大的元素
 */
public class FindKthSmall {
    public static int find(int[] a, int begin, int end, int k) {
        if (begin == end) {
            return a[begin];
        }
        int i = partition(a, begin, end); // 划分后中间元素的下标
        int j = k - 1 + begin; // 第k个大元素的下标
        if (j == i) {
            return a[i];
        } else if (j < i) {
            return find(a, begin, i - 1, k);
        } else {
            return find(a, i + 1, end, j - i);
        }
    }

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

    private static void swap(int a[], int p, int q) {
        int tmp = a[p];
        a[p] = a[q];
        a[q] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {4,8,1,6,2};
        System.out.println(find(a, 0, a.length - 1, 0));
    }
}
