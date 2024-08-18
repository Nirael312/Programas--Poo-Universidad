public class Main_p5 {

    public static void main(String[] args) {
        
        Persona5 persona1 = new Persona5("Pablo", " Monti", "11/12/2004");
        Persona5 persona2 = new Persona5("Walter", "Toconas", "16/03/1999");
        Persona5 persona3 = new Persona5("Bonifacio", "nose", "11/06/2005");
        System.out.println("Los datos almacenados de esas personas son: ");
        System.out.println(persona1.ToString5());
        System.out.println(persona2.ToString5());
        System.out.println(persona3.ToString5());
        
    }
    
}
