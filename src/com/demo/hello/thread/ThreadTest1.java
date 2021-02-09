package com.demo.hello.thread;

public class ThreadTest1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<200;i++){
            System.out.println("我在看书："+i);
        }
    }
    public static void main(String[] args) {
     ThreadTest1 threadTest4 = new ThreadTest1();
     Thread thread = new Thread(threadTest4);
     thread.start();
     for (int i=0;i<1000;i++){
         System.out.println("我在打游戏"+i);
     }
}
}

