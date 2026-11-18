package com.MateuGiner.tema01.multihilo.Ejercicio02;


public class Ejercicio02 {
    static void main(String args[]) throws InterruptedException {
        Hilo hilo = new Hilo();
        hilo.start();
        hilo.join();
        System.out.println("Fin del programa");
    }
}
