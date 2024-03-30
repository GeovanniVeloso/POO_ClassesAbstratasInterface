package model;

public abstract class Quadrilatero {

	private float base;
	private float altura;

	public Quadrilatero() {
		super();
	}

	public float calcPerimetro() {
		float perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	public abstract float calArea();

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
