package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber crearNumeroNatural(int valor) {
		return new NaturalNumberEn(valor);
	}

}
