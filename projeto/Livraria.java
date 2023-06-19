package projeto;

public class Livraria {

	public static void main(String[] args) {
		Livro teste = new Livro();
		// saber a quantidade
		teste.quantidadeLivros();
		// colocar os livros
		teste.inserirLivros();
		// mostrar
		teste.mostrar();
		// selecionar //escolher
		teste.escolher((String) teste.selecionar());
	
		;

	}

}
