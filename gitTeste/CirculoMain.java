package gitTeste;

import javax.swing.JOptionPane;

public class CirculoMain {

	public static void main(String[] args) {
		
		String entrada;
		
		Circulo circulo1 = new Circulo();
		
		do {entrada = JOptionPane.showInputDialog("Digite o que pretende calcular \n 1 - Área do círculo \n 2 - Perímetro do círculo \n 0 - Sair");
		
			if (Double.parseDouble(entrada) == 1) {
				circulo1.calcularArea();
			
			}
			else if (Double.parseDouble(entrada) == 2) {
				
				circulo1.calcularPerimetro();
			}
			
			else if (Integer.parseInt(entrada) > 2) {
				break;
			}
		
		} 	while ((Integer.parseInt(entrada) != 0));
		
	}

}
