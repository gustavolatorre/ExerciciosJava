package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Entre com o primeiro valor: ");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo valor: ");
		num2 = ler.nextInt();
		System.out.print("Entre com o terceiro valor: ");
		num3 = ler.nextInt();
		
		if (num1 <= num2 && num2 <= num3)
		{
			System.out.println("Os números em ordem crescente ficam: " + num1 + ", " + num2 + ", " + num3);
		}
		else if (num1 <= num3 && num3 <= num2)
		{
			System.out.println("Os números em ordem crescente ficam: " + num1 + ", " + num3 + ", " + num2);
		}
		else if (num2 <= num1 && num1 <= num3)
		{
			System.out.println("Os números em ordem crescente ficam: " + num2 + ", " + num1 + ", " + num3);
		}
		else if (num2 <= num3 && num3 <= num1)
		{
			System.out.println("Os números em ordem crescente ficam: " + num2 + ", " + num3 + ", " + num1);
		}
		else if (num3 <= num1 && num1 <= num2)
		{
			System.out.println("Os números em ordem crescente ficam: " + num3 + ", " + num1 + ", " + num2);
		}
		else
		{
			System.out.println("Os números em ordem crescente ficam: " + num3 + ", " + num2 + ", " + num1);
		}
	}

}
