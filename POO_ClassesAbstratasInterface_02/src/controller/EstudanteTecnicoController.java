package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController {

	public EstudanteTecnicoController() {
		super();
	}

	@Override
	public void percentualRendimento(Estudante est) {
		System.out.println("O percentual de rendimento é: "
				+ (est.getMediaNotas() * (Integer.parseInt(est.getQtdAprovacoes())) * 0.931f)/10 + "%.");
	}

	@Override
	public void percentualProgressao(Estudante est) {
		System.out.println("O percentual de progressão é: " + (Integer.parseInt(est.getQtdAprovacoes()) / 3 + "%"));
	}

}
