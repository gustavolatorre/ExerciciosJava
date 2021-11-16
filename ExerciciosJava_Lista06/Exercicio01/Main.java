package Exercicio01;

public class Main {

	public static void main(String[] args) {
		
		
		Cachorro cachorro =  new Cachorro("Toto", 5, "Au au au!", true);
		cachorro.informacoes();
		
		System.out.println();
		
		Cavalo cavalo = new Cavalo("Jojo", 7, "Ihuuuuuii", true);
		cavalo.informacoes();
		
		System.out.println();
		
		Preguica preguica = new Preguica("Brucer", 10, "hihihi", true);
		preguica.informacoes();
		
		System.out.println();
		
		cachorro.som();
		
		System.out.println();
		
		cavalo.som();
		
		System.out.println();
		
		preguica.som();
	}

}
