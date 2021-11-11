package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		
		int linha, coluna, num, constante, opcao;
		
		System.out.println("Entre com os valores das matrizes:");
		for(linha = 0; linha<2; linha++)
		{
			for(coluna = 0; coluna<2; coluna++)
			{
				System.out.print("Matriz 1: Entre com o valor na linha " + linha + " coluna " + coluna + ": ");
				m1[linha][coluna] = ler.nextFloat();
				System.out.print("Matriz 2: Entre com o valor na linha " + linha + " coluna " + coluna + ": ");
				m2[linha][coluna] = ler.nextFloat();
			}
		}
		
		while(true) 
		{
		System.out.println("\nMENU" +
		"\n1 - Somar as duas matrizes" + 
		"\n2 - Subtrair a primeira matriz pela segunda" + 
		"\n3 - Adicionar uma constante as duas matrizes" + 
		"\n4 - Imprimir as matrizes!" + 
		"\n5 - SAIR");
		
		System.out.print("Entre com a sua opção: ");
		opcao = ler.nextInt();
		
		if (opcao == 1)
		{
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					m3[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
				}
			}
			
			System.out.println("SOMA DAS MATRIZES:");
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					System.out.print("[" + m3[linha][coluna] + "]");
				}
				System.out.println();
			}
		}
		
		if(opcao == 2)
		{
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					m3[linha][coluna] = m1[linha][coluna] - m2[linha][coluna];
				}
			}
			
			System.out.println("DIFERENÇA DAS MATRIZES:");
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					System.out.print("[" + m3[linha][coluna] + "]");
				}
				System.out.println();
			}
		}
		
		if(opcao == 3)
		{
			System.out.print("Entre com um valor a ser somado as matrizes: ");
			constante = ler.nextInt();
			
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					m1[linha][coluna] += constante;
				}
			}
			
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					m2[linha][coluna] += constante;
				}
			}
			
			
		}
		
		if (opcao == 4)
		{
			System.out.println("MATRIZ 1:");
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					System.out.print("[" + m1[linha][coluna] + "]");
				}
				System.out.println();
			}
			
			System.out.println();
			
			System.out.println("MATRIZ 2:");
			for(linha = 0; linha<2; linha++)
			{
				for(coluna = 0; coluna<2; coluna++)
				{
					System.out.print("[" + m2[linha][coluna] + "]");
				}
				System.out.println();
			}
		}
		
		if(opcao == 5)
		{
			System.out.println("\nSaindo do programa!" + 
		"\nVolte Sempre!!!!");
			break;
		}
		
		if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
		{
			System.out.println("\nOpcão INVÁLIDA!");
			System.out.println("Você será redirecionado para o MENU.\n");
		}
		
		}
	}
}
