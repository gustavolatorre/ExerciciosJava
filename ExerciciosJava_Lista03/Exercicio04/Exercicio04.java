package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 1, idade, sexo, opcao, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
	 	
		while (i < 151)
		{
			System.out.println("Entre com a idade: ");
			idade = ler.nextInt();
			System.out.println("Entre com o sexo: [1-feminino / 2-masculino / 3-Outros] ");
			sexo = ler.nextInt();
			System.out.println("Entre com as opcções: [1 - calmo / 2 - nervoso / 3 - agressivo] ");
			opcao = ler.nextInt();
			
			if(opcao == 1)
			{
				cont1++;
			}
			if(sexo == 1 && opcao == 2)
			{
				cont2++;
			}
			if(sexo == 2 && opcao == 2)
			{
				cont3++;
			}
			if(sexo == 3 && opcao == 1)
			{
				cont4++;
			}
			if(idade > 40 && opcao == 2)
			{
				cont5++;
			}
			if(idade < 18 && opcao == 1)
			{
				cont6++;
			}
			
			i++;
		}
		
		System.out.println("- o número de pessoas calmas: " + cont1
				+ "\n- o número de mulheres nervosas: " + cont2
				+ "\n- o número de homens agressivos: " + cont3
				+ "\n- o número de outros calmos: " + cont4
				+ "\n- o número de pessoas nervosas com mais de 40 anos: " + cont5
				+ "\n- o número de pessoas calmas com menos de 18 anos: " + cont6);
	}
}
