package Classes;

public class Produto {
	private String CodProd;
	private String nome;
	private double valor;
	private int estoque;

	public Produto(String codProd, String nome, double valor, int estoque) {
		super();
		CodProd = codProd;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;

	}

	public String getCodProd() {
		return CodProd;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	
}
