package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references;
    private int reference;
    private static FactoryReferences factory;

    private FactoryReferences() {
        this.references = new HashMap<>();
        this.reference = 0;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

	public static FactoryReferences getFactory() {
		if(FactoryReferences.factory == null){
			FactoryReferences.factory = new FactoryReferences();
		}
		return FactoryReferences.factory;
	}

}