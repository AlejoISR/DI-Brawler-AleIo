package BrawlStars;

public class Epico extends Brawler{

    private int suministro;

    public Epico(String nombre, int vida, int suministro) {
        super(nombre, vida);
        this.suministro= suministro;
    }


    public void usarsuministro(){
       setVida(getVida()+ this.suministro);

    }
}