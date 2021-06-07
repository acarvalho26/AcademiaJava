package atividades;

public class TesteDB {

	public static void main(String[] args) {

		FuncionarioUML novofuncionario = new FuncionarioUML();

		novofuncionario.adicionaFunc(251, "teste", 551.50, 985, "25/05/1025");

		novofuncionario.retornaFunc();

	}

}
