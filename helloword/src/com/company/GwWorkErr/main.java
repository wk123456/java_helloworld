package com.company.GwWorkErr;

public class main {

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            Order order = new Order();
            createOrder(order);

        }
    }

    static synchronized void createOrder(Order order) throws InterruptedException {
        String taskNo = System.currentTimeMillis()+"";
        order.setTaskNo(taskNo);

       // Thread.sleep(10);
        System.out.println(order.toString()+"----"+order.getTaskNo());
    }
}
