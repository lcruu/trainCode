package com.demo.hello.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep  {
//每个对象都有一把锁，sleep不会释放锁

     public void tenDown() throws InterruptedException{
        int num =10;
        while(true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num<=0){
                break;
            }
        }
     }
    public static void main(String[] args) {
        Date startTime =new Date(System.currentTimeMillis());
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
