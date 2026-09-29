package BrawlStars;

// 1. CLASE PADRE: Es el molde base (blueprint) del que heredarán el resto de personajes del juego.
public class Brawler {

    // 2. ENCAPSULAMIENTO: Variables 'private' para que nadie pueda cambiar el nombre o la vida sin permiso o por accidente.
    private String nombre;
    private int vida;

    // 3. CONSTRUCTOR: La fábrica que se ejecuta al hacer 'new'. Recibe los datos y los guarda dentro del objeto.
    public Brawler(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    // 4. GETTERS: Funciones de lectura. Permiten que otros archivos vean los datos privados, pero no modificarlos.
    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }


    // 5. SETTER: Función de escritura. Permite cambiar la vida de forma controlada (ej: al recibir daño o curarse).
    public void setVida(int NuevaVida){
        this.vida = NuevaVida;
    }

    // 6. POLIMORFISMO: Método vacío que los hijos (Épico/Legendario) van a sobrescribir con sus propios superpoderes.
    public void accionEspecial(Brawler enemigo){
    }
}