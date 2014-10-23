package es.upm.miw.pd.factoryMethod.naturalNumber;


public class NaturalNumberManager {

    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public NaturalNumber createNaturalNumber() {
        return this.creator.crearNumeroNatural();
    }
	
}
