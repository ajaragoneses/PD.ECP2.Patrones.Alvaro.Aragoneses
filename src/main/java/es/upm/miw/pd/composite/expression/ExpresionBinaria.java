package es.upm.miw.pd.composite.expression;

public abstract class ExpresionBinaria extends Expresion {

	protected Expresion operando_1;
	protected Expresion operando_2;
	protected String simbolo_operacion;
	
	@Override
	public String toString(){
		return "("+this.operando_1.toString()+this.simbolo_operacion+this.operando_2.toString()+")";
	}

}
