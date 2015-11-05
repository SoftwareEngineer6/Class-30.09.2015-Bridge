package br.edu.univas.si6.es4.bridge;

public class Publicacao {

	private String nome;
	private float preco;

	private Tributacao tributacao;

	public Publicacao(Tributacao tributacao) {
		this.tributacao = tributacao;
	}

	public float precoTotal() {
		return preco + tributacao.calcularImposto(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dados da publicação:\n");
		sb.append("Nome: ").append(nome).append("\n");
		sb.append("Preço total: ").append(precoTotal());
		return sb.toString();
	}

}
