public class Main {
    public static void main(String[] args) {
        Oil syntheticOil = new Oil("Sintetico");

        Car car = new Car();

        car.beforeCar(syntheticOil);
    }
}
