package es.upm.miw.pd.command.calculadora.solution.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.Calculadora;
import es.upm.miw.pd.command.calculadora.solution.Comando;

public class ComandoDeshacer implements Comando {

	private CalculadoraMementable calc;
	
	public ComandoDeshacer(CalculadoraMementable calc) {
		this.calc = calc;
	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		String key = (String) IO.in.read(String.class, "Introduce el nombre del punto de guardado a restaurar");
		this.calc.restaurarMemento(key);
	}

}
