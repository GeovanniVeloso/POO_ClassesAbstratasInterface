package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Principal {

	public static void main(String[] args) {
		
		EstudanteTecnico est = new EstudanteTecnico();
		est.setNome("Geovanni");
		est.setEmail("geovanni.ferreira@fatec.sp.gov.br");
		est.setRa("1110482223048");
		est.setMediaNotas(8.2f);
		est.setQtdAprovacoes("36");
		
		EstudanteSuperior ess = new EstudanteSuperior("USP", 2025);
		ess.setNome("Leandro");
		ess.setEmail("leandro.colevati@fatec.sp.gov.br");
		ess.setRa("XXXXXX-XX");
		ess.setMediaNotas(9.6f);
		ess.setQtdAprovacoes("67");
		
		EstudanteTecnicoController etc = new EstudanteTecnicoController();
		etc.percentualRendimento(est);
		etc.percentualProgressao(est);
		
		EstudanteSuperiorController ets = new EstudanteSuperiorController();
		ets.percentualProgressao(ess);
		ets.percentualRendimento(ess);
	}

}
