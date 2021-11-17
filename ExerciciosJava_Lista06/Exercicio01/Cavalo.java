package Exercicio01;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
		
	}
	
	

	public void informacoes()
	{
		System.out.println("Nome: " + getNome() + 
							"\nIdade: " + getIdade());
	}
	
	@Override
	public void som()
	{
		System.out.println("Ihiunnn!");
	}
	
	@Override
	public void corre(Boolean corre) 
	{
		if (corre == true) 
		{
			System.out.println("Este animal corre!");
		}
		else
		{
			System.out.println("Este animal sobe em árvores!");
		}
	}
}
