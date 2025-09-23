package If_else;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite um número");
	
	int x = sc.nextInt();
	
	if(x >= 0) {
		System.out.println("positivo");
		
	}else {
		if (x <= 0) {
			System.out.println("negativo");
		}
	}
	
	
	
	sc.close();
	}
	
	
}
