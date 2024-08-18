import java.util.Scanner;

public class Persona8 {
    private String nombre;
    private int edad;
    private char genero;
    private String ocupacion;

    //public Persona8(String nombre, int edad, char genero, String ocupacion) {
      //  this.nombre = nombre;
        //this.edad = edad;
        //this.genero = genero;
        //this.ocupacion = ocupacion;
    
    public Persona8() {
    }
    public void pregunto_datos() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("");

        System.out.print("Su edad: ");
        this.edad = teclado.nextInt();
        System.out.print("");


        System.out.print("Estudia o trabaja? Pulse 1 o 2 respectivamente: ");
        int opcion = teclado.nextInt();
        
        while (opcion != 1 && opcion != 2) {
            System.out.print("Ingrese un valor valido, 1 o 2: ");
            opcion = teclado.nextInt();
            System.out.println("");
        }

        switch (opcion) {

            case 1 -> this.ocupacion = "Estudia";
            case 2 -> this.ocupacion = "Trabaja";
            default -> System.out.println("Valor incorrecto");
        }   

        teclado.close();
    }

    public void muestro_info() {
        System.out.println("Su nombre: " + nombre);
        System.out.println("Su edad: " + edad);
        System.out.println("Su ocupacion: " +  ocupacion);
    }
    public String get_nombre() {
        return nombre;
    }
    public int get_edad() {
        return edad;
    }

    public char get_genero() {
        return genero;
    }

    public String get_ocupacion() {
        return ocupacion;
    }

    public void info() {
        System.out.println("Nombre: " + nombre + "/ Sexo: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("Ocupacion: " + ocupacion);
    }
}
