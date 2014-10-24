package es.upm.miw.pd.command.calculadora.solution.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculadora.solution.Comando;

public class ComandoGuardar implements Comando {

	private CalculadoraMementable calc;
	
	public ComandoGuardar(CalculadoraMementable calc) {
		this.calc = calc;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		String key = (String) IO.in.read(String.class, "Introduce un nombre para el punto de guardado");
		this.calc.crearMemento(key);
	}

}
