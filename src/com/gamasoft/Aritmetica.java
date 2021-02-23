package com.gamasoft;

public class Aritmetica {

    //Atributos a y b
    int a;
    int b;

    Aritmetica(){

    }

    Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }

    // Este metodo sumar toma los atributos de la clase
    int sumar(){
        return a + b;
    }
}