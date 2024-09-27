public class Instrumento {
    protected String nombre;

    public Instrumento() {
        this.nombre = "Instrumento genérico";
    }

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public void tocar() {
        System.out.println("El instrumento está sonando.");
    }
}
