package br.edu.univas.si6.es4.bridge;

public class Nacional implements Tributacao {

	@Override
	public float calcularImposto(float preco) {
		return preco * .2f;
	}

}
