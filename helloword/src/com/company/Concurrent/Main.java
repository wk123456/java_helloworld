package com.company.Concurrent;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        Runnable r = new Runnable(){
            @Override
            public void run() {


            }
        };

        Thread threadA = new Thread(()->{
            for(int j = 0;j<100;j++){

                System.out.println("A"+i);
            }

        });
    }
}
