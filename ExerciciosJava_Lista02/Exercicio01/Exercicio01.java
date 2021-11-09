package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Entre com o primeiro valor: ");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo valor: ");
		num2 = ler.nextInt();
		System.out.print("Entre com o terceiro valor: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println("O maior número é o: " + num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("O maior núero é o: " + num2);
		}
		else 
		{
			System.out.println("O maior número é o: " + num3);
		}	
	}

}
