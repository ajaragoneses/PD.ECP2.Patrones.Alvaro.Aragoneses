package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber crearNumeroNatural(int valor) {
		return new NaturalNumberEs(valor);
	}

}
