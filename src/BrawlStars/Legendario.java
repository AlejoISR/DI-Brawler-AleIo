package BrawlStars;

// 1. HERENCIA: Adquiere las características del Brawler genérico.
public class Legendario extends Brawler {

    // 2. ATRIBUTO EXCLUSIVO: Solo los legendarios tienen estadística de daño para hacer daño masivo.
    private int daño;

    public Legendario(String nombre, int vida, int daño) {
        // 3. SUPER: Delegamos la creación del nombre y la vida al constructor del padre.
        super(nombre, vida);
        this.daño = daño;
    }

    // 4. SOBRESCRITURA (POLIMORFISMO): Versión exclusiva del Legendario para la acción especial (Atacar al rival).
    public void accionEspecial(Brawler enemigo){
        // 5. ATACAR: Apuntamos al enemigo y le cambiamos su salud restándole nuestro daño.
        enemigo.setVida(enemigo.getVida() - this.daño);

        // 6. NARRACIÓN: Imprimimos por consola el daño infligido.
        System.out.println("[" + getNombre() + ":" + getVida() + "] Apply -" + this.daño + " damage to " + enemigo.getNombre());
        System.out.println("[" + enemigo.getNombre() + ":" + enemigo.getVida() + "]\n");
    }
}
