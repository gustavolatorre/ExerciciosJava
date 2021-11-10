package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i, num, contPar = 0, contImpar = 0;
		
		for (i = 1; i < 11; i++)
		{
			System.out.printf("Entre com o %d valor: ", i);
			num = ler.nextInt();
			
			if (num % 2 == 0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
		}
		
		System.out.println("Quantidade de números PARES: " + contPar + 
				"\nQuantidade de números ÍMPARES: " + contImpar);
	}

}
