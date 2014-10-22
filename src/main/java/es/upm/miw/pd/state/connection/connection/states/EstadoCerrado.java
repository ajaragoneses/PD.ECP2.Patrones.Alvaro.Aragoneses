package es.upm.miw.pd.state.connection.connection.states;

import es.upm.miw.pd.state.connection.connection.Conexion;
import es.upm.miw.pd.state.connection.connection.Estado;
import es.upm.miw.pd.state.connection.connection.EstadoAbs;

public class EstadoCerrado extends EstadoAbs {

	public EstadoCerrado(Conexion context){
		this.context = context;
		this.estado = Estado.CERRADO;
	}
	
	@Override
	public void abrir() {
		this.context.setEstado(new EstadoPreparado(this.context));
	}

	@Override
	public void cerrar() {
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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
