package Exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int op;
		
		Aviao aviao1 = new Aviao("Boeing", "777-200ER", 2021, 306000000);
		Aviao aviao2 = new Aviao("Airbus", "787-10", 2021, 338000000);
		Aviao aviao3 = new Aviao("Airbus", "A350-1000", 2021, 366000000);
		Aviao aviao4 = new Aviao("Embraer", "Legacy 600", 2021, 300000000);
		
		while (true)
		{
			System.out.println("LISTA DE AVIÕES");
			System.out.println("Deseja ver qual avião?" + 
			"\n1 - Boeing" + 
			"\n2 - Airbus" + 
			"\n3 - Airbus" + 
			"\n4 - Embraer" + 
			"\n5 - SAIR!");
			
			System.out.println("\nEntre com a sua opção: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				aviao1.imprimir();
				break;
			case 2:
				aviao2.imprimir();
				break;
			case 3:
				aviao3.imprimir();
				break;
			case 4:
				aviao4.imprimir();
				break;
			case 5:
				System.out.println("SAINDO DA LISTA! VOLTE SEMPRE!");
				break;
			default:
				System.out.println("\nOpção inválida!");
			}
			
			if(op == 5) 
			{
				break;
			}
		
		}
	}

}
