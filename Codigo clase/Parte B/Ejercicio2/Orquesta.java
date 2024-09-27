import java.util.ArrayList;
import java.util.List;

public class Orquesta {
    private String nombreOrquesta;
    private List<Instrumento> instrumentos;

    public Orquesta(String nombre) {
        this.nombreOrquesta = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void crearOrquesta() {
        instrumentos.add(new Flauta());
        instrumentos.add(new Violin());
        instrumentos.add(new Piano());
    }

    public void guardarOrquesta() {
        System.out.println("Guardando la orquesta " + nombreOrquesta);
    }

    public void tocarTodos() {
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
