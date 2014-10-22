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
		// TODO Auto-generated method stub

	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enviar(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recibir(int respuesta) {
		// TODO Auto-generated method stub

	}
}
