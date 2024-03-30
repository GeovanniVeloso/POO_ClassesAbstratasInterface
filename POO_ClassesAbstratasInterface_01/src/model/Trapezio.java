package model;

public class Trapezio extends Quadrilatero {

	private float baseMenor;

	public Trapezio(float baseMenor) {
		super();
		this.baseMenor = baseMenor;
	}

	@Override
	public float calcPerimetro() {
		return getBase() + getAltura() + baseMenor;
	}
	
	@Override
	public float calArea() {
		return ((getBase() + baseMenor) * getAltura()) / 2;
	}

}
