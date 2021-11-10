package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		
		int idade, tot1 = 0, tot2 = 0;
		
		while (true)
		{
			System.out.print("Entre com a idade: (Digite -99 para sair) ");
			idade = ler.nextInt();
			
			if (idade < 21 && idade > 0)
			{
				tot1++;
			}
			else if(idade > 50)
			{
				tot2++;
			}
			
			if (idade == -99)
			{
				break;
			}
		}
		
		System.out.println("A quantidade de pessoas com idade inferior a 21 anos é de: " + tot1 + 
				"\nA quantidade de pessoas com idade superior a 50 anos é de: " + tot2);
	}
}
