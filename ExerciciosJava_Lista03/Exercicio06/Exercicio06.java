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
		
		System.out.println("A soma dos números múltiplos de 3 é igual: " + somaMultiplos);
		System.out.println("A média dos números múltiplos por 3 é igual a: " + mediaMultiplos);

	}

}
