public class Piano extends Instrumento implements SeAfina {

    public Piano() {
        super("Piano");
    }

    @Override
    public void tocar() {
        System.out.println("El piano está sonando.");
    }

    @Override
    public void afinar() {
        System.out.println("El piano se está afinando.");
    }
}
