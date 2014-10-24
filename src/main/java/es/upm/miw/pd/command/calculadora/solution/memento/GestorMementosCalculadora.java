package es.upm.miw.pd.command.calculadora.solution.memento;

import java.util.HashMap;
import java.util.Map;

public class GestorMementosCalculadora {

	private Map<String, MementoCalculadora> map;
	private static GestorMementosCalculadora instancia = null;
	
	public static GestorMementosCalculadora getInstance(){
		if(GestorMementosCalculadora.instancia == null){
			GestorMementosCalculadora.instancia = new GestorMementosCalculadora();
		}
		return GestorMementosCalculadora.instancia;
	}
	
	private GestorMementosCalculadora(){
		this.map = new HashMap<String, MementoCalculadora>();
	}
	
	public void addMemento(String key, MementoCalculadora m){
		if(!this.map.containsKey(key)){
			this.map.put(key, m);
		}
	}
	
	public MementoCalculadora getMemento(String key){
		return this.map.get(key);
	}
	
	public String[] claves(){
		return (String[])this.map.keySet().toArray();
	}
}
