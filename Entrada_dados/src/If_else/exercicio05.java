package If_else;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Exercício 5 - \n");
	System.out.println("\n*Tabela de produtos*");
	System.out.println("\nCódigo - Especificação - Preço");
	System.out.println("1 - Cachorro Quente - R$4,00");
	System.out.println("2 - X-Salada - R$4,50");
	System.out.println("3 - X-Bacon - R$5,00");
	System.out.println("4 - Torrada Simples - R$5,00");
	System.out.println("5 - Refrigerante - R$2,00");
	System.out.println("\nDigite o código do produtos e quantidade desejada:");
	
	
	double preco1 = sc.nextDouble();
	double quant = sc.nextDouble();
	
	
	if(preco1 == 1) {
		preco1 = 4.00;
	}else if(preco1 == 2) {
		preco1 = 4.50;
	}else if(preco1 == 3) {
		preco1 = 5.00;
	}else if(preco1 == 4) {
		preco1 = 2.00;
	}else if(preco1 == 5) {
		preco1 = 1.50;
	}else if(preco1 > 5) {
		preco1 = 0;
	}
	
	
	double precoTotal = preco1 * quant;
	
	System.out.printf("Valor total: R$ %.2f", precoTotal);
	

	
	sc.close();
	}
	
	
}
