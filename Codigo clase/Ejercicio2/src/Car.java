public class Car implements Vehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Carro " + name + " corriendo en la pista");
    }
}
