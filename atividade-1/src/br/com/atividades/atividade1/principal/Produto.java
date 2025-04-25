package br.com.atividades.atividade1.principal;

public class Produto {
	private String nome;
	private double estoque;
	private double preco;

	
	public Produto(String nome, double quantidade, double preco) {
		this.nome = nome;
		this.estoque = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getEstoque() {
		return estoque;
	}
	
	public void setEstoque(double quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException("Estoque não pode ser menor que 0");
		}
		
		this.estoque = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Preco deve ser maior que 0");
		}
		this.preco = preco;
	}
	
}
