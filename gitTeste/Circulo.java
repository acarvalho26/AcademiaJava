package gitTeste;

import java.lang.Math;

import javax.swing.JOptionPane;

public class Circulo {
	
	private double raio;
	private double area;
	private double perimetro;
	String entry;
	
	public Circulo() {
	
	}
	
	public Circulo(double raio) {
		super();
		
		this.raio = raio;
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
	
	public void calcularArea() {
		entry = JOptionPane.showInputDialog("C�lculo de �rea \n digite o raio do c�rculo: ");
		raio = Double.parseDouble(entry);
		setArea(Math.PI * raio * raio);
		System.out.println("�rea = "+ getArea());
		
	}
	
	public void calcularPerimetro() {
		entry = JOptionPane.showInputDialog("C�lculo de �rea \n digite o raio do c�rculo: ");
		raio = Double.parseDouble(entry);
		setPerimetro(2 * Math.PI * raio);
		System.out.println("Per�metro = "+ getArea());
		
	}
	
	
}
	
	
		
	
