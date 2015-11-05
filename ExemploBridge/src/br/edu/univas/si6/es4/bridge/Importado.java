package br.edu.univas.si6.es4.bridge;

public class Importado implements Tributacao {

	@Override
	public float calcularImposto(float preco) {
		return preco * .5f;
	}

}
