package com.demo.hello.test;

import com.demo.hello.sort.Bubble;
import com.demo.hello.sort.Selection;

import java.util.Arrays;

public class bubbleTest {
    public static void main(String[] args){
        Integer[] a ={4,6,8,7,9,2,10,1};
        Bubble.sort(a);
        System.out.println(Arrays.toString(a));
    }
}


