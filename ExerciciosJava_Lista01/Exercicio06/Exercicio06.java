package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x1, x2, y1, y2; 
		double x, y, d;
		
		System.out.print("Entre com o ponto X1: ");
		x1 = ler.nextInt();
		System.out.print("Entre com o ponto X2: ");
		x2 = ler.nextInt();
		System.out.print("Entre com o ponto Y1: ");
		y1 = ler.nextInt();
		System.out.print("Entre com o ponto Y1: ");
		y2 = ler.nextInt();
		
		x = Math.pow((x2 - x1), 2);
		y = Math.pow((y2 - y1), 2);
		d = Math.pow((x + y), 2);
		
		System.out.println("O valor da distância entre os dois pontos é de: " + d);
	}
}
