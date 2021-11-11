package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [][] matriz = new int[3][3];
		int linha, coluna, num, cont = 0;
		
		for(linha = 0; linha<3; linha++)
		{
			for(coluna = 0; coluna<3; coluna++)
			{
				System.out.print("Entre com um valor na linha " + linha + " coluna " + coluna + ": ");
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna] > 10)
				{
					cont++;
				}
			}
		}
		
		System.out.print("A quantidade de números maiores que 10 da matriz são: " + cont);
	}
}
