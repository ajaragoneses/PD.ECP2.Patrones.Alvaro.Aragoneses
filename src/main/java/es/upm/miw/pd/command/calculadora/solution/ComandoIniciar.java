package es.upm.miw.pd.command.calculadora.solution;

import es.upm.miw.pd.command.calculadora.Calculadora;

public class ComandoIniciar implements Comando {

	private Calculadora calc;
	
	public ComandoIniciar(Calculadora calc) {
		this.calc = calc;
	}

	@Override
	public String name() {
		return "Iniciar";
	}

	@Override
	public void execute() {
		this.calc.iniciar();
	}

}
