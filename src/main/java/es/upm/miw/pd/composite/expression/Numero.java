package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion{
	private int numero;
	
	public Numero(int num){
		this.numero = num;
	}
	
	@Override
	public int operar() {
		return this.numero;
	}

	@Override
	public String toString(){
		return Integer.toString(this.numero);
	}
}
