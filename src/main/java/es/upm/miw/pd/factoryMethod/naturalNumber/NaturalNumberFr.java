package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

    public NaturalNumberFr(int value) {
    	String nombres[] = {"zero", "un", "deux", "trois", "quatre", "cinq"};
    	for(int i = 0; i < nombres.length; i++) {
    		this.textValue[i] = nombres[i];
    	}
    	this.setValue(value);
    }
}
