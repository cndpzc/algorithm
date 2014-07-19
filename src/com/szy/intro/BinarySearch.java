package com.szy.intro;

/**
 * Created by lenovo on 2014/7/13.
 */
public class BinarySearch {
    /**
     * 在有序数组中二分查找
     * @param a 有序数组
     * @return 数组下标，找不到返回-1
     */
    public static int find(int a[], int x) {
        int begin = 0, mid = 0, end = a.length - 1;
        while(begin <= end) {
            mid = begin + (end - begin) / 2;
            if (a[mid] > x) {
                end = mid - 1;
            } else if (a[mid] < x) {
                begin = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,13};
        System.out.println(find(a, 1));
        System.out.println(find(a, 5));
        System.out.println(find(a, 7));
        System.out.println(find(a, 13));
        System.out.println(find(a, 99));
        System.out.println(find(a, -1));
    }
}
