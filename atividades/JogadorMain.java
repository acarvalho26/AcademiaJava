package atividades;


import java.util.ArrayList;




public class JogadorMain extends Jogador {

	public static void main(String[] args) {
		
//	QUESTÃO 04
		
		ArrayList<Jogador> listaJogador = new ArrayList<Jogador>();
		
		Time novoTime = new Time("Juventus", "JV", "05/05/1999", listaJogador);
		
		Time novoTime2 = new Time("Paris Saint-German", "PSG", "05/05/1952", listaJogador);	
		
		listaJogador.add(new Jogador(1, "Cristiano", "Ronaldo", "05/02/1985", 10, "Atacante",100, 0, false));
		listaJogador.add(new Jogador(2, "Paulo", "Dybala", "15/11/1993", 10, "Atacante", 5, 85, false));
		listaJogador.add(new Jogador(3, "Federico", "Chiesa", "25/10/1997", 10, "Atacante", 71, 3, false));
		listaJogador.add(new Jogador(4, "Gianluigi", "Buffon", "28/01/1978", 10, "Goleiro", 65, 2, false));
		listaJogador.add(new Jogador(5, "Álvaro", "Morata", "23/10/1992", 10, "Atacante", 20, 0, false));
		listaJogador.add(new Jogador(6, "Matthijs", "Ligt", "12/08/1999", 10, "Zagueiro", 91, 2, false));
		listaJogador.add(new Jogador(7, "Weston", "McKennie", "28/08/1998", 10, "Meio-Campo", 42, 0, false));
		listaJogador.add(new Jogador(8, "Arthur", "Arthur", "12/08/1996", 10, "Meio-Campo", 68, 0, false));
		listaJogador.add(new Jogador(9, "Juan Guillermo", "Cuadrado", "26/05/1988", 10, "Meio-Campo", 23, 2, false));
		listaJogador.add(new Jogador(10, "Dejan", "Kulusevski", "25/04/2000", 10, "Meio-Campo", 37, 2, false));
		listaJogador.add(new Jogador(11, "Adrien", "Rabiot", "03/04/1995", 10, "Atacante", 41, 0, false));
		listaJogador.add(new Jogador(12, "AA", "Ronaldo", "05/02/1985", 10, "Atacante",100, 0, false));
		listaJogador.add(new Jogador(13, "SS", "Dybala", "15/11/1993", 10, "Lateral Esquerdo", 32, 1, false));
		listaJogador.add(new Jogador(14, "DD", "Chiesa", "25/10/1997", 10, "Lateral Direito", 71, 3, false));
		listaJogador.add(new Jogador(15, "FF", "Buffon", "28/01/1978", 10, "Goleiro", 65, 2, false));
		listaJogador.add(new Jogador(16, "GG", "Morata", "23/10/1992", 10, "Atacante", 20, 0, false));
		listaJogador.add(new Jogador(17, "HH", "Ligt", "12/08/1999", 10, "Zagueiro", 95, 2, false));
		listaJogador.add(new Jogador(18, "JJ", "McKennie", "28/08/1998", 10, "Volante", 42, 0, false));
		listaJogador.add(new Jogador(19, "KK", "Arthur", "12/08/1996", 10, "Meio-Campo", 68, 0, false));
		listaJogador.add(new Jogador(20, "LL Guillermo", "Cuadrado", "26/05/1988", 10, "Meio-Campo", 23, 2, false));
		listaJogador.add(new Jogador(21, "ÇÇ", "Kulusevski", "25/04/2000", 10, "Meio-Campo", 37, 2, false));
		listaJogador.add(new Jogador(22, "XX", "Rabiot", "03/04/1995", 10, "Atacante", 41, 0, false));
		listaJogador.add(new Jogador(23, "BB", "Rabiot", "03/04/1995", 10, "Atacante", 41, 0, false));
		
		
		
		System.out.println("JOGADORES CADASTRADOS");
		for (int i = 0; i < listaJogador.size(); i++) {
			
			Jogador aux = listaJogador.get(i);
			System.out.println(aux.getPosicao() + ": " + aux.getId() + " " + "-" + " " + aux.getNome() + " " + "(" + aux.getApelido() + ")" + " " + "-" + " " + aux.parseDate(aux.getDataNascimento()) + " " + "CONDIÇÃO: " + aux.verJogo() ); 

		}
		
	
		System.out.println(listaJogador.get(3).getQualidade());
		
		listaJogador.get(3).sofrerLesao();
		
		System.out.println(listaJogador.get(3).getQualidade());
		
		listaJogador.get(3).executarTreinamento();
		
		System.out.println(listaJogador.get(3).getQualidade());
		
		
		
//		QUESTÃO 5
		
		System.out.println();
		System.out.println("Qualidade de todos os jogadores cadastrados e seus respectivos ID's:");
		System.out.println();
		
		
		for(int i = 0; i < novoTime.getNoTime().size(); i++) {
			
			System.out.println(novoTime.getNoTime().get(i).getQualidade() + " - " + novoTime.getNoTime().get(i).getId() );
			
		}
		
		novoTime.relacionarJogadores();
		novoTime2.relacionarJogadores();
		System.out.println();
		System.out.println("Qualidade, Posição e Id dos titulares:");
		System.out.println();
		
		for(int i = 0; i < novoTime.getRelacionados().size(); i++) {
		
			System.out.println(novoTime.getRelacionados().get(i).qualidade + " - " + novoTime.getRelacionados().get(i).posicao + " - " + novoTime.getRelacionados().get(i).id);
		
		}
		
		
		// QUESTÃO 6
		
		
		
		Jogo novoJogo = new Jogo(novoTime, novoTime2, "12/10/1999", "PSG", "JV");
		System.out.println();
		
		novoJogo.gerarResultado();
		System.out.println("Resultado:");
		System.out.println();
		System.out.println(novoJogo.mandante.nome + " " + novoJogo.placarMandante + "X" + novoJogo.placarVisitante + " " + novoJogo.visitante.nome );
		System.out.println();
		
		System.out.println("Antes de chamar gerarLesões:");
		for (int i = 0; i < 11; i++) {
			System.out.println(novoTime.getRelacionados().get(i).qualidade +  " - " + novoTime.getRelacionados().get(i).id);
		}
		
		novoJogo.gerarLesoes();
		novoJogo.gerarLesoes();
		novoJogo.gerarLesoes();
		novoJogo.gerarLesoes();
		novoJogo.gerarLesoes();
		novoJogo.gerarLesoes();
		System.out.println();
		System.out.println("Depois de chamar gerarLesões");
		
		for (int i = 0; i < 11; i++) {
			System.out.println(novoTime.getRelacionados().get(i).qualidade +  " - " + novoTime.getRelacionados().get(i).id);
		}
		
		System.out.println();
		
		System.out.println("Amtes de chamar gerarCartões");
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			System.out.println(novoTime.getRelacionados().get(i).id + " - " + novoTime.getRelacionados().get(i).cartoes+ " - " + novoTime.getRelacionados().get(i).verJogo());
		}
		
		
		novoJogo.gerarCartoes();
		novoJogo.gerarCartoes();
		novoJogo.gerarCartoes();
		System.out.println();
		System.out.println("Depois de chamar gerarCartões:");
		System.out.println();
		for (int i = 0; i < 11; i++) {
			System.out.println(novoTime.getRelacionados().get(i).id + " - " + novoTime.getRelacionados().get(i).cartoes+ " - " + novoTime.getRelacionados().get(i).verJogo());
		}
	}
	
}
	
	
		
	
		
	
	
	


	
		
		
		
		

	
		
		
	
		




