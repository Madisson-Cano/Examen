package teatro;

public abstract class Obra {
	protected String nombre;
    protected String horario;

	public Obra(String nombre, String horario) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
        this.horario = horario;
	}
	public abstract void mostrarDetalles(); 

}
 