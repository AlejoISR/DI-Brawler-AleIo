package BrawlStars;

public class Epico extends Brawler{

    private int suministro;

    public Epico(String nombre, int vida, int suministro) {
        super(nombre, vida);
        this.suministro= suministro;
    }


    public void accionEspecial(Brawler enemigo){
       setVida(getVida()+ this.suministro);
        System.out.println("[" + getNombre() + ":" + getVida() + "] Increase health to " + getVida());
        System.out.println("[" + enemigo.getNombre() + ":" + enemigo.getVida() + "]\n");


    }
}