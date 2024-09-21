package teatro;

public class Mein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teatro teatro = Teatro.getInstancia();
        
        Obra drama = ObraF.crearObra("Drama", "Hamlet", "20:00");
        Obra comedia = ObraF.crearObra("Comedia", "Los Globitos", "18:00");
        
        teatro.agregarObra(drama);
        teatro.agregarObra(comedia);
        
        for (Obra obra : teatro.getObras()) {
            obra.mostrarDetalles();
        }

	}

}
