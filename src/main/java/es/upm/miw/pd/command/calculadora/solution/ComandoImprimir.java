package es.upm.miw.pd.command.calculadora.solution;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;

public class ComandoImprimir implements Comando {

	private Calculadora calc;
	
	public ComandoImprimir(Calculadora calc) {
		this.calc = calc;
	}

	@Override
	public String name() {
		return "Imprimir";
	}

	@Override
	public void execute() {
		IO.out.println("Total: " + this.calc.getTotal());
	}

}
