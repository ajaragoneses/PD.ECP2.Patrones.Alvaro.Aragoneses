package es.upm.miw.pd.state.connection.connection.states;

import es.upm.miw.pd.state.connection.connection.Conexion;
import es.upm.miw.pd.state.connection.connection.Estado;
import es.upm.miw.pd.state.connection.connection.EstadoAbs;

public class EstadoPreparado extends EstadoAbs {

	public EstadoPreparado(Conexion context) {
		this.context = context;
		this.estado = Estado.PREPARADO;
	}

	@Override
	public void abrir() {

	}

	@Override
	public void cerrar() {
		this.context.setEstado(new EstadoCerrado(this.context));
	}

	@Override
	public void parar() {
		this.context.setEstado(new EstadoParado(this.context));
	}

	@Override
	public void iniciar() {
	}

	@Override
	public void enviar(String msg) {
		this.context.getLink().enviar(msg);
		this.context.setEstado(new EstadoEsperando(this.context));
	}

	@Override
	public void recibir(int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
	}
}
