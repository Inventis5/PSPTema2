package com.MateuGiner.tema01.multihilo.Ejercicio3;

import com.MateuGiner.tema01.multihilo.Ejercicio01.Hilo;

//montar el modo demonio sin esperar

public class Ejercicio03 {
    static void main(String args[]) throws InterruptedException {
        Thread hilo = new Thread(() -> {
            for(int i=1; i<=100; i++){
                System.out.println(i);
            }
        });

        hilo.setDaemon(true);
        hilo.start();
        System.out.println("Fin del programa");
    }
}
