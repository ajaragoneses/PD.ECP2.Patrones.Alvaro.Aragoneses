package es.upm.miw.pd.state.connection.connection;

public abstract class EstadoAbs {

	protected Estado estado;
	protected Conexion context;
	
	public abstract void abrir();
	public abstract void cerrar();
	public abstract void parar();
	public abstract void iniciar();
	public abstract void enviar(String msg);
	public abstract void recibir(int respuesta);
	public Estado getEstado(){
		return this.estado;
	}
}
