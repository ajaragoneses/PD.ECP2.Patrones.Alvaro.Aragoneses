package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber crearNumeroNatural(int valor) {
		return new NaturalNumberFr(valor);
	}

}
