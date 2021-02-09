package com.demo.hello.sort;

public class Merge {
    private static Comparable[] assist;
    public static void sort(Comparable[] a){
        assist = new Comparable[a.length];
        int low =0;
        int high = a.length-1;
        sort(a,low,high);
    }
    private static void sort(Comparable[] a,int low,int high){
        if(high <= low){
            return;
        }
        int mid = low + (high-low)/2;
        sort(a, low, mid);
        sort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    public static void merge(Comparable[] a,int low,int mid,int high){
        int i = low;//定义一个指针，指向assist数组中开始填充数据的索引
        int p1 = low;//定义一个指针，指向第一组数据的第一个元素
        int p2 = mid+1;
        while (p1<=mid && p2<=high){
            if(less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else{
                assist[i++] =a[p2++];
            }
        }
        while(p1<=mid){
            assist[i++]=a[p1++];
        }
        while(p2<=high){
            assist[i++]=a[p2++];
        }
        for(int index=low;index<=high;index++){
            a[index]=assist[index];//将assist数组中的数据拷贝到a数组中
        }
    }
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] =temp;
    }
}

