public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car car1 = new Car();
        Car car2 = new Car();

        driver.addCar(car1); 
        driver.addCar(car2);

        System.out.println("Propietario carro:");
        for (Car car : driver.getCars()) {
            System.out.println("Carro manejado: " + (car.getDriver() != null ? "Si" : "No"));
        }

        System.out.println("Conductor carro 1: " + (car1.getDriver() != null ? "Asignado" : "Sin conductor"));
        System.out.println("Conductor carro 2: " + (car2.getDriver() != null ? "Asignado" : "Sin conductor"));
    }
}
