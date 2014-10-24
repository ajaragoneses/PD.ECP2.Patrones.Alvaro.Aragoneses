package es.upm.miw.pd.command.calculadora;

import es.upm.miw.pd.command.calculadora.solution.*;
import es.upm.miw.pd.command.calculadora.solution.memento.*;
import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;

    // TODO: llevar la parte comun de los comandos al padre
    
    public MainCalculadora() {
    	//Calculadora calc = new Calculadora();
        CalculadoraMementable calc = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        // --- MEMENTABLE ---
        this.gestor.add(new ComandoGuardar(calc));
        //this.gestor.add(new ComandoDeshacer(calc));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
