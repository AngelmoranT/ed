using System;
using Gtk;

namespace AdivinarSiEresHoMYSiEresMayorDeEdadOMenor
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Console.WriteLine("Introduce tu genero: M para mujeres o H para hombres: ");
			char genero = Convert.ToChar(Console.ReadLine());
			Console.WriteLine("Que edad tienes?:");
			int edad = Convert.ToInt32(Console.ReadLine());


			if (genero == 'm' || genero == 'M')
			{
				if (edad >= 18)
				{
					Console.WriteLine("Eres mujer y mayor de edad");
				}
				else
				{
					Console.WriteLine("Eres mujer y menor de edad");
				}
			}
			else if (genero == 'h' || genero == 'H')
			{
				if (edad >= 18)
				{
					Console.WriteLine("Eres un Alpha mayor de edad");
				}
				else
				{
					Console.WriteLine("Eres un beta y ademas menor de edad");
				}
			}
			else
			{
				Console.WriteLine("ERROR : DATO INCORRECTO");
			}
			Console.ReadKey();
		}
	}
}
