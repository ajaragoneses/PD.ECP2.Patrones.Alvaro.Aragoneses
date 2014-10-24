package es.upm.miw.pd.command.calculadora.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;

public class ComandoRestar implements Comando {

	private Calculadora calc;
	
	public ComandoRestar(Calculadora calc) {
		this.calc = calc;
	}

	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt("Numero a Restar");
		this.calc.restar(valor);
	}

}
