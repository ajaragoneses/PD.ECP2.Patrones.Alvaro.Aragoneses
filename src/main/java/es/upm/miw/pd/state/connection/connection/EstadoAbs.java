package es.upm.miw.pd.state.connection.connection;

public abstract class EstadoAbs {

	public abstract void abrir();
	public abstract void cerrar();
	public abstract void parar();
	public abstract void iniciar();
	public abstract void enviar(String msg);
	public abstract void recibir(int respuesta);
	public abstract Estado getEstado();
}
