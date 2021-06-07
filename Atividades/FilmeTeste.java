package atividades;

public class FilmeTeste {

	public static void main(String[] args) {

		Filme teste = new Filme("Titanic", 194);

		teste.exibirDuracaoEmHoras();

		Filme filme1 = new Filme();

		filme1.setTitulo("Os Vingadores");

		filme1.setDuracaoEmMinutos(142);

		System.out.println();

		filme1.exibirDuracaoEmHoras();

		Filme filme2 = new Filme();

		filme2.setTitulo("Hotel Transilvânia");

		filme2.setDuracaoEmMinutos(93);

		System.out.println();

		filme2.exibirDuracaoEmHoras();

		System.out.println();

		System.out.println("Os filmes em cartazes são: " + filme1.getTitulo() + " " + "e " + filme2.getTitulo());

		filme1.adicionaFilme(1, "Os Vingadores", 142);

		filme1.retornaFilme();

	}

}
