public class Main_p7 {

    public static void main(String[] args) {
        
        Persona7 persona1 = new Persona7("Pablo", " Monti", "11/12/2004");
        Persona7 persona2 = new Persona7("Walter", "Toconas", "16/03/1999");
        Persona7 persona3 = new Persona7("Bonifacio", "nose", "11/06/2005");
        System.out.println("Los datos almacenados de esas personas son: ");
        System.out.println(persona1.ToString7());
        System.out.println(persona2.ToString7());
        System.out.println(persona3.ToString7());
        
    }
    
}
