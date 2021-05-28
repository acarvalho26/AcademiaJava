package atividades;

public class Jogo {
	
	Time mandante;
	Time visitante;
	String dataDoJogo;
	String estadio;
	String cidade;
	int placarMandante;
	int placarVisitante;
	
	public Jogo() {
		
	}

	public Jogo(Time mandante, Time visitante, String dataDoJogo, String estadio, String cidade) {
		super();
		this.mandante = mandante;
		this.visitante = visitante;
		this.dataDoJogo = dataDoJogo;
		this.estadio = estadio;
		this.cidade = cidade;
	
	}
	
	
	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public String getDataDoJogo() {
		return dataDoJogo;
	}

	public void setDataDoJogo(String dataDoJogo) {
		this.dataDoJogo = dataDoJogo;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getPlacarMandante() {
		return placarMandante;
	}

	public void setPlacarMandante(int placarMandante) {
		this.placarMandante = placarMandante;
	}

	public int getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(int placarVisitante) {
		this.placarVisitante = placarVisitante;
	}

	public void gerarResultado(){
		
		double resultado = Math.random();
		double placar = Math.random();
		int somaCasa = 0;
		int somaVisit = 0;
		for (int i = 0; i < 11; i++) {
			somaCasa = somaCasa + mandante.relacionados.get(i).qualidade;
			somaVisit = somaVisit + visitante.relacionados.get(i).qualidade;
		}
		if (somaCasa >= somaVisit) {
			int aux_dif = somaCasa - somaVisit;
			if (aux_dif >= 220) {
				if (resultado <= 1.0 & resultado >= 0.3) {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(4);
						setPlacarVisitante(0);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(4);
						setPlacarVisitante(1);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(2);
						setPlacarVisitante(0);
					}
					else {
						setPlacarMandante(1);
						setPlacarVisitante(0);
					}
				}
				else if (resultado < 0.3 & resultado >= 0.1) {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(2);
						setPlacarVisitante(2);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(3);
						setPlacarVisitante(3);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(1);
						setPlacarVisitante(1);
					}
					else {
						setPlacarMandante(0);
						setPlacarVisitante(0);
					}
				}
				else {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(0);
						setPlacarVisitante(2);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(1);
						setPlacarVisitante(2);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(0);
						setPlacarVisitante(1);
					}
					else {
						setPlacarMandante(1);
						setPlacarVisitante(3);
					}
				}
			}
			else if (aux_dif < 220 & aux_dif >= 110) {
				if (resultado <= 1.0 & resultado >= 0.45) {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(3);
						setPlacarVisitante(0);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(0);
						setPlacarVisitante(1);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(2);
						setPlacarVisitante(1);
					}
					else {
						setPlacarMandante(1);
						setPlacarVisitante(0);
					}
				}
				else if (resultado < 0.45 & resultado >= 0.2) {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(2);
						setPlacarVisitante(2);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(3);
						setPlacarVisitante(3);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(1);
						setPlacarVisitante(1);
					}
					else {
						setPlacarMandante(0);
						setPlacarVisitante(0);
					}
				}
				else {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(1);
						setPlacarVisitante(2);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(1);
						setPlacarVisitante(3);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(1);
						setPlacarVisitante(2);
					}
					else {
						setPlacarMandante(0);
						setPlacarVisitante(1);
					}
				}
			}
			else {
				if (resultado <= 1.0 & resultado >= 0.6) {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(2);
						setPlacarVisitante(0);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(3);
						setPlacarVisitante(2);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(1);
						setPlacarVisitante(0);
					}
					else {
						setPlacarMandante(2);
						setPlacarVisitante(1);
					}
				}
				else if (resultado < 0.6 & resultado >= 0.3) {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(2);
						setPlacarVisitante(2);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(3);
						setPlacarVisitante(3);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(1);
						setPlacarVisitante(1);
					}
					else {
						setPlacarMandante(0);
						setPlacarVisitante(0);
					}
				}
				else {
					if (placar <= 1.0 & placar >= 0.8) {
						setPlacarMandante(0);
						setPlacarVisitante(2);
					}
					else if (placar < 0.8 & placar >= 0.6) {
						setPlacarMandante(2);
						setPlacarVisitante(3);
					}
					else if (placar < 0.6 & placar >= 0.2) {
						setPlacarMandante(0);
						setPlacarVisitante(1);
					}
					else {
						setPlacarMandante(1);
						setPlacarVisitante(2);
					}
				}
			}
		}
	}
	public void gerarLesoes() {
		double aux_qnt_les = Math.random();
		int les_sofr;
		if (aux_qnt_les <= 1.0 & aux_qnt_les > 0.5) {
			les_sofr = 0;
		}
		else if (aux_qnt_les <= 0.5 & aux_qnt_les > 0.2) {
			les_sofr = 1;
		}
		else {
			les_sofr = 2;
		}
		for (int i = 0; i < les_sofr; i++) {
			double aux_time_les = Math.random();
			if (aux_time_les <= 1.0 & aux_time_les > 0.5) {
				double aux_joga_les = Math.random();
				if (aux_joga_les >= 0 & aux_joga_les < 0.090) {
					mandante.relacionados.get(0).sofrerLesao();
				}
				else if (aux_joga_les >= 0.090 & aux_joga_les < 0.181) {
					mandante.relacionados.get(1).sofrerLesao();
				}
				else if (aux_joga_les >= 0.181 & aux_joga_les < 0.272) {
					mandante.relacionados.get(2).sofrerLesao();
				}
				else if (aux_joga_les >= 0.272 & aux_joga_les < 0.363) {
					mandante.relacionados.get(3).sofrerLesao();
				}
				else if (aux_joga_les >= 0.363 & aux_joga_les < 0.454) {
					mandante.relacionados.get(4).sofrerLesao();
				}
				else if (aux_joga_les >= 0.454 & aux_joga_les < 0.545) {
					mandante.relacionados.get(5).sofrerLesao();
				}
				else if (aux_joga_les >= 0.545 & aux_joga_les < 0.636) {
					mandante.relacionados.get(6).sofrerLesao();
				}
				else if (aux_joga_les >= 0.636 & aux_joga_les < 0.727) {
					mandante.relacionados.get(7).sofrerLesao();
				}
				else if (aux_joga_les >= 0.727 & aux_joga_les < 0.818) {
					mandante.relacionados.get(8).sofrerLesao();
				}
				else if (aux_joga_les >= 0.818 & aux_joga_les < 0.909) {
					mandante.relacionados.get(9).sofrerLesao();
				}
				else if (aux_joga_les >= 0.909 & aux_joga_les <= 1) {
					mandante.relacionados.get(10).sofrerLesao();
				}
			}
			else {
				double aux_joga_les = Math.random();
				if (aux_joga_les >= 0 & aux_joga_les < 0.090) {
					visitante.relacionados.get(0).sofrerLesao();
				}
				else if (aux_joga_les >= 0.090 & aux_joga_les < 0.181) {
					visitante.relacionados.get(1).sofrerLesao();
				}
				else if (aux_joga_les >= 0.181 & aux_joga_les < 0.272) {
					visitante.relacionados.get(2).sofrerLesao();
				}
				else if (aux_joga_les >= 0.272 & aux_joga_les < 0.363) {
					visitante.relacionados.get(3).sofrerLesao();
				}
				else if (aux_joga_les >= 0.363 & aux_joga_les < 0.454) {
					visitante.relacionados.get(4).sofrerLesao();
				}
				else if (aux_joga_les >= 0.454 & aux_joga_les < 0.545) {
					visitante.relacionados.get(5).sofrerLesao();
				}
				else if (aux_joga_les >= 0.545 & aux_joga_les < 0.636) {
					visitante.relacionados.get(6).sofrerLesao();
				}
				else if (aux_joga_les >= 0.636 & aux_joga_les < 0.727) {
					visitante.relacionados.get(7).sofrerLesao();
				}
				else if (aux_joga_les >= 0.727 & aux_joga_les < 0.818) {
					visitante.relacionados.get(8).sofrerLesao();
				}
				else if (aux_joga_les >= 0.818 & aux_joga_les < 0.909) {
					visitante.relacionados.get(9).sofrerLesao();
				}
				else if (aux_joga_les >= 0.909 & aux_joga_les <= 1) {
					visitante.relacionados.get(10).sofrerLesao();
				}
			}
		}
	}
	public void gerarCartoes() {
		double aux_qnts_cards = Math.random();
		int carts_aplic;
		if (aux_qnts_cards >= 0 & aux_qnts_cards < 0.090) {
			carts_aplic = 0;
		}
		else if (aux_qnts_cards >= 0.090 & aux_qnts_cards < 0.181) {
			carts_aplic = 1;
		}
		else if (aux_qnts_cards >= 0.181 & aux_qnts_cards < 0.272) {
			carts_aplic = 2;
		}
		else if (aux_qnts_cards >= 0.272 & aux_qnts_cards < 0.363) {
			carts_aplic = 3;
		}
		else if (aux_qnts_cards >= 0.363 & aux_qnts_cards < 0.454) {
			carts_aplic = 4;
		}
		else if (aux_qnts_cards >= 0.454 & aux_qnts_cards < 0.545) {
			carts_aplic = 5;
		}
		else if (aux_qnts_cards >= 0.545 & aux_qnts_cards < 0.636) {
			carts_aplic = 6;
		}
		else if (aux_qnts_cards >= 0.636 & aux_qnts_cards < 0.727) {
			carts_aplic = 7;
		}
		else if (aux_qnts_cards >= 0.727 & aux_qnts_cards < 0.818) {
			carts_aplic = 8;
		}
		else if (aux_qnts_cards >= 0.818 & aux_qnts_cards < 0.909) {
			carts_aplic = 9;
		}
		else{
			carts_aplic = 10;
		}
		for (int i = 0; i < carts_aplic; i++) {
			double aux_time_cards = Math.random();
			if (aux_time_cards <= 1 & aux_time_cards > 0.5) {
				double aux_joga_cards = Math.random();
				if (aux_joga_cards >= 0 & aux_joga_cards < 0.090) {
					mandante.relacionados.get(0).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.090 & aux_joga_cards < 0.181) {
					mandante.relacionados.get(1).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.181 & aux_joga_cards < 0.272) {
					mandante.relacionados.get(2).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.272 & aux_joga_cards < 0.363) {
					mandante.relacionados.get(3).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.363 & aux_joga_cards < 0.454) {
					mandante.relacionados.get(4).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.454 & aux_joga_cards < 0.545) {
					mandante.relacionados.get(5).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.545 & aux_joga_cards < 0.636) {
					mandante.relacionados.get(6).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.636 & aux_joga_cards < 0.727) {
					mandante.relacionados.get(7).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.727 & aux_joga_cards < 0.818) {
					mandante.relacionados.get(8).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.818 & aux_joga_cards < 0.909) {
					mandante.relacionados.get(9).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.90909091 & aux_joga_cards <= 1 ) {
					mandante.relacionados.get(10).aplicarCartao();
				}
			}
			else {
				double aux_joga_cards = Math.random();
				if (aux_joga_cards >= 0 & aux_joga_cards < 0.090) {
					visitante.relacionados.get(0).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.090 & aux_joga_cards < 0.181) {
					visitante.relacionados.get(1).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.181 & aux_joga_cards < 0.272) {
					visitante.relacionados.get(2).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.272 & aux_joga_cards < 0.363) {
					visitante.relacionados.get(3).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.363 & aux_joga_cards < 0.454) {
					visitante.relacionados.get(4).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.454 & aux_joga_cards < 0.545) {
					visitante.relacionados.get(5).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.545 & aux_joga_cards < 0.636) {
					visitante.relacionados.get(6).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.636 & aux_joga_cards < 0.727) {
					visitante.relacionados.get(7).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.727 & aux_joga_cards < 0.818) {
					visitante.relacionados.get(8).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.818 & aux_joga_cards < 0.909) {
					visitante.relacionados.get(9).aplicarCartao();
				}
				else if (aux_joga_cards >= 0.909 & aux_joga_cards <= 1) {
					visitante.relacionados.get(10).aplicarCartao();
				}
			}
		}
		
	}
	
}
	


