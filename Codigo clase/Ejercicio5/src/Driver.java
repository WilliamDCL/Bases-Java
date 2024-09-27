import java.util.ArrayList;
import java.util.List;

public class Driver {
    private List<Car> cars; 

    public Driver() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);       
        car.setDriver(this); 
    }

    public List<Car> getCars() {
        return cars;
    }
}
