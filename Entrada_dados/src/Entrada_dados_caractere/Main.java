package Entrada_dados_caractere;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		
		System.out.println("digite um número com ponto flutuante");
			
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		System.out.printf("voce digitou: %.2f%n", x);
		
		sc.close();
		
	}
	
}
