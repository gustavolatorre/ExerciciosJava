package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Entre com a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		
		System.out.println("A nota desse aluno é: " + media);
	}

}
