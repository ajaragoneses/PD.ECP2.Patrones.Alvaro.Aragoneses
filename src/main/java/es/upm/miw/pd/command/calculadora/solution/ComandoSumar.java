package es.upm.miw.pd.command.calculadora.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;


public class ComandoSumar implements Comando {

	private Calculadora calc;
	
	public ComandoSumar(Calculadora calc) {
		this.calc = calc;
	}

	@Override
	public String name() {
		return "Sumar";
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt("Numero a Sumar");
		this.calc.sumar(valor);
	}

}
