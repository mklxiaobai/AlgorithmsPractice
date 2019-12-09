package com.mkl.sort;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2019/10/9 11:02
 */
public class GuiBingSort {
//          数组拆分
    public static void mergeSort(int [] a,int start,int end){
        if(start<end){
//           均等拆分数组
            int mid=(start+end)/2;
//           左侧数组进行递归排序
            mergeSort(a, start, mid);
//            右侧数组进行递归排序
            mergeSort(a, mid+1, end);
//            合并数组
            merge(a, start, mid, end);
        }
    }
    public static void merge(int [] a,int left,int mid,int right){

        int [] tmp=new int[a.length];
        int p1=left,p2=mid+1,k=left;

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }
//      如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while(p1<=mid) tmp[k++]=a[p1++];
        while(p2<=right) tmp[k++]=a[p2++];

        //返回原数组
        for (int i = left; i <=right; i++)
            a[i]=tmp[i];
    }

}
