package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] num = new int[6];
		int i, somaPar = 0, somaImpar = 0;
		
		for (i = 0; i<6; i++)
		{
			System.out.print("Entre com o " + (i + 1) + " valor: ");
			num[i] = ler.nextInt();
		}
		
		System.out.print("Os n�meros pares digitados foram: ");
		for(int n: num) 
		{
			if (n % 2 == 0)
			{
				System.out.print(n + " ");
				somaPar += n;
			}
		}
		
		System.out.print("\nOs n�meros �mpares digitados foram: ");
		for(int n: num)
		{
			if (n % 2 != 0)
			{
				System.out.print(n + " ");
				somaImpar += n;
			}
		}
		
		System.out.println("\nA soma dos n�meros pares �: " + somaPar);
		System.out.println("A soma dos n�meros �mpares �: " + somaImpar);
	}
}
