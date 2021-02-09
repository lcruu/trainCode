package com.demo.hello.thread;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ThreadTest extends Thread {
      private String url;
      private String name;

    public ThreadTest(String url,String name){
       this.name=name;
       this.url=url;
    }
    @Override
    public void run(){
        webDownloader webDownloader = new webDownloader();
        webDownloader.Downloader(url,name);
        System.out.println("下载了文件名"+name);
    }

    public static void main(String[] args) {
        ThreadTest threadTest1 = new ThreadTest("https://i0.hdslb.com/bfs/sycp/creative_img/202102/c5c51e3f52938b2c4f7d48011e03dd21.jpg","1.jpg");
        ThreadTest threadTest2 = new ThreadTest("https://i1.hdslb.com/bfs/archive/bbd8d5c1a09efb2e1dc93f2374c55037d7cb7fa1.jpg@336w_190h.webp","2.jpg");
        ThreadTest threadTest3 = new ThreadTest("https://i2.hdslb.com/bfs/archive/4d26e6659456c5a01a9b1d52ff12554e5ee9cec3.jpg@336w_190h.webp","3.jpg");
        threadTest1.start();
        threadTest2.start();
        threadTest3.start();
    }
}
//下载器
class webDownloader {
    public void Downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，方法出现异常");
        }

    }
}
