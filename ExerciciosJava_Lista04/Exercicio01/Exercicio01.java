package Exercicio01;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int soma;
		
		int[] A = new int[] {1, 0, 5, -2, -5, 7};
		
		soma = A[0] + A[1] + A[5];
		System.out.println("Soma: " + soma);
		
		A[4] = 100;
		
		System.out.println("\nOs números do vetor são: ");
		for (int num:A)
		{
			System.out.println(num);
		}
	}
}
