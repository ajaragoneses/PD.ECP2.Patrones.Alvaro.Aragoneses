package es.upm.miw.pd.command.calculadora.solution.memento;

public interface Mementable {
	public void crearMemento(String key);
	public void restaurarMemento(String key);
}
