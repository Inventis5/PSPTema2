package com.MateuGiner.tema01.multihilo.Ejercicio3;

import com.MateuGiner.tema01.multihilo.Ejercicio01.Hilo;

//montar el modo demonio sin esperar

public class Ejercicio03 {
    static void main(String args[]) throws InterruptedException {
        Hilo hilo = new Hilo();
        hilo.start();
        System.out.println("Fin del programa");
    }
}
