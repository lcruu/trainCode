package com.demo.hello.thread;

public class TestDaemon {
    public static void main(String[] args) {
        God god =new God();
        You you =new You();

        Thread thread =new Thread(god);
        thread.setDaemon(true);

        thread.start();
        new Thread(you).start();

    }
}
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑你");
        }
    }
}
class You implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<36500;i++){
            System.out.println("开心快乐");
        }
        System.out.println("-----Good Bye------");
    }
}
//虚拟机不用等待守护线程执行完毕
//但是必须等待用户线程执行完毕
