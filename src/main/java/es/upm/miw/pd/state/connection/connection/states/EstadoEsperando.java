package es.upm.miw.pd.state.connection.connection.states;

import es.upm.miw.pd.state.connection.connection.Conexion;
import es.upm.miw.pd.state.connection.connection.Estado;
import es.upm.miw.pd.state.connection.connection.EstadoAbs;

public class EstadoEsperando extends EstadoAbs {

	public EstadoEsperando(Conexion context){
		this.context = context;
		this.estado = Estado.ESPERANDO;
	}
	
	@Override
	public void abrir() {
	}

	@Override
	public void cerrar() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar() {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void recibir(int respuesta) {
		if (respuesta == 0) {
            this.context.setEstado(new EstadoPreparado(this.context));
        } else {
        	this.context.setEstado(new EstadoCerrado(this.context));
        }
	}
}
