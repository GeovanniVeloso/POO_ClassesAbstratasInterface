package view;

import model.Paralelograma;
import model.Trapezio;

public class Principal {

	public static void main(String[] args) {
		
		Paralelograma retangulo = new Paralelograma();
		retangulo.setAltura(4.0f);
		retangulo.setBase(10.5f);
		System.out.println(retangulo.calArea());
		System.out.println(retangulo.calcPerimetro());
		
		Trapezio triangulo = new Trapezio(2.3f);
		triangulo.setAltura(14f);
		triangulo.setBase(6.5f);
		System.out.println(triangulo.calArea());
		System.out.println(triangulo.calcPerimetro());

	}

}
