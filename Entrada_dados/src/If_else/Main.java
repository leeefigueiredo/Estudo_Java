package If_else;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantas Horas?");
	int hora = sc.nextInt();
	
	
	if (hora < 12) {
		System.out.println("Bom dia");
	} 
	else { 
		if (hora <= 12) {
			System.out.println("Boa tarde");
		}
		else if (hora >= 18) {
			System.out.println("Boa noite");
		}
	
	}
	
	sc.close();
	}
	
	
}
