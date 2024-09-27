public class Main {
    public static void main(String[] args) {
        Car bus = new Bus("Transmilenio");
        Car taxi = new Taxi("Uber");

        bus.run();
        taxi.run();
    }
}
