package Exercicios05_lista.copy;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%ncódigo peça 1:%n");
		Double peca1 = sc.nextDouble();
		
		System.out.printf("%nquantidade de peça 1:%n");
		Double qpeca1 = sc.nextDouble();
		
		System.out.printf("%nvalor de peça 1:%n");
		Double vpeca1 = sc.nextDouble();
		
		System.out.printf("%ncódigo peça 2:%n");
		Double peca2 = sc.nextDouble();
		
		System.out.printf("%nquantidade de peça 2:%n");
		Double qpeca2 = sc.nextDouble();
		
		System.out.printf("%nvalor de peça 2:%n");
		Double vpeca2 = sc.nextDouble();
		
		Double total = (vpeca1 * qpeca1) + (vpeca2 * qpeca2);
		
		System.out.printf("%n%nVALOR A PAGAR: R$ %.2f", total);

		sc.close();
		
	}
	
}
