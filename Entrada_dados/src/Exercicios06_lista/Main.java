package Exercicios06_lista;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		
		double areatriangulo = (A * C)/2;
		double areacirculo = 3.14159 * (Math.pow(C, 2));
		double areatrapezio = ((A + B)*C)/2;
		double areaquadrado = B*B;
		double arearetangulo = (A * B);
		
		System.out.printf("%n%n123TRIANGULO R$ %.3f", areatriangulo);
		System.out.printf("%n%ntesteCIRCULO R$ %.3f", areacirculo);
		System.out.printf("%n%nTRAPEZIO %.3f", areatrapezio);
		System.out.printf("%n%nTRAPEZIO %.3f", areaquadrado);
		System.out.printf("%n%nTRAPEZIO %.3f", arearetangulo);
		
		sc.close();
		
	}
	
}
