public class Car {
    public void beforeCar(Oil oil) {
        System.out.println("Carro antes de uso");
        oil.add();  
        System.out.println("Carro listo con aceite: " + oil.getType());
    }
}
