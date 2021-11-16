package Exercicio01;

public class Preguica extends Animal {

	private Boolean sobeArvore;

	public Preguica(String nome, int idade, String som, Boolean sobeArvore)
	{
		super(nome, idade, som);
		
		this.sobeArvore = sobeArvore;
	}
	
	

	public void informacoes()
	{
		System.out.println("Nome: " + getNome() + 
							"\nIdade: " + getIdade() + 
							"\nSom: " + getSom() +
							"\nEste animal sobre árvore: " + getSobeArvore());
	}



	public Boolean getSobeArvore() {
		return sobeArvore;
	}


	public void setSobeArvore(Boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	
}
