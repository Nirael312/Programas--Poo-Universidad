import java.util.Scanner;

public class Personaje {
    private String nombre;
    private int fuerza;
    private int inteligencia;
    private int defensa;
    private int vida;

    public Personaje(String nombre, int fuerza, int inteligencia, int defensa, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVida() {
        return vida;
    }

    public void atributos() {
        System.out.println(nombre + ":");
        System.out.println("·Fuerza: " + fuerza);
        System.out.println("·Inteligencia: " + inteligencia);
        System.out.println("·Defensa: " + defensa);
        System.out.println("·Vida: " + vida);
    }

    public void subirNivel(int fuerza, int inteligencia, int defensa) {
        this.fuerza += fuerza;
        this.inteligencia += inteligencia;
        this.defensa += defensa;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void morir() {
        vida = 0;
        System.out.println(nombre + " ha muerto");
    }

    public int daño(Personaje enemigo) {
        return fuerza - enemigo.defensa;
    }

    public void atacar(Personaje enemigo) {
        int daño = this.daño(enemigo);
        enemigo.vida -= daño;
        System.out.println(nombre + " ha realizado " + daño + " puntos de daño a " + enemigo.nombre);
        if (enemigo.estaVivo()) {
            System.out.println("Vida de " + enemigo.nombre + " es " + enemigo.vida);
        } else {
            enemigo.morir();
        }
    }

    public static class Guerrero extends Personaje {
        private int espada;

        public Guerrero(String nombre, int fuerza, int inteligencia, int defensa, int vida, int espada) {
            super(nombre, fuerza, inteligencia, defensa, vida);
            this.espada = espada;
        }

        public void cambiarArma() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elige un arma: (1) Acero Valyrio, daño 8. (2) Matadragones, daño 10");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> espada = 8;
                case 2 -> espada = 10;
                default -> System.out.println("Número de arma incorrecta");
            }
             scanner.close(); // Comentado para no cerrar el scanner en el contexto de la entrada estándar
        }

        @Override
        public void atributos() {
            super.atributos();
            System.out.println("·Espada: " + espada);
        }

        @Override
        public int daño(Personaje enemigo) {
            return getFuerza() * espada - enemigo.getDefensa();
        }
    }

    public static class Mago extends Personaje {
        private final int libro;

        public Mago(String nombre, int fuerza, int inteligencia, int defensa, int vida, int libro) {
            super(nombre, fuerza, inteligencia, defensa, vida);
            this.libro = libro;
        }

        @Override
        public void atributos() {
            super.atributos();
            System.out.println("·Libro: " + libro);
        }

        @Override
        public int daño(Personaje enemigo) {
            return getInteligencia() * libro - enemigo.getDefensa();
        }
    }
}
