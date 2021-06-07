package atividades;

public class TesteJogadorDB {

	public static void main(String[] args) {

		Jogador jogadorteste = new Jogador();

		jogadorteste.adicionaJogador(1, "andré", "carvalho", "26/05/1999", 5, "atacante", 10);

		jogadorteste.retornaJogador();

	}

}
