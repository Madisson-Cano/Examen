package teatro;

public class ObraF {

	public static ObraF crearObra(String tipoObra, String nombre, String horario) {
		// TODO Auto-generated constructor stub
		switch (tipoObra) {
        case "Drama":
            return new Drama(nombre, horario);
        case "Comedia":
            return new Comedia(nombre, horario);
        default:
            throw new IllegalArgumentException("Tipo de obra no soportado.");
    }
	}

}