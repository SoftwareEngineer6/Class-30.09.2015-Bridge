package br.edu.univas.si6.es4.bridge;

public class Livro extends Publicacao {

	private String autor;

	public Livro(Tributacao tributacao) {
		super(tributacao);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append("\n");
		sb.append("Tipo: Livro\n");
		sb.append("Autor: ").append(autor);
		return sb.toString();
	}
	
}
