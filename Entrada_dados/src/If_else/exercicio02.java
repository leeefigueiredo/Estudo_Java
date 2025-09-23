package If_else;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Exercício 2 - \n\nDigite um número:");
	int x = sc.nextInt();
	
	if (x % 2 == 0) {
		System.out.println("PAR");
	} else if(x % 2 != 0) {
		System.out.println("IMPAR");
	}
	
	
	
	
	sc.close();
	}
	
	
}
