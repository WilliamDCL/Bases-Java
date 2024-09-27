public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 1.75, 30, "Masculino");

        persona.mostrarInfo();
        persona.setAltura(1.80);
        persona.setEdad(31);

        System.out.println("\nInformación actualizada:");
        persona.mostrarInfo();
    }
}
