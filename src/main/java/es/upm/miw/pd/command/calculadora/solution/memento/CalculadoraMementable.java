package es.upm.miw.pd.command.calculadora.solution.memento;

import es.upm.miw.pd.command.calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable {

	@Override
	public void crearMemento(String key) {
		MementoCalculadora m = new MementoCalculadora(this.getTotal());
		GestorMementosCalculadora.getInstance().addMemento(key, m);
	}

	@Override
	public void restaurarMemento(String key) {
		MementoCalculadora m = GestorMementosCalculadora.getInstance().getMemento(key);
		this.setTotal(m.getTotal());
	}

}
