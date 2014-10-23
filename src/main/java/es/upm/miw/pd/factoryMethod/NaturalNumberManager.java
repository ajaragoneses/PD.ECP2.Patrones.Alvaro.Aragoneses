package es.upm.miw.pd.factoryMethod;

import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumber;

public class NaturalNumberManager {

    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public NaturalNumber createNaturalNumber() {
        return this.creator.crearNumeroNatural();
    }
	
}
