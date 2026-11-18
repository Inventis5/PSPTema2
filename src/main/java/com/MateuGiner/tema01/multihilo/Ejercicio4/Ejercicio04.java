package com.MateuGiner.tema01.multihilo.Ejercicio4;

import com.MateuGiner.tema01.multihilo.Ejercicio02.Hilo;

public class Ejercicio04 {
    static void main(String args[]) throws InterruptedException {
        Thread hilo = new Thread(() -> {
            for(int i=1; i<=100; i++){
                System.out.println(i);
            }
        });

        hilo.setDaemon(true);
        hilo.start();
        hilo.join();
        System.out.println("Fin del programa");
}
