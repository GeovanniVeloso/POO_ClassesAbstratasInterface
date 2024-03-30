package model;

public class Paralelograma extends Quadrilatero {

	public Paralelograma() {
		super();
	}
	
	@Override
	public float calcPerimetro() {
		return 2 * (getBase() * getAltura() + 1);
	}

	@Override
	public float calArea() {
		return getBase() * getAltura();
	}

}
