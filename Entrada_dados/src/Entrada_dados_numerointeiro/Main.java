package Entrada_dados_numerointeiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("digite algo!");
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next();
		System.out.println("voce digitou: " + x);
		
		sc.close();
		
	}
	
}
