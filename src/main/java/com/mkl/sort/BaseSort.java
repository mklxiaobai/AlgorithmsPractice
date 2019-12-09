package com.mkl.sort;

import java.util.Arrays;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2019/10/9 9:41
 */
public class BaseSort {
    //冒泡排序
    public static int[] MaoPaoSort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            boolean flag = false;
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            //当本次无替换操作时，认为此数组已完成排序
            if(flag == false)
            {
                return a;
            }
        }
        return a;
    }
    public static int[] ChaRuSort(int[] array) {
        int i,j,temp;
        for(i=1;i<array.length;i++) {
            temp=array[i];
            for(j=i-1;j>=0;j--) {
                if(temp>array[j]) {
                    break;
                }else {
//                    如果前一位比后一位大，前一位后移
                    array[j+1]=array[j];
                }
            }
            array[j+1]=temp;
        }
        return array;
    }

    public static int[] XuanZeSort(int[] array) {
        int i,j,index;
        for(i=0;i<array.length;i++) {
            index=i;
            for(j=i+1;j<array.length;j++) {
                if(array[j]<array[index]) {
                    index=j;
                }
            }
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
        return array;
    }
}
