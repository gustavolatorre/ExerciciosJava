package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma = 0;
		
		do
		{
			System.out.print("Entre com um valor: ");
			num = ler.nextInt();
			
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos números é igual a: " + soma);
	}
}
