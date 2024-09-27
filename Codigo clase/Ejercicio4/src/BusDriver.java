import java.util.ArrayList;
import java.util.List;

public class BusDriver {
    private List<Clothes> clothesList; 
    private List<Hat> hatList;  

    public BusDriver() {
        this.clothesList = new ArrayList<>();  
        this.hatList = new ArrayList<>();     
    }

    public void wearClothes(Clothes clothes) {
        clothesList.add(clothes); 
    }

    public void wearHat(Hat hat) {
        hatList.add(hat);  
    }

    public void show() {
    
        if (!clothesList.isEmpty()) {
            System.out.println("Condutor vistiendo:");
            for (Clothes clothes : clothesList) {
                System.out.println("- " + clothes.getName());
            }
        }

        if (!hatList.isEmpty()) {
            System.out.println("El conductor usa:");
            for (Hat hat : hatList) {
                System.out.println("- " + hat.getName());
            }
        } 
    }
}
