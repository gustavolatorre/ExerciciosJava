package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int num;
		
		System.out.print("Entre com um valor: ");
		num = ler.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("O n�mero " + num + " � PAR!");
			System.out.printf("A raiz quadrada de " + num + " �: %.2f", Math.sqrt(num));
		}
		else
		{
			System.out.println("O n�mero " + num + " � �MPAR!");
			System.out.printf("O n�mero " + num + " elevado ao quadrado �: %.0f", Math.pow(num, 2));
		}
	}
}
