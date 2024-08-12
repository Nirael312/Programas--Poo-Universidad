public class Juego {
    public static void combate(Personaje jugador1, Personaje jugador2) {
        int turno = 0;
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\nTurno " + turno);
            System.out.println(">>> Acción de " + jugador1.getNombre() + ":");
            jugador1.atacar(jugador2);
            if (jugador2.estaVivo()) {
                System.out.println(">>> Acción de " + jugador2.getNombre() + ":");
                jugador2.atacar(jugador1);
            }
            turno++;
        }
        if (jugador1.estaVivo()) {
            System.out.println("\nHa ganado " + jugador1.getNombre());
        } else if (jugador2.estaVivo()) {
            System.out.println("\nHa ganado " + jugador2.getNombre());
        } else {
            System.out.println("\nEmpate");
        }
    }

    public static void main(String[] args) {
        Personaje.Guerrero personaje1 = new Personaje.Guerrero("Guts", 20, 10, 4, 100, 4);
        Personaje.Mago personaje2 = new Personaje.Mago("Vanessa", 5, 15, 4, 100, 3);
        Personaje.Guerrero personaje3 = new Personaje.Guerrero("Rox", 20, 5, 20, 300, 2);
        

        personaje1.atributos();
        personaje2.atributos();
        personaje3.atributos();
        

        combate(personaje1, personaje3);
    }
}