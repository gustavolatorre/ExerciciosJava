package Exercicio02;

import java.text.NumberFormat;

public class Aviao {
	
	private String fabricante;
	private String modelo;
	private int anoFabricacao;
	private double preco;
	
	public Aviao(String fabricante, String modelo, int anoFabricacao, double preco)
	{
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println("\nFabricante: " + fabricante +
				"\nModelo: " + modelo +
				"\nAno de Fabcricação: " + anoFabricacao + 
				"\nPreço: " + this.formatarMoeda());
	}


}
