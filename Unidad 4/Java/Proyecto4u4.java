

package com.mycompany.proyecto4u4;


public class Proyecto4u4 {

   
    public static void main(String[] args) {
        double[] temperaturas = { 25.5, -10.0, 15.8, -5.5, 30.0 };

        int totalTempN = contarTempN(temperaturas);

        System.out.println("El total de temperaturas negativas es: " + totalTempN);
    }

    static int contarTempN(double[] array) {
        int contador = 0;

        for (double temperatura : array) {
            if (temperatura < 0) {
                contador++;
            }
        }

        return contador;
    }
}

