public class Oil {
   private String type;  

   public Oil(String type) {
       this.type = type;
   }

   public String getType() {
       return type;
   }

   public void add() {
       System.out.println("Aceite de tipo: " + type);
   }
}
