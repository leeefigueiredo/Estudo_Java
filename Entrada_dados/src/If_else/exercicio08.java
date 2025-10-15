package If_else;

import java.util.Scanner;
import java.util.Locale;

public class exercicio08 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	System.out.println("digite a sua renda");
	Scanner sc = new Scanner(System.in);
	
	double renda = sc.nextDouble();
	double renda2 = 0;

	
	if(renda >= 0 && renda <= 2000) {
		System.out.printf("Sua Renda é isenta, parabéns hahaha");
	} else if(renda >= 2000.01 && renda <= 3000){
		renda2 = (renda - 2000) * 0.08;
		System.out.printf("Total a ser pago de imposto: %.2f", renda2);
		
	} else if(renda >= 3000.01 && renda <= 4500){
		renda2 = ((renda - 3000) * 0.18) + 80.00;
		System.out.printf("Total a ser pago de imposto: %.2f", renda2);
		
	} else if(renda > 4500 ){
		renda2 = ((renda - 4500) * 0.28) + 350;
		System.out.printf("Total a ser pago de imposto: %.2f", renda2);
	}
	
	
	
	sc.close();
	}
	
	
}
