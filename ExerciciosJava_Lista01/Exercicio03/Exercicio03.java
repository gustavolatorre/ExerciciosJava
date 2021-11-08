package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horas, minutos, segundos, segundo;
		
		System.out.print("Entre com o tempo de duração do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundo = (segundos % 3600) % 60;
		
		System.out.println("Hora: " + horas + 
				"\nMinuto: " + minutos + 
				"\nSegundo: " + segundo);
	}

}
