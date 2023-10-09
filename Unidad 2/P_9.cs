//Comentarios en una linea
/*Comentarios en bloque:
 * Console en Writeline para imprimir
 * Para imprimir texto sin variable
 * tiene que ir entre "" comillas dobles*/
using System;

namespace P_9 
{
    internal class Programa 9
    {
        static void Main(string[] args)
        {
            int a, b, l, o, v, e;
            Console.WriteLine("Introduce primer valor");
            a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Introduce segundo valor");
            b = Convert.ToInt32(Console.ReadLine());

            l = a + b;
            Console.WriteLine(" Suma es igual a :" + l);
            o = a - b;
            Console.WriteLine(" Resta es igual a :" + o);
            v = a * b;
            Console.WriteLine(" Multiplicación es igual a :" + v);
            e = a / b;
            Console.WriteLine(" División es igual a :" + e);
        }
    }
}
