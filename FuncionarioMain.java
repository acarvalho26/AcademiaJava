package atividades;

import java.util.ArrayList;

public class FuncionarioMain extends Funcionario{

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Luis");
		funcionario1.setSobrenome("Silva");
		funcionario1.setHorasTrabalhadas(10);
		funcionario1.setValorPorHora(25.50);
		
		funcionario1.nomeCompleto();
		funcionario1.calcularSalario();
		
		funcionario1.incrementarHoras(8);
		funcionario1.calcularSalario();
	
		
		ArrayList<Funcionario> listaFunc = new ArrayList<Funcionario>();
		listaFunc.add(new Funcionario("teste", "teste", 5, 5));
		listaFunc.add(new Funcionario("André", "teste", 25, 10));
		listaFunc.add(new Funcionario("Thiago", "teste", 3, 30));
		listaFunc.add(new Funcionario("Julio", "teste", 5, 10));
		listaFunc.add(new Funcionario("Gabrielle", "teste", 4, 10));
		listaFunc.add(new Funcionario("Ana", "teste", 4, 5));
		listaFunc.add(new Funcionario("Maria", "teste", 7, 11));
		listaFunc.add(new Funcionario("João", "teste", 8, 12));
		listaFunc.add(new Funcionario("Matheus", "teste", 9, 10.5));
		
		listaFunc.get(0).nomeCompleto();
		listaFunc.get(0).calcularSalario();
		listaFunc.get(0).incrementarHoras(10);
		listaFunc.get(0).calcularSalario();
		
		
		
		
		
		
		
	
		
		
	
	}

}
