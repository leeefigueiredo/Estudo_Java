package repedicao_while_enquanto;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	
		System.out.println("Qual o combustível deseja? (1 - alcool) (2 - gasolina) (3 - diesel)");
		int tipoCombustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(tipoCombustivel != 4 ) {
			
			if(tipoCombustivel == 1) {
				alcool += 1;
				System.out.println("Alcool");
			}else if(tipoCombustivel == 2) {
				gasolina += 1;
				System.out.println("Gasolina");
			}else if(tipoCombustivel == 3) {
				diesel += 1;
				System.out.println("Diesel");
			}else if(tipoCombustivel > 4) {
				System.out.println("digite um código válido");
			}
			
			
			System.out.println(" ");
			System.out.println("total Alcool: " + alcool);
			System.out.println("total Gasolina: " + gasolina);
			System.out.println("total Diesel: " + diesel);
			
			System.out.println(" ");
			System.out.println("Qual o combustível deseja? (1 - alcool) (2 - gasolina) (3 - diesel)");
			tipoCombustivel = sc.nextInt();
			
		}
			
		System.out.println("Muito Obrigado");
		System.out.println(" ");
		System.out.println("total Alcool: " + alcool);
		System.out.println("total Gasolina: " + gasolina);
		System.out.println("total Diesel: " + diesel);
		
		sc.close();
	
	}

}
