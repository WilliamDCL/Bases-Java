public class Human {
    private Head head;   
    private Body body;  

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void show() {
        if (head != null && body != null) {
            System.out.println("Humano con cabeza: " + head.getName() + " y cuerpo: " + body.getName());
        } else {
            System.out.println("Humano Incompleto: Cabeza o cuerpo perdido");
        }
    }
}
