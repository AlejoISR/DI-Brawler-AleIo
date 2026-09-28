package BrawlStars;

// Clase padre genérica de la que heredarán todos los tipos de Brawlers
public class Brawler {

    // Atributos privados (Encapsulamiento) para que no puedan ser modificados desde fuera directamente
    private String nombre;
    private int vida;

    // El Constructor: es la fábrica que pide los datos base para crear el personaje
    public Brawler(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    // Getters: nos permiten "leer" los atributos privados desde otros archivos
    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }

    // Setter: nos permite modificar la vida (ej: al recibir daño o curarse) de forma segura
    public void setVida(int NuevaVida){
        this.vida = NuevaVida;
    }

    // Método genérico que heredarán los hijos para usar el Polimorfismo
    public void accionEspecial(Brawler enemigo){
    }
}
//