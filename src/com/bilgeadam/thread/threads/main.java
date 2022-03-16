package com.bilgeadam.thread.threads;

import java.security.CodeSigner;

public class main {
    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.produce();
            }
        });
        Thread Consumer = new Thread(new Runnable() {
            @Override
            public void run() {
               producerConsumer.produce();
            }
        });

        producer.start();
        Consumer.start();

        try{
            producer.join();
            Consumer.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
        System.out.println("Thread Sonlandi");

    }
}
