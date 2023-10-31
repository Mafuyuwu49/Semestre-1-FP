using System;

namespace Proyecto12-3u
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Escribe el número total a procesar: ");
            int total = int.Parse(Console.ReadLine());

            for (int c = 1; c <= total; c++)
            {
                Console.Write("Escribe un número: ");
                int num = int.Parse(Console.ReadLine();

                if (num % 2 == 0)
                    Console.WriteLine("PAR");
                else
                    Console.WriteLine("IMPAR");
            }
        }
    }
}

