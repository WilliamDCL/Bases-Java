public class Main {

    public static void main(String[] args) {
        Head head = new Head("Cabeza de Juan");
        Body body = new Body("Cuerpo de Juan");

        Human human = new Human();
        human.setHead(head);
        human.setBody(body);

        human.show(); 
    }
}
