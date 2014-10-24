package es.upm.miw.pd.command.calculadora.solution.memento;

public class MementoCalculadora {
	private int total;
	
	public MementoCalculadora(int total){
		this.total = total;
	}
	
	public int getTotal(){
		return this.total;
	}
}
