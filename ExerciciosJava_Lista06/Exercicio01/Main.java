package Exercicio01;

public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Toto", 5);
		cachorro.informacoes();
		cachorro.corre(true);
		cachorro.som();
		
		System.out.println();
		
		Cavalo cavalo = new Cavalo("Spirit", 7);
		cavalo.informacoes();
		cavalo.corre(true);
		cavalo.som();
		
		System.out.println();
		
		Preguica preguica = new Preguica("Brucer", 15);
		preguica.informacoes();
		preguica.corre(false);
		preguica.som();
		
	}

}
