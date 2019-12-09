package com.mkl.search;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2019/10/10 11:48
 */
//1.二分查找依赖的是顺序表结构，输入的必须是有序数组。
//2.数据量太大也适合二分查找、底层使用数据来保存数据，内存不一定够用
public class ErfenSearch {
//    二分查询
    public static int erFenSearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        while(low <= high){
            middle = (low + high) / 2;
            if(arr[middle] > key){
                //比关键字大则关键字在左区域
                high = middle - 1;
            }else if(arr[middle] < key){
                //比关键字小则关键字在右区域
                low = middle + 1;
            }else{
                return middle;
            }
        }
//      最后仍然没有找到，则返回-1
        return -1;
    }
}
