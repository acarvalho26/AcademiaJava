package gitTeste;

import javax.swing.JOptionPane;

public class RetanguloMain {

	public static void main(String[] args) {
		
		String entrada;
		
		Retangulo retangulo1 = new Retangulo();
		
		do {entrada = JOptionPane.showInputDialog("Digite o que pretende calcular \n 1 - �rea do ret�ngulo \n 2 - Per�metro do ret�ngulo \n 0 - Sair");
		
			if (Integer.parseInt(entrada) == 1) {
				retangulo1.calcularArea();
		
			}
			else if (Integer.parseInt(entrada) == 2) {
			
				retangulo1.calcularPerimetro();
			}	
		
			else if (Integer.parseInt(entrada) > 2) {
				break;
			}	
	
		} 	while ((Integer.parseInt(entrada) != 0));
	
	}

}
