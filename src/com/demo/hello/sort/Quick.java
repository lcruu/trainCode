package com.demo.hello.sort;
//1.首先设定一个分界值，通过该分界值将数组分成左右两部分；
//2.将大于或等于分界值的数据放到到数组右边，小于分界值的数据放到数组的左边。此时左边部分中各元素都小于 或等于分界值，而右边部分中各元素都大于或等于分界值；
//3.然后，左边和右边的数据可以独立排序。对于左侧的数组数据，又可以取一个分界值，将该部分数据分成左右两 部分，同样在左边放置较小值，右边放置较大值。右侧的数组数据也可以做类似处理。
//4.重复上述过程，可以看出，这是一个递归定义。通过递归将左侧部分排好序后，再递归排好右侧部分的顺序。当 左侧和右侧两个部分的数据排完序后，整个数组的排序也就完成了。

public class Quick {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] =temp;
    }
    public static void sort(Comparable[] a){
        int low =0;
        int high =a.length-1;
        sort(a,low,high);
    }
    private static void sort(Comparable[] a,int low,int high){
        if(high<=low){
            return;
        }
        int partition =partition(a,low,high);
        sort(a,low,partition-1);//对左边的元素进行排序
        sort(a,partition+1,high);//对右边的元素进行排序
    }
    public static int partition(Comparable[] a,int low,int high) {
    Comparable key=a[low];//把最左边的元素做分界值
    int left=low;
    int right=high+1;
    while (true){
        //先从右往左扫描，找到一个比基准值小的元素
        while(less(key,a[--right])){//循环停止，找到了比基准值小的元素
            if(right==low){
                break;
            }
        }
            while (less(a[++left],key)){
                if(left==high){
                    break;
                }
            }
            if(left>=right){
                break;
            }else {
                exch(a,left,right);//交换left和right索引处的元素
            }
        }
        exch(a,low,right);//交换最后right索引处和基准值处索引的值
        return right;
    }
    }

