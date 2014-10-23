package es.upm.miw.pd.factoryMethod.naturalNumber;


public class NaturalNumberEs extends NaturalNumber {

    public NaturalNumberEs(int value) {
    	
    	String nombres[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
    	for(int i = 0; i < nombres.length; i++) {
    		this.textValue[i] = nombres[i];
    	}
    	this.setValue(value);
    }

}