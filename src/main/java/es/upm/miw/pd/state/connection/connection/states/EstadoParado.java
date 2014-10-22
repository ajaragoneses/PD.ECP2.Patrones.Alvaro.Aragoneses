package es.upm.miw.pd.state.connection.connection.states;

import es.upm.miw.pd.state.connection.connection.Conexion;
import es.upm.miw.pd.state.connection.connection.Estado;
import es.upm.miw.pd.state.connection.connection.EstadoAbs;

public class EstadoParado extends EstadoAbs {

	public EstadoParado(Conexion context){
		this.context = context;
		this.estado = Estado.PARADO;
	}
	
	@Override
	public void abrir() {
        throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void cerrar() {
        throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar() {
	}

	@Override
	public void iniciar() {
		this.context.setEstado(new EstadoPreparado(this.context));
	}

	@Override
	public void enviar(String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
