package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
    public NaturalNumberEn(int value) {
    	String nombres[] = {"zero", "une", "two", "three", "four", "five"};
    	for(int i = 0; i < nombres.length; i++) {
    		this.textValue[i] = nombres[i];
    	}
    	this.setValue(value);
    }
}
