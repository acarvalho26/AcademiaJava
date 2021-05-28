package gitTeste;

import javax.swing.JOptionPane;

public class Retangulo {
	
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	String entry1;
	String entry2;
	
	
	
	public Retangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	
		
	}
	
	public Retangulo() {}
	
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public void  calcularArea() {
		entry1 = JOptionPane.showInputDialog("C�lculo de �rea \n digite um lado do ret�ngulo: ");
		entry2 = JOptionPane.showInputDialog("C�lculo de �rea \n digite o outro lado do ret�ngulo: ");
		lado1 = Double.parseDouble(entry1);
		lado2 = Double.parseDouble(entry2);
		setArea(lado1 * lado2);
		System.out.println("�rea = "+ getArea());
	}
	
	public void  calcularPerimetro() {
		entry1 = JOptionPane.showInputDialog("C�lculo de per�metro \n digite um lado do ret�ngulo: ");
		entry2 = JOptionPane.showInputDialog("C�lculo de per�metro \n digite o outro lado do ret�ngulo: ");
		lado1 = Double.parseDouble(entry1);
		lado2 = Double.parseDouble(entry2);
		setPerimetro((2 * lado1) + (2 * lado2));
		System.out.println("Per�metro = "+ getPerimetro());
	}
	

}
