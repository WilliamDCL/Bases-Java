public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Ferrari");
        Vehicle ship = new Ship("Titanic");

        car.run();
        ship.run();
    } 
}
