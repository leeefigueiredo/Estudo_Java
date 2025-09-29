package If_else;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Exercício 3 - \n\nDigite a hora que começou e a hora terminou");
	
	int horaInicial = sc.nextInt();
	int horaFinal = sc.nextInt();

	int duracao;
	if(horaInicial < horaFinal) {
		duracao = horaFinal - horaInicial;
	}
	else {
		duracao = 24 - horaInicial + horaFinal;
	}
	
	System.out.println("o jogo durou " + duracao + "horas" );
	
	sc.close();
	}
	
	
}
