﻿using System;

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
            Console.WriteLine("La suma es igual a :" + l);
            o = a - b;
            Console.WriteLine("La resta es igual a :" + o);
            v = a * b;
            Console.WriteLine("La multiplicación es igual a :" + v);
            e = a / b;
            Console.WriteLine("La división es igual a :" + e);
        }
    }
}