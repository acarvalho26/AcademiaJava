package gitTeste;

import javax.swing.JOptionPane;

public class Shape {
	
	private double lado1;
	private double lado2;
	private double raio;
	private double area;
	private double perimetro;
	String entry1;
	String entry2;
	String entry;
	
	
	
	public void perimetroCirculo() {
		entry = JOptionPane.showInputDialog("Cálculo de área \n digite o raio do círculo: ");
		raio = Double.parseDouble(entry);
		setPerimetro(2 * Math.PI * raio);
		System.out.println("Perímetro = "+ getArea());
	}
	
	public void areaCirculo() {
		entry = JOptionPane.showInputDialog("Cálculo de área \n digite o raio do círculo: ");
		raio = Double.parseDouble(entry);
		setArea(Math.PI * raio * raio);
		System.out.println("Área = "+ getArea());
	}
	
	public void areaRetangulo() {
		entry1 = JOptionPane.showInputDialog("Cálculo de área \n digite um lado do retângulo: ");
		entry2 = JOptionPane.showInputDialog("Cálculo de área \n digite o outro lado do retângulo: ");
		lado1 = Double.parseDouble(entry1);
		lado2 = Double.parseDouble(entry2);
		setArea(lado1 * lado2);
		System.out.println("Área = "+ getArea());
	}
	
	public void perimetroRetangulo() {
		entry1 = JOptionPane.showInputDialog("Cálculo de perímetro \n digite um lado do retângulo: ");
		entry2 = JOptionPane.showInputDialog("Cálculo de perímetro \n digite o outro lado do retângulo: ");
		lado1 = Double.parseDouble(entry1);
		lado2 = Double.parseDouble(entry2);
		setPerimetro((2 * lado1) + (2 * lado2));
		System.out.println("Perímetro = "+ getPerimetro());
	}
	

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
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
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
	
	
	 

}
