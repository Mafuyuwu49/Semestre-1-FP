
package com.mycompany.proyecto8u3;

import java.util.Scanner;
public class Proyecto8u3 {

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int N1, N2;
            System.out.println("Ingresa el primer número: ");
            N1 = sc.nextInt();
            System.out.println("Ingresa el segundo número: ");
            N2 = sc.nextInt();

            if (N1 > N2)
                System.out.println(N1 + " es mayor que " + N2);
            else
                System.out.println(N1 + " es menor que " + N2);
    }
}
