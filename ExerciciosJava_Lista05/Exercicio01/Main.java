package Exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		
		int i, opcao;
		String nome, sobrenome;
		String[] carrinho = new String[3];
		
		System.out.println("Bem vindo(a) Loja X!");
		
		System.out.print("Entre com seu nome: ");
		nome = ler.next();
		System.out.print("Entre com seu sobrenome: ");
		sobrenome = ler.next();
		
		System.out.println("Escolha 3 produtos!");
		
		for (i = 0; i<3; i++)
		{
		System.out.println("\nPRODUTOS:" + 
		"\n1 - Tênis Nike" + 
		"\n2 - Camisa Polo" + 
		"\n3 - Saia" + 
		"\n4 - Perfume" + 
		"\n5 - Pijamas");
		
		System.out.print("Entre com a sua opcao de compra: ");
		opcao = ler.nextInt();
		
		switch(opcao)
		{
		case 1:
			carrinho[i] = "Tênis Nike";
			System.out.println("Produto adcionado!");
			break;
		case 2:
			carrinho[i] = "Camisa Polo";
			System.out.println("Produto adcionado!");
			break;
		case 3:
			carrinho[i] = "Saia";
			System.out.println("Produto adcionado!");
			break;
		case 4:
			carrinho[i] = "Perfume";
			System.out.println("Produto adcionado!");
			break;
		case 5:
			carrinho[i] = "Pijamas";
			System.out.println("Produto adcionado!");
			break;
		default:
			System.out.println("Opcão inválida!");
			i--;
		}
		
		}
		
		System.out.println("\nObrigado pelas compras: ");
		
		Cliente cliente = new Cliente(nome, sobrenome);
		cliente.imprimir();
		
		System.out.println("Os produtos comprados foram: ");
		for (String produto: carrinho)
		{
			System.out.print(produto + " - ");
		}
		
		System.out.println("\nVOLTE SEMPRE!");
	}

}
