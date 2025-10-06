package If_else;

import java.util.Scanner;
import java.util.Locale;

public class exercicio07 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	
	System.out.printf("valor de X %.2f%n", x);
	System.out.printf("valor de Y %.2f%n", y);
	
	if(y == 0 && x == 0) {
		System.out.println("ORIGEM");
	} else if( y == 0 && x != 0 ) {
		System.out.println("ESTÁ SOBRE EIXO Y");
	} else if( y != 0 && x == 0 ) {
		System.out.println("ESTÁ SOBRE EIXO X");
	} else if( y != 0 && x == 0 ) {
		System.out.println("ESTÁ SOBRE EIXO X");
	} else if( y > 0 && x > 0 ) {
		System.out.println("Quadrante Q1");
	} else if( y > 0 && x < 0 ) {
		System.out.println("Quadrante Q2");
	} else if( y < 0 && x < 0 ) {
		System.out.println("Quadrante Q3");
	} else if( y < 0 && x > 0 ) {
		System.out.println("Quadrante Q4");
	}

	sc.close();
	}
	
	
}
