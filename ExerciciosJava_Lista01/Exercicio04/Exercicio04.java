package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.print("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.print("Entre com o valor de B: ");
		b = ler.nextInt();
		System.out.print("Entre com o valor de C: ");
		c = ler.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		System.out.println("R = (A+B)² = " + r +
				"\nS = (B+C)² = " + s + 
				"\nD = R+S/2 = " + d);
	}
}
