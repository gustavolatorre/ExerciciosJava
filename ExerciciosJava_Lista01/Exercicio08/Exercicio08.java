package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoConsumidor, custoFabrica, valorDistribuidor, valorImposto;
		
		System.out.print("Entre com o custo da f�brica: R$");
		custoFabrica = ler.nextDouble();
		
		valorDistribuidor = custoFabrica * 0.28;
		valorImposto = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + valorDistribuidor + valorImposto;
		
		System.out.println("O custo da f�brica � de: R$" + custoFabrica + 
				"\nO valor do distribuidor �: R$" + valorDistribuidor + 
				"\nO valor do imposto � de : R$" + valorImposto + 
				"\nO custo total para o consumidor �: R$" + custoConsumidor);
	}

}
