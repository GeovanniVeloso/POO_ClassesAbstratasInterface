package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController {

	public EstudanteSuperiorController() {
		super();
	}

	@Override
	public void percentualRendimento(Estudante est) {
		System.out.println("O percentual de rendimento é: "
				+ (est.getMediaNotas() * (Integer.parseInt(est.getQtdAprovacoes())) * 0.972f)/10 + "%.");
		
	}

	@Override
	public void percentualProgressao(Estudante est) {
		System.out.println("O percentual de progressão é: " + (Integer.parseInt(est.getQtdAprovacoes()) / 6 + "%"));
		
	}

}
