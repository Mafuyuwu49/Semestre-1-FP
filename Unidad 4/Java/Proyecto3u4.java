

package com.mycompany.proyecto3u4;

import java.util.Scanner;
public class Proyecto3u4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de temperaturas: ");
        int totalTemp = Integer.parseInt(scanner.nextLine());

        double[] tempC = new double[totalTemp];
        double[] tempF = new double[totalTemp];
        double[] tempK = new double[totalTemp];

        for (int a = 0; a < totalTemp; a++) {
            System.out.print("Ingrese la temperatura en °C " + (a + 1) + ": ");
            tempC[a] = Double.parseDouble(scanner.nextLine());

            tempF[a] = (tempC[a] * 9 / 5) + 32;
            tempK[a] = tempC[a] + 273.15;
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < totalTemp; i++) {
            System.out.println("Temperatura " + (i + 1) + ":");
            System.out.println("   En Celsius: " + tempC[i]);
            System.out.println("   En Fahrenheit: " + tempF[i]);
            System.out.println("   En Kelvin: " + tempK[i]);
        }
    }
}
