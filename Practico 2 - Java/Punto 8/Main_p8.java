import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_p8 {

    //List<Persona> Listas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int rta = 1;

        List<Persona8> listas = new ArrayList<>();

        //Persona8 persona1 = new Persona8("Paco", 14, 'M', "Estudiante");
        //listas.add(persona1);

        System.out.println("xddd ando bien, quiero plata");
        Scanner teclado = new Scanner(System.in);

        while (rta == 1) {

        Persona8 persona1 = new Persona8();
        persona1.pregunto_datos();
        System.out.println("");

        listas.add(persona1);
        persona1.muestro_info();
        System.out.println("");

        System.out.println("Otra persona? Pulse 1 para Si o 2 para No: ");

        rta = teclado.nextInt();
        teclado.nextLine();
        }
        teclado.close();
        
    }

}

