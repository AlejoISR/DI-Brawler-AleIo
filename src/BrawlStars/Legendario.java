package BrawlStars;

public class Legendario extends Brawler {

   private  int daño;

    public Legendario(String nombre, int vida, int daño) {
        super(nombre, vida);
        this.daño = daño;
    }


    public void accionEspecial(Brawler enemigo){

        enemigo.setVida(enemigo.getVida()-this.daño);
        System.out.println("[" + getNombre() + ":" + getVida() + "] Apply -" + this.daño + " damage to " + enemigo.getNombre());
        System.out.println("[" + enemigo.getNombre() + ":" + enemigo.getVida() + "]\n");
    }


    }

