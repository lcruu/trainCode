package com.demo.hello.sort;

public class Insection {
    //把所有元素分为两组，已经排序和没有排序的
    //找到未排序组中第一个元素，向已经排序的组中插入
    //倒序遍历已经排序的元素，依次和待插入的元素进行比较，知道找到一个元素小于待插入元素，那么就把待插入元素放到这个位置，其他元素向后移动一位
    public static void sort(Comparable[] a){
        for(int i=1;i< a.length;i++){
            for(int j=i;j>0;j--){
                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else{
                    break;
            }
            }
        }
    }
          public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
          }
          public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
          }
}