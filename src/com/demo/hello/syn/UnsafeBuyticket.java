package com.demo.hello.syn;

public class UnsafeBuyticket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station,"帅气的我").start();
        new Thread(station,"你").start();
        new Thread(station,"www").start();
    }
}
class BuyTicket implements Runnable{
    private int ticketNums =10;
    boolean flag = true;
    @Override
    public void run() {
       while(flag){
           try {
               buy();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

    }
    //synchronized 默认锁的是this
    //synchronized同步代码块的对象是需要增删改查的对象
    private synchronized void buy() throws InterruptedException{
        if(ticketNums<=0){
            flag =false;
            return;
        }

            Thread.sleep(100);


        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
