package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		
		System.out.print("Entre a sua idade em anos: ");
		idadeAnos = ler.nextInt();
		System.out.print("Entre a sua idade em meses: ");
		idadeMeses = ler.nextInt();
		System.out.print("Entre a sua idade em dias: ");
		idadeDias = ler.nextInt();
		
		totalDias = (idadeAnos*365) + (idadeMeses * 30) + idadeDias;
		
		System.out.println("A sua idade em dias é: " + totalDias);
		
	}

}
