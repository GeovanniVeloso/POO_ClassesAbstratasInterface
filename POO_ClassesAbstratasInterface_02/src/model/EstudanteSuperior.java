package model;

public class EstudanteSuperior extends Estudante {

	private String instituicaoSegundoGrau;
	private int anoConclusaoSegundoGrau;
	
	public EstudanteSuperior(String instituicaoSegundoGrau, int anoConclusaoSegundoGrau) {
		super();
		this.instituicaoSegundoGrau = instituicaoSegundoGrau;
		this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
	}

	public String getInstituicaoSegundoGrau() {
		return instituicaoSegundoGrau;
	}

	public void setInstituicaoSegundoGrau(String instituicaoSegundoGrau) {
		this.instituicaoSegundoGrau = instituicaoSegundoGrau;
	}

	public int getAnoConclusaoSegundoGrau() {
		return anoConclusaoSegundoGrau;
	}

	public void setAnoConclusaoSegundoGrau(int anoConclusaoSegundoGrau) {
		this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
	}
	
	

}
