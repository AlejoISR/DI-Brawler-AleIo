package BrawlStars;

public class Epico extends Brawler{

    // Atributo exclusivo de los personajes Épicos
    private int suministro;

    public Epico(String nombre, int vida, int suministro) {
        // Llamamos al constructor del padre (Brawler) para inicializar nombre y vida
        super(nombre, vida);
        this.suministro = suministro;
    }

    // Sobrescribimos el método genérico del padre (Polimorfismo) para hacer que el Épico se cure
    public void accionEspecial(Brawler enemigo){
        // Modificamos nuestra vida sumando la vida actual más los suministros de nuestra mochila
        setVida(getVida() + this.suministro);

        // Imprimimos la narración de la cura por pantalla
        System.out.println("[" + getNombre() + ":" + getVida() + "] Increase health to " + getVida());
        System.out.println("[" + enemigo.getNombre() + ":" + enemigo.getVida() + "]\n");
    }
}