package br.edu.univas.si6.es4.bridge;

public class Runner {

	public static void main(String[] args) {
		Livro livroNacional = new Livro(new Nacional());
		livroNacional.setNome("O Alquimista");
		livroNacional.setAutor("Paulo Coelho");
		livroNacional.setPreco(30);
		System.out.println(livroNacional);

		Livro livroImportado = new Livro(new Importado());
		livroImportado.setNome("Design Patterns");
		livroImportado.setAutor("Erich Gamma");
		livroImportado.setPreco(30);
		System.out.println(livroImportado);

		Revista revistaNacional = new Revista(new Nacional());
		revistaNacional.setNome("Superinteressante");
		revistaNacional.addArtigo("E se não dormíssemos");
		revistaNacional.addArtigo("E se dormíssemos");
		revistaNacional.setPreco(30);
		System.out.println(revistaNacional);
	}

}
