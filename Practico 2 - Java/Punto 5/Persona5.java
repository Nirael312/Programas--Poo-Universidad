
public class Persona5 {
    
    private String Nombre;
    private String Apellido;
    private String Fecha_Nacimiento;

    public Persona5 (String Nombre, String Apellido, String Fecha_Nacimiento) {
        this.Nombre = Nombre; 
        this.Apellido = Apellido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getFecha() {
        return Fecha_Nacimiento;
    }

    public String ToString5() {
        return Nombre + Apellido + " / fecha de nacimiento: " + Fecha_Nacimiento;
    }
}
