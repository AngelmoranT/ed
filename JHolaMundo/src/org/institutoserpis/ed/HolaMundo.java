package org.institutoserpis.ed;

import java.util.Scanner;

public class HolaMundo {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Dime tu edad: ");
		String edad = scanner.nextLine(); 	
		int edadSiguiente = Integer.parseInt(edad) + 1 ;
		System.out.println("Hola " + nombre + " el año que viene tendrás " + edadSiguiente + " años.");
		System.out.println("Hola mundo desde eclipse.");
	}

}
