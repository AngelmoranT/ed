import java.util.Scanner;

public class SumarNumerosTeclado {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int numero5 = 0;
		int numero6 = 0;
		int numero7 = 0;
		int numero8 = 0;
		int numero9 = 0;
		int numero10 = 0;
		int resultado;

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce un primer número:");			
		numero1 = reader.nextInt();
			
		System.out.println("Introduce un segundo número:");
		numero2 = reader.nextInt();
		
		System.out.println("Introduce un tercer número:");
		numero3 = reader.nextInt();
		
		System.out.println("Introduce un cuarto número:");
		numero4 = reader.nextInt();
		
		System.out.println("Introduce un quinto número:");
		numero5 = reader.nextInt();
		
		System.out.println("Introduce un sexto número:");
		numero6 = reader.nextInt();
		
		System.out.println("Introduce un septimo número:");
		numero7 = reader.nextInt();
		
		System.out.println("Introduce un octavo número:");
		numero8 = reader.nextInt();
		
		System.out.println("Introduce un noveno número:");
		numero9 = reader.nextInt();
		
		System.out.println("Introduce un decimo número:");
		numero10 = reader.nextInt();
			
		resultado = numero1+numero2+numero3+numero4+numero5+numero6+numero7+numero8+numero9+numero10;
		
		System.out.println("La suma de los diez números es " + numero1 + " + " + numero2 + " + " + numero3 +" +  " + numero4 + " + " + numero5 + " + " + numero6 + " + " + numero7 +" +  " + numero8 + " + " + numero9 + " +  " + numero10 + " = " + resultado);
		
		reader.close();
			
	}

}








