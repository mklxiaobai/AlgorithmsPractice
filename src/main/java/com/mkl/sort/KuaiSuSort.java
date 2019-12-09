package com.mkl.sort;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2019/10/9 12:23
 */
public class KuaiSuSort {
    public static int[] quickSort(int[] arr, int left, int right) {
        if (arr == null || left >= right || arr.length <= 1)
            return arr;
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
        return arr;
    }
    public static int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (right > left) {
            while (temp <= arr[right] && left < right) {
                --right;
            }
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            while (temp >= arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }
}
