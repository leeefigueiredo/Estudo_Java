package repedicao_while_enquanto;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		while(x != 0 || y != 0 ) {
			
				if( y > 0 && x > 0 ) {
					System.out.println("Quadrante Q1");
				} else if( y > 0 && x < 0 ) {
					System.out.println("Quadrante Q2");
				} else if( y < 0 && x < 0 ) {
					System.out.println("Quadrante Q3");
				} else if( y < 0 && x > 0 ) {
					System.out.println("Quadrante Q4");
				}
				
			x = sc.nextInt();
			y = sc.nextInt();
			
			}
			
		System.out.println("fim do programa");
		sc.close();
	
	}

}
