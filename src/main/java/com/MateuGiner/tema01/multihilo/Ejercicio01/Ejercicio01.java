package com.MateuGiner.tema01.multihilo.Ejercicio01;


public class Ejercicio01 {
    static void main(String args[]) {
        Hilo hilo = new Hilo();
        hilo.start();
        System.out.println("Fin del programa");

/*
        //opción 2

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(i);
                }
            }

        });


        //opcion 3


        new Thread(() -> {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(i);
                }

        }).start();


 */
    }
}