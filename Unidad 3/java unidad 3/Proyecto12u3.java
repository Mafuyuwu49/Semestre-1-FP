

package com.mycompany.proyecto12u3;
import java.util.Scanner;
public class Proyecto12u3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, total, num ;
        System.out.println("Escribe el numero total a procesar: ");
        total= sc.nextInt();
        for (c=1; c<=total; c++){ 
            System.out.println("Escribe numero: ");
            num = sc.nextInt();
            if(num%2 == 0)
                System.out.println("PAR");
            else 
                System.out.println("IMPAR");
        }
        
    }
}
