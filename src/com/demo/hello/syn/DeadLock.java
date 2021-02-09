package com.demo.hello.syn;
//
public class DeadLock {

    public static void main(String[] args) {
        Makeup q1 = new Makeup(0,"灰姑娘");
        Makeup q2 = new Makeup(1,"白雪公主");
        q1.start();
        q2.start();
    }
}
class Lipstick{

}
class Mirror{

}
class Makeup extends Thread{
    //需要的资源只有一份，用static保证只有一份
    static Lipstick lipstick =new Lipstick();
    static Mirror mirror=new Mirror();
    int choice;
    String girlName;

    Makeup(int choice,String girlName){
        this.choice=choice;
        this.girlName=girlName;

    }
    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void makeup()throws InterruptedException{
        if(choice==0){
            synchronized (lipstick){
                System.out.println(this.girlName+"获得口红的锁");
                Thread.sleep(1000);}
                synchronized (mirror){//一秒后获得镜子的锁
                    System.out.println(this.girlName+"获得镜子的锁");
                }

        }else { synchronized (mirror){
            System.out.println(this.girlName+"获得镜子的锁");
            Thread.sleep(2000);}
            synchronized (lipstick){//一秒获得口红的锁
                System.out.println(this.girlName+"获得口红的锁");
            }

        }

    }
}
