package If_else;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Exercício 3 - \n\nDigite dois números em ordem crescente:");
	
	int a = sc.nextInt();
	int b = sc.nextInt();

	if (b%a == 0) {
		System.out.println("são multiplos");
		
	} else if (b%a != 0) {
		System.out.println("não são múltiplos");
	}

	
	
	sc.close();
	}
	
	
}
