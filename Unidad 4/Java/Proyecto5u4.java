

package com.mycompany.proyecto5u4;


public class Proyecto5u4 {

    
    public static void main(String[] args) {
        String[] frutas = { "Manzana", "Plátano", "Uva", "Pera", "Naranja" };
        String[] frutasAlReves = invertirArreglo(frutas);

        System.out.println("Arreglo Original:");
        imprimirArreglo(frutas);

        System.out.println("\nArreglo al Revés:");
        imprimirArreglo(frutasAlReves);
    }

    static String[] invertirArreglo(String[] array) {
        String[] arrayInvertido = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }

        return arrayInvertido;
    }

    static void imprimirArreglo(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
