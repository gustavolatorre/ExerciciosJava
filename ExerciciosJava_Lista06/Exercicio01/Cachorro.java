package Exercicio01;

public class Cachorro extends Animal {
	
	private Boolean correr;

	public Cachorro(String nome, int idade, String som, Boolean correr)
	{
		super(nome, idade, som);
		
		this.correr = correr;
	}
	
	

	public void informacoes()
	{
		System.out.println("Nome: " + getNome() + 
							"\nIdade: " + getIdade() + 
							"\nSom: " + getSom() +
							"\nEste animal corre: " + getCorrer());
	}
	
	public Boolean getCorrer() {
		return correr;
	}

	public void setCorrer(Boolean correr) {
		this.correr = correr;
	}

}
