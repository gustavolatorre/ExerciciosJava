package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, contMultiplos = 0, somaMultiplos = 0, mediaMultiplos;
		
		do
		{
			System.out.print("Entre com um valor: ");
			num = ler.nextInt();
			
			if (num % 3 == 0)
			{
				contMultiplos++;
				somaMultiplos += num;
			}
			
			
		}while(num != 0);
		
		mediaMultiplos = somaMultiplos / contMultiplos;
		
		System.out.println("A soma dos n�meros m�ltiplos de 3 � igual: " + somaMultiplos);
		System.out.println("A m�dia dos n�meros m�ltiplos por 3 � igual a: " + mediaMultiplos);

	}

}
