package teatro;
import java.util.ArrayList;
import java.util.List;

public class Teatro {
	private static Teatro instancia;
    private List<Obra> obras;

	public Teatro() {
		// TODO Auto-generated constructor stub
		 obras = new ArrayList<>();
	}
	public static Teatro getInstancia() {
        if (instancia == null) {
            instancia = new Teatro();
        }
        return instancia;
    }
	public void agregarObra(Obra obra) {
        obras.add(obra);
    }

    public List<Obra> getObras() {
        return obras;
    }

}
