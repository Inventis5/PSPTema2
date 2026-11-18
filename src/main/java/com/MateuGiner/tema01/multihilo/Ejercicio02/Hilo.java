package com.MateuGiner.tema01.multihilo.Ejercicio02;

public class Hilo extends Thread {
    @Override
    public void run(){
        super.run();
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }
}
