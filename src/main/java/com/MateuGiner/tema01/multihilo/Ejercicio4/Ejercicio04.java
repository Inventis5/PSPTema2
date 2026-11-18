package com.MateuGiner.tema01.multihilo.Ejercicio4;

import com.MateuGiner.tema01.multihilo.Ejercicio02.Hilo;

public class Ejercicio04 {
    static void main(String args[]) throws InterruptedException {
        Hilo hilo = new Hilo();
        hilo.start();
        hilo.join();
        System.out.println("Fin del programa");
    }
}
