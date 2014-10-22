package es.upm.miw.pd.composite.expression;

public class Restar extends ExpresionBinaria {


	public Restar(Expresion ex_1, Expresion ex_2){
		this.operando_1 = ex_1;
		this.operando_2 = ex_2;
		this.simbolo_operacion = "-";
	}
	
	@Override
	public int operar() {
		return this.operando_1.operar() - this.operando_2.operar();
	}
}
