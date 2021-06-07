package atividades;

public class LivrosTeste {

	public static void main(String[] args) {
		
		Livros teste = new Livros("game of thrones", 500, 300);
		
		teste.verificarProgresso();
		
		Livros livrofavorito = new Livros();
		
		livrofavorito.setTitulo("Pequeno Principe");
		
		livrofavorito.setQtdPaginas(98);
		
		System.out.println("O livro " + livrofavorito.getTitulo() + " " +  "possui" + " "  + livrofavorito.getQtdPaginas() + " " + "páginas");
		
		livrofavorito.setPaginasLidas(20);
		
		livrofavorito.verificarProgresso();
		
		livrofavorito.setPaginasLidas(50);
		
		livrofavorito.verificarProgresso();
		
		livrofavorito.adicionaLivro(1, "Pequeno Principe", 98, 50);
		
		livrofavorito.retornaLivro();
	}

}
