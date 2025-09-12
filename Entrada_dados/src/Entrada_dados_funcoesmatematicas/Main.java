package Entrada_dados_funcoesmatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		
		System.out.println("digite um caractere");
			
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		x = sc.next().charAt(0);
		System.out.printf("voce digitou:" + x);
		
		sc.close();
		
	}
	
}
