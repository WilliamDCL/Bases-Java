public class Violin extends Instrumento {

    public Violin() {
        super("Violin");
    }

    @Override
    public void tocar() {
        System.out.println("El violín está sonando.");
    }

    public void tocar(int intensidad) {
        System.out.println("El violín está sonando con una intensidad de: " + intensidad);
    }
}
