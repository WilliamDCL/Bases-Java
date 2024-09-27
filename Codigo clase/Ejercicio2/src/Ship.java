public class Ship implements Vehicle {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Bote " + name + " en el puerto");
    }
}
