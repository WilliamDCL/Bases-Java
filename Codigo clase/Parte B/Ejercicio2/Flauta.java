public class Flauta extends Instrumento {

    public Flauta() {
        super("Flauta");
    }

    @Override
    public void tocar() {
        System.out.println("La flauta está sonando.");
    }

    public void tocar(String melodia) {
        System.out.println("La flauta está tocando la melodía: " + melodia);
    }
}
