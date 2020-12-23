package com.company.concurrency.interrupt;


import org.junit.Test;

import static java.lang.Thread.sleep;

public class test {
    /*interrupt()方法作用于阻塞的线程（调用sleep或wait）会产生异常
    * */
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"启动--------------");
                for(int i=0;i<100;i++){
                    try {
                        sleep(10);
                        System.out.println(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        sleep(10);

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"启动-----------------");
                for(int i=0;i<100;i++){
                    try {
                        thread1.interrupt();
                        sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();


    }


    /*
    * Thread.currentThread().isInterrupted()判断是否要终止线程
    * interrupt()方法是请求终止线程，调用该方法线程的中断状态会被置位，此时可以用isInterrupted()来获取到中断状态
    * stop()方法是强制终止线程，已弃用。*/
    @Test
    public void test2() throws InterruptedException {
        Thread t1 = new Thread(()->{
            int i = 0;
            while(!Thread.currentThread().isInterrupted()){
                System.out.println(i);
                i++;
            }
        });
        t1.start();
        sleep(10);
        Thread t2 = new Thread(t1::interrupt);
        t2.start();
    }

/*
* 如果在中断状态被置位时调用 sleep 方法，它不会休眠。相反，它
将清除这一状态（丨）并拋出 IntemiptedException*/

    @Test
    public void test3() throws Exception {
        Thread t1 = new Thread(()->{
            while(true){
                System.out.println(Thread.currentThread().isInterrupted());
                try {
                    for(int i=0;i<1000;i++){

                    }
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        sleep(1);
        Thread t2 = new Thread(t1::interrupt);
        t2.start();

    }
}
