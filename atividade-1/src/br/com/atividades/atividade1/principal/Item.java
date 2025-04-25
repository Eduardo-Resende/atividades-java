package br.com.atividades.atividade1.principal;

public class Item extends Produto implements Desconto{
	private int porcentagemDesconto;

	public Item(String nome, double quantidade, double preco) {
		super(nome, quantidade, preco);
		this.porcentagemDesconto = 0;
	}
	
	public double getPrecoComDesconto() {
		return this.getPreco() - (this.getPreco() * porcentagemDesconto / 100);
	}
	
	public void tirarDesconto() {
		this.porcentagemDesconto = 0;
	}
	
	public int getDesconto() {
		return this.porcentagemDesconto;
	}

	public void setDesconto(int porcentagem) {
		this.porcentagemDesconto = porcentagem;
	}

	@Override
	public double aplicarDesconto(int porcentagem) {
		return 0;
	}

}
