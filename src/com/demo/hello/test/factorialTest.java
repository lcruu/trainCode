package com.demo.hello.test;

public class factorialTest {
    public static void main(String[] args){
        long result=factorial(10);
System.out.println(result);
    }
    public static long factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
