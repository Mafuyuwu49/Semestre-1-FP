using System;

namespace P_9 
{
    internal class Calculadora
    {
        static void Main(string[] args)
        {
            int a, b, s, r, m, d;
            Console.WriteLine("Introduce primer valor");
            a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Introduce segundo valor");
            b = Convert.ToInt32(Console.ReadLine());

            s = a + b;
            Console.WriteLine(" Suma es igual a :" + s);
            r = a - b;
            Console.WriteLine(" Resta es igual a :" + r);
            m = a * b;
            Console.WriteLine(" Multiplicación es igual a :" + m);
            d = a / b;
            Console.WriteLine(" División es igual a :" + d);
        }
    }
}
