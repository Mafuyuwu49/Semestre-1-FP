using System;

namespace Proyecto6-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            int N;
            Console.WriteLine("Ingrese un número: ");
            N = int.Parse(Console.ReadLine());

            if (N % 2 == 0)
                Console.WriteLine("El número es par");
            else
                Console.WriteLine("El número es impar");
        }
    }
}
