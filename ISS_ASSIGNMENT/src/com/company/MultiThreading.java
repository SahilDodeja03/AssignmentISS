package com.company;


class MyThread extends Thread {
    public void run() {
        System.out.println("Extended Thread is running...");
    }
}


class MultiThreading implements Runnable {
    public void run() {
        System.out.println("Implemented Thread is running...");
    }

    public static void main(String[] args) {
        Thread implementThread = new Thread(new MultiThreading());
        MyThread exrtendThread = new MyThread();
        implementThread.start();
        exrtendThread.start();

    }
}
