package atividades;

import java.util.ArrayList;

public class Time {
	
	String nome;
	String apelido;
	String fundacao;
	ArrayList<Jogador> noTime;
	ArrayList<Jogador> relacionados;
	
	
	
	public Time() {
		
	}
	
	public Time(String nome, String apelido, String fundacao, ArrayList<Jogador> noTime) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.fundacao = fundacao;
		this.noTime = noTime;
		this.relacionados = new ArrayList<Jogador>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getFundacao() {
		return fundacao;
	}

	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}

	public ArrayList<Jogador> getNoTime() {
		return noTime;
	}

	public void setNoTime(ArrayList<Jogador> noTime) {
		this.noTime = noTime;
	}

	public ArrayList<Jogador> getRelacionados() {
		return relacionados;
	}
	
	

	public void setRelacionados(ArrayList<Jogador> relacionados) {
		this.relacionados = relacionados;
	}
	
	public ArrayList<Jogador> relacionarJogadores(){
		
		Jogador aux;
		
		for(int i = 0; i < noTime.size(); i++) {
			for (int k = 0; k < noTime.size()-1; k++) {
				if (noTime.get(k).getQualidade() < noTime.get(k+1).getQualidade()) {
					aux = noTime.get(k+1);
					noTime.set(noTime.indexOf(noTime.get(k-1)), noTime.get(k));
					noTime.set(noTime.indexOf(noTime.get(k)), aux);
				}
			}
		}
		
		int atacante = 4;
		int meio = 2;
		int volante = 3;
		int latE = 2;
		int latD = 2;
		int zagueiro = 3;
		int goleiro = 2;
		
		for (int i = 0; i < noTime.size(); i++) {
			if (noTime.get(i).posicao == "Atacante" & atacante > 1) {
				this.relacionados.add(noTime.get(i));
				atacante = atacante -1;
			}
			else if (noTime.get(i).posicao == "Meio-Campo" & meio >1) {	
				this.relacionados.add(noTime.get(i));
				meio = meio-1;
			}
			else if (noTime.get(i).posicao == "Volante" & volante >1) {
				this.relacionados.add(noTime.get(i));
				volante = volante-1;
			}
			else if (noTime.get(i).posicao == "Lateral Esquerdo" & latE >1) {
				this.relacionados.add(noTime.get(i));
				latE = latE -1;
			}
			else if (noTime.get(i).posicao == "Lateral Direito" & latD > 1) {
				this.relacionados.add(noTime.get(i));
				latD = latD -1;
			}
			else if (noTime.get(i).posicao == "Zagueiro" & zagueiro > 1) {
				this.relacionados.add(noTime.get(i));
				zagueiro = zagueiro -1;
			}
			else if (noTime.get(i).posicao == "Goleiro" & goleiro >1) {
				this.relacionados.add(noTime.get(i));
				goleiro = goleiro -1;
			}
		}
		
		for (int i = 0; i < noTime.size(); i++) {
			if (!(relacionados.contains(noTime.get(i)))) {
				if (noTime.get(i).posicao == "Atacante" & atacante > 0) {
					this.relacionados.add(noTime.get(i));
					atacante = atacante -1;
				}
				else if (noTime.get(i).posicao == "Meio-Campo" & meio >0) {
					this.relacionados.add(noTime.get(i));
					meio = meio-1;
				}
				else if (noTime.get(i).posicao == "Volante" & volante >0) {
					this.relacionados.add(noTime.get(i));
					volante = volante-1;
				}
				else if (noTime.get(i).posicao == "Lateral Esquerdo" & latE >0) {
					this.relacionados.add(noTime.get(i));
					latE = latE -1;
				}
				else if (noTime.get(i).posicao == "Lateral Direito" & latD > 0) {
					this.relacionados.add(noTime.get(i));
					latD = latD -1;
				}
				else if (noTime.get(i).posicao == "Zagueiro" & zagueiro > 0) {
					this.relacionados.add(noTime.get(i));
					zagueiro = zagueiro -1;
				}
				else if (noTime.get(i).posicao == "Goleiro" & goleiro >0) {
					this.relacionados.add(noTime.get(i));
					goleiro = goleiro -1;
				}
			}
			
		}
		return relacionados;
		
	}
	
}
