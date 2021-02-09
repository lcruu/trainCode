package com.demo.hello.thread;
//多个线程同时操作同一个对象会出现线程紊乱的情况
public class ThreadTest2 implements Runnable {
    private int ticketNums =10;
    @Override
    public void run() {
        while(true){
            if(ticketNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        ThreadTest2 ticket =new ThreadTest2();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"黄牛党").start();
    }
}
