import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_p8 {

    //List<Persona> Listas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        String rta = "Si";

        List<Persona8> listas  = new ArrayList<>();

        //Persona8 persona1 = new Persona8("Paco", 14, 'M', "Estudiante");
        //listas.add(persona1);

        System.out.println("xddd ando bien, quiero plata");
        
        while (rta == "Si") {

        Persona8 persona1 = new Persona8();
        persona1.pregunto_datos();
        System.out.println("");

        listas.add(persona1);
        persona1.muestro_info();
        System.out.println("");

        System.out.println("Otra persona? Pulse Si o No: ");
        Scanner teclado = new Scanner(System.in);
        rta = teclado.nextLine();
        teclado.close();

        }

    }

}

