package BrawlStars;

public class Legendario extends Brawler {

    // Atributo exclusivo de los personajes Legendarios
    private int daño;

    public Legendario(String nombre, int vida, int daño) {
        // Llamamos al constructor del padre (Brawler) para inicializar nombre y vida
        super(nombre, vida);
        this.daño = daño;
    }

    // Sobrescribimos el método genérico del padre (Polimorfismo) para hacer que el Legendario ataque
    public void accionEspecial(Brawler enemigo){
        // Apuntamos al enemigo y le cambiamos su salud: su vida actual MENOS nuestro daño
        enemigo.setVida(enemigo.getVida() - this.daño);

        // Imprimimos la narración del golpe por pantalla
        System.out.println("[" + getNombre() + ":" + getVida() + "] Apply -" + this.daño + " damage to " + enemigo.getNombre());
        System.out.println("[" + enemigo.getNombre() + ":" + enemigo.getVida() + "]\n");
    }
}

//