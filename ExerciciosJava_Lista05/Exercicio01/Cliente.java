package Exercicio01;

public class Cliente {

	private String nome;
	private String sobrenome;
	private String[] carrinho;
	
	public Cliente(String nome, String sobrenome)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Cliente(String[] carrinho)
	{
		this.carrinho[3] = carrinho[3];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCarrinho() {
		return carrinho[3];
	}

	public void setCarrinho(String carrinho) {
		this.carrinho[3] = carrinho;
	}
	
	public void imprimir()
	{
		System.out.println("\nCliente: " + nome + " " + sobrenome);
	}
}
