package atividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Caso dê erro aí, o senhor precisa colocar o joda-time como build-path pra poder importar direitinho

public class Jogador {

	int id;
	String nome;
	String apelido;
	String dataNascimento;
	int numero;
	String posicao;
	int qualidade;
	int cartoes;
	Boolean suspenso;
	Boolean treinou;

	public Jogador() {
	}

	public Jogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao,
			int qualidade, int cartoes, Boolean treinou) {

		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.cartoes = cartoes;
		this.treinou = treinou;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public Boolean getSuspenso() {
		return suspenso;
	}

	public void setSuspenso(Boolean suspenso) {
		this.suspenso = suspenso;
	}

//  transforma a dataNascimento String recebida em Date. Se o usuário tentar passar algum valor acima de 31 pra dia e/ou acima de 12 pra mês, o código quebra.
	public String parseDate(String date) {

		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
		dtf.parseDateTime(date);

		return date;

	}

	public String verJogo() {
		if (getCartoes() >= 3) {
			return "TÁ SUSPENSO";
		}

		else {
			return "TÁ JOGANDO";
		}
	}

	public void aplicarCartao() {
		this.cartoes = this.cartoes + 1;
		if (cartoes >= 3) {
			this.suspenso = true;
		}
	}

	public void cumprirSuspencao() {
		setCartoes(0);
	}

	public void sofrerLesao() {

		double prob = Math.random();
//		
		if (prob > 0 & prob <= 0.1) {

			setQualidade(getQualidade() - (getQualidade() * (15 / 100)));
			if (getQualidade() < 0) {

				setQualidade(0);

			}
		}

		if (prob > 0.1 & prob <= 0.10) {

			setQualidade(getQualidade() - (getQualidade() * (10 / 100)));
			if (getQualidade() < 0) {

				setQualidade(0);
			}

		}

		if (prob > 0.10 & prob <= 0.35) {

			setQualidade(getQualidade() - (getQualidade() * (5 / 100)));
			if (getQualidade() < 0) {

				setQualidade(0);

			}

		}

		if (prob > 0.35 & prob <= 0.85) {

			setQualidade(getQualidade() - (2));
			if (getQualidade() < 0) {

				setQualidade(0);

			}

		}

		if (prob > 0.85 & prob <= 1.00) {

			setQualidade(getQualidade() - (1));
			if (getQualidade() < 0)

				setQualidade(0);

		}

	}

	public void executarTreinamento() {

		double prob = Math.random();

		if (treinou == false) {
			if (prob > 0 & prob <= 0.1) {

				setQualidade(getQualidade() + 5);

				if (getQualidade() > 100) {

					setQualidade(100);
				}

				else if (prob > 0.1 & prob <= 0.10) {

					setQualidade(getQualidade() + 4);

					if (getQualidade() > 100) {

						setQualidade(100);
					}

				} else if (prob > 0.10 & prob <= 0.35) {

					setQualidade(getQualidade() + 3);

					if (getQualidade() > 100) {

						setQualidade(100);
					}

				} else if (prob > 0.35 & prob <= 0.85) {

					setQualidade(getQualidade() + 2);

					if (getQualidade() > 100) {

						setQualidade(100);
					}

				}

				else if (prob > 0.85 & prob <= 1.00) {

					setQualidade(getQualidade() + 1);

					if (getQualidade() > 100) {

						setQualidade(100);
					}

				}

			}
		}

		else {

			System.out.println("jogador já efetuou o treinamento, sua qualidade continua : ");

		}

	}

	public void adicionaJogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao,
			int qualidade) {

		Connection cn = ConexaoTeste.getConnection().Conn();
		try {
			PreparedStatement pStmt = cn.prepareStatement("insert into jogador values (?, ?, ?, ?, ?, ?, ?)");
			pStmt.setInt(1, id);
			pStmt.setString(2, nome);
			pStmt.setString(3, apelido);
			pStmt.setString(4, dataNascimento);
			pStmt.setInt(5, numero);
			pStmt.setString(6, posicao);
			pStmt.setInt(7, qualidade);
			pStmt.executeUpdate();
			cn.commit();
			cn.close();

		} catch (SQLException e) {

			if (e.getErrorCode() == 1062) {

				System.out.println("A PK ESTÁ DUPLICADA, ALTERAÇÃO NÃO SERÁ EFETUADA");
			}

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public void retornaJogador() {

		Connection cn = ConexaoTeste.getConnection().Conn();

		try {
			Statement st = cn.createStatement();
			st.executeQuery("Select * from jogador");
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4)
								+ " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
