public class Persona {
    private String nombre;
    private double altura;
    private int edad;
    private String genero;

   
    public Persona(String nombre, double altura, int edad, String genero) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0) { 
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor que cero.");
        }
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0) { 
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Altura: " + altura);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }
}
