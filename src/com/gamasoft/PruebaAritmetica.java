package com.gamasoft;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Artimetica
        Aritmetica obj1 = new Aritmetica();
        obj1.a = 3;
        obj1.b = 4;
        int resultado = obj1.sumar();
        System.out.println("resultado = " + resultado);

        Aritmetica obj2 = new Aritmetica(4, 11);
        resultado = obj2.sumar();
        System.out.println("obj2 = " + resultado);
    }
}
