

package com.mycompany.proyecto20u3;


public class Proyecto20u3 {

 
    public static void main(String[] args) {
        int diasEnUnAño = 365;
        double ahorroDiario = 3.0; 
        double ahorroAnual = 0.0;
        int dia = 1;

        while (dia <= diasEnUnAño) {
            ahorroAnual += ahorroDiario;
            System.out.println("Día " + dia + ": Ahorro diario = $" + ahorroDiario + ", Ahorro acumulado = $" + ahorroAnual);
            ahorroDiario *= 3; 
            dia++;
        }

        System.out.println("Ahorro total en un año: $" + ahorroAnual);
    }
}
