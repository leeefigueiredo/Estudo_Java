package If_else;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double a = sc.nextDouble();
	
	if(a < 0 ) {
		System.out.println("fora do intervalo");
	}else if (a >= 0 && a <= 25.00) {
		System.out.println("Intervalo (0,25)");	
	}else if (a >= 25.01 && a <= 50) {
		System.out.println("Intervalo (25,50)");
	}else if (a >= 50.01 && a <= 75) {
		System.out.println("Intervalo (50,75)");
	}else if (a >= 75.01 && a <= 100) {
		System.out.println("Intervalo (75,100)");
	}else if (a >= 100.01 ) {
		System.out.println("FORA DO INTERVALO");
	}
	
	sc.close();
	}
	
	
}
