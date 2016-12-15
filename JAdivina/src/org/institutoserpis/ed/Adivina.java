package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) +1;
		System.out.println("numeroAleatorio=" + numeroAleatorio);
		Scanner scanner = new Scanner (System.in);
		
		int numero;
		
		do{
			System.out.print("Introduzce el numero; ");
			String Line = scanner.nextLine();
			String line = null;
			numero = Integer.parseInt(line);
			// Damos pista a el ususario
			
			
	        //if (numero > numeroAleatorio);
		    //System.out.println("Es un numero más pequeño...");
			
			//if (numero < numeroAleatorio);
			//System.out.println("Es un numero más grande...");
			
			if (numero < numeroAleatorio)
				System.out.println("El numero escondido es mayor");
			else if (numero > numeroAleatorio)
				System.out.println("El numero escondido es menor");
			boolean acertado = numero == numeroAleatorio;
			}while (numero != numeroAleatorio);
			System.out.println("Muy bien as acertado");
	}
}
	
		
