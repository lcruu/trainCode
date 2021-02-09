package com.demo.hello.sort;
public class Selection{
    //在每一次的遍历过程中，假定一个索引处的元素是最小值，和其他索引值依次比较，如果当前索引值大于某个索引处的值，则假定其他索引处的值为最小值，最后找出最小值所在的索引
    //交换第一个索引处和最小值所在索引处的值
public static void sort (Comparable[] a){
    //1：所有可以 “排序” 的类都实现了java.lang.Comparable接口，Comparable接口中只有一个方法。
    //2：public int compareTo(Object obj) ;
    //该方法：
    //返回 0 表示 this == obj
    //返回整数表示 this > obj
    //返回负数表示 this < obj
    for(int i=0;i< a.length-1;i++){
        int minIndex = i;
        for(int j=i+1;j< a.length;j++){
            if(greater(a[minIndex],a[j])){
                minIndex = j;
            }
        }
        exch(a,i,minIndex);
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