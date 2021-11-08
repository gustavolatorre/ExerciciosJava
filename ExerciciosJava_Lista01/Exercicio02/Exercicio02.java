package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeDias, idadeAnos, idadeMeses, idadeDia;
		
		System.out.print("Entre com a sua idade em dias: ");
		idadeDias = ler.nextInt();
		
		idadeAnos = idadeDias / 365;
		idadeMeses = (idadeDias % 365) / 30;
		idadeDia = (idadeDias % 365) % 30;
		
		System.out.println("Ano: " + idadeAnos + "\nMes: " + idadeMeses + "\nDias: " + idadeDia);

	}

}
