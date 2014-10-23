package es.upm.miw.pd.factoryMethod.naturalNumber;


public class NaturalNumberManager {

    private NaturalNumberCreator creator = new NaturalNumberEsCreator();

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public NaturalNumber createNaturalNumber(int valor) {
        return this.creator.crearNumeroNatural(valor);
    }
	
}
