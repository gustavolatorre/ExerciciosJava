package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Entre com a idade do competidor: ");
		idade = ler.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("Categoria INFANTIL!");
		}
		else if (idade >=15 && idade <= 17)
		{
			System.out.println("Categoria JUVENIL!");
		}
		else if (idade >= 18 && idade <= 25)
		{
			System.out.println("Categoria ADULTO!");
		}
		else
		{
			System.out.println("OPÇÃO INVÁLIDA!");
		}
	}

}
