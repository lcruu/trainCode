package com.demo.hello.test;

import com.demo.hello.sort.Insection;

import java.util.Arrays;

public class insectionTest {
    public static void main(String[] args){
        Integer[] a={4,3,2,10,12,1,5,6};
        Insection.sort(a);
   System.out.println(Arrays.toString(a));
    }
}
