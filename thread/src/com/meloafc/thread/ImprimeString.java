package com.meloafc.thread;

public class ImprimeString implements Runnable {

    @Override
    public void run() {
        System.out.println("String");
    }

    public static void main(String[] args) {
        Runnable tarefa = new ImprimeString();
        Thread thread = new Thread(tarefa);
        thread.start();
    }

}
