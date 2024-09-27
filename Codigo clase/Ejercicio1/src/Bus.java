public class Bus extends Car {

    public Bus(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The bus " + getName() + " lleva pasajeros.");
    }
}