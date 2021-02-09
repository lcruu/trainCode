package com.demo.hello.sort;
public class Bubble {
    //比较相邻的元素，如果前一个元素比后一个元素大，就交换这两个元素的位置
    //对每一组相邻的元素做同样的工作，从第一队元素到最后一队元素，最终最后的位置就是最大值
    public static void sort(Comparable[] a){
        for(int i=0;i< a.length-1;i++){
            for(int j=0;j<i;j++){
                if(greater(a[j],a[j+1])) {
                exch(a,j,j+1);
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
        a[i] = a[j];
        a[j] = temp;
    }
}

