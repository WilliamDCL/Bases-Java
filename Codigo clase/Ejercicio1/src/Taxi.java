public class Taxi extends Car {

    public Taxi(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("El taxi " + getName() + " lleva un pasajero.");
    }
}