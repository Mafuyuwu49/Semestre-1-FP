using System;

namespace Proyecto8-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            int N1, N2;
            Console.WriteLine("Ingresa el primer número: ");
            N1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa el segundo número: ");
            N2 = int.Parse(Console.ReadLine());

            if (N1 > N2)
            {
                Console.WriteLine(N1 + " es mayor que " + N2);
            }
            else
            {
                Console.WriteLine(N1 + " es menor que " + N2);
            }
        }
    }
}

