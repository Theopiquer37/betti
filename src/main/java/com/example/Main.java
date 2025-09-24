package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        int x = 10;
        MioThread trombone = new MioThread(100);
        trombone.start();
        MioThread astinenza = new MioThread(100);
        astinenza.start();
        trombone.join();
        astinenza.join();
        System.out.println("finito");
    }
}