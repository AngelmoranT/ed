using System;

namespace Org.InstitutoSerpis.Ed 
{
	class HolaMundo
	{
		public static void Main (string[] args)
		{
			Console.WriteLine ("Introduce tu nombre");
			string nombre = Console.ReadLine ();
			Console.WriteLine ("Hola" + nombre);
		}
	}
}
