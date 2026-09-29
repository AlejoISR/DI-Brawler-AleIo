package BrawlStars;

// 1. HERENCIA: Usamos 'extends' para que el Épico adquiera el nombre, la vida y los métodos del Brawler base genérico.
public class Epico extends Brawler{

    // 2. ATRIBUTO EXCLUSIVO: Solo los épicos tienen una mochila de suministros.
    private int suministro;


    // 3. CONSTRUCTOR HIJO: Pide los 3 datos al crearse.
    public Epico(String nombre, int vida, int suministro) {
        // 4. SUPER: Le manda el nombre y la vida al constructor del Padre para que él se encargue de eso.
        super(nombre, vida);
        this.suministro = suministro;
    }

    // 5. SOBRESCRITURA (POLIMORFISMO): Cambiamos la función vacía del padre por la versión exclusiva del Épico (Curarse).
    public void accionEspecial(Brawler enemigo){
        // 6. CURARSE: Cambiamos nuestra vida sumando la actual + nuestros suministros.
        setVida(getVida() + this.suministro);

        // 7. NARRACIÓN: Imprimimos por consola el resultado de nuestra acción especial.
        System.out.println("[" + getNombre() + ":" + getVida() + "] Increase health to " + getVida());
        System.out.println("[" + enemigo.getNombre() + ":" + enemigo.getVida() + "]\n");
    }
}
