public class Main {

    public static void main(String[] args) {
       
        Clothes vest = new Clothes("Chaleco");
        Clothes jacket = new Clothes("Chaqueta");
        Hat cap = new Hat("Gorra");
        Hat beret = new Hat("Boina");

        BusDriver driver = new BusDriver();

        driver.wearClothes(vest);
        driver.wearClothes(jacket);
        driver.wearHat(cap);
        driver.wearHat(beret);

        driver.show();
    }
}
