package Exercicios02_lista;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double raio = sc.nextDouble();
	
		Double area = Math.pow(raio, 2) * 3.14159;
		
		System.out.printf("Area = %.4f%n", area );

		sc.close();
		
	}
	
}
