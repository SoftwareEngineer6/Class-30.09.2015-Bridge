package br.edu.univas.si6.es4.bridge;

import java.util.ArrayList;
import java.util.List;

public class Revista extends Publicacao {

	private List<String> artigos = new ArrayList<>();

	public Revista(Tributacao tributacao) {
		super(tributacao);
	}

	public void addArtigo(String artigo) {
		artigos.add(artigo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append("\n");
		sb.append("Tipo: Revista\n");
		sb.append("Artigos: ").append(artigos);
		return sb.toString();
	}

}
