package projeto;

import javax.swing.JOptionPane;

public class Livro extends Funcoes {
	/*
	 * ArrayList<String> titulo = new ArrayList<>(); ArrayList<String> autor = new
	 * ArrayList<>(); ArrayList<Integer> ano = new ArrayList<>();
	 */

	private String[] titulo;
	private String[] autor;
	private int[] ano;

	public void quantidadeLivros() {
		int q = this.receberInt("digite a quantidade de livros a ser registrada");
		this.autor = new String[q];
		this.titulo = new String[q];
		this.ano = new int[q];
	}

	public void inserirLivros() {
		boolean _nome = false;
		boolean _autor = false;
		boolean _ano = false;
		for (int i = 0; i < autor.length; i++) {
			String nome = this.receberString("digite o nome do livro " + (i + 1) + " :");
			String autor = this.receberString("digite o nome do autor " + (i + 1) + " :");
			int ano = this.receberInt("digite o ano de lan�amento do livro " + (i + 1) + " :");

			this.titulo[i] = nome;
			this.autor[i] = autor;
			this.ano[i] = ano;

			_nome = true;
			_autor = true;
			_ano = true;
			if (this.ano[i] != this.ano[i]) {
				_ano = false;
			}if(_ano ==false) {
			this.tela("");	
			}
			if (this.titulo[i] != this.titulo[i]) {
				_nome = false;
			}
			if (this.autor[i] != this.autor[i]) {
				_autor = false;
			}

		}
	}

	public void mostrar() {
		String saida = "";
		for (int i = 0; i < ano.length; i++) {
			if (this.autor[i] != "") {
				saida += "Titulo- " + this.titulo[i] + ",  Autor-" + this.autor[i] + ", Lan�amento- " + this.ano[i]
						+ "\n";

			}

		}
		this.tela(saida);

	}

	public Object selecionar() {
		Object[] possibilidades = { "remover um titulo", "pesquisar um titulo" };

		Object selecionado = JOptionPane.showInputDialog(null, "escolha o que fazer a seguir:", "Op��es:",
				JOptionPane.INFORMATION_MESSAGE, null, possibilidades, possibilidades[0]);

		return selecionado.toString();
	}

	public void escolher(String a) {

		if (a.equalsIgnoreCase("remover um titulo")) {
			this.removerTitulo(this.telaRemocao());
			this.mostrar();
		}
		if (a.equalsIgnoreCase("pesquisar um titulo")) {
			this.pesquisar(this.telaPesquisa());

		}

	}

	public void pesquisar(String a) {
		boolean se = false;
		for (int i = 0; i < titulo.length; i++) {
			if (titulo[i].equalsIgnoreCase(a)) {
				this.tela("Livro pesquisado: " + this.titulo[i] + ", nome do autor: " + this.autor[i]
						+ ", ano de lan�amento: " + this.ano[i]);
				se = true;
			}
		}
		if (se == false) {
			this.tela("pesquisa n�o corresponde a nenhum livro");
		}
	}

	public void removerTitulo(String a) {
		boolean se = false;
		for (int i = 0; i < titulo.length; i++) {

			if (a.equalsIgnoreCase(this.titulo[i])) {

				this.titulo[i] = "";
				this.autor[i] = "";
				this.ano[i] = 0;
				se = true;
			}

		}
		if (se == false) {
			this.tela("nome n�o corresponde com nenhum livro registrado");
		}

	}

	public String telaRemocao() {
		String t = this.receberString("digite qual livro deseja remover:");
		return t;
	}

	public String telaPesquisa() {
		String t = this.receberString("digite o nome do livro a ser pesquisado:");
		return t;
	}
}
