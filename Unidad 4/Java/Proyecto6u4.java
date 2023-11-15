
package com.mycompany.proyecto6u4;


public class Proyecto6u4 {

  
    public static void main(String[] args) {
        int[] numeros = { 25, 17, 8, 42, 13, 7 };

        ordenarArreglo(numeros);

        System.out.println("Arreglo Ordenado:");
        imprimirArreglo(numeros);
    }

    static void ordenarArreglo(int[] array) {
        int[] auxiliar = new int[array.length];
        ordenPorInsercion(array, auxiliar);
    }

    static void ordenPorInsercion(int[] array, int[] auxiliar) {
        for (int i = 1; i < array.length; i++) {
            int elementoActual = array[i];
            int j = i - 1;

            while (j >= 0 && auxiliar[j] > elementoActual) {
                auxiliar[j + 1] = auxiliar[j];
                j--;
            }

            auxiliar[j + 1] = elementoActual;
        }

        System.arraycopy(auxiliar, 0, array, 0, array.length);
    }

    static void imprimirArreglo(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
