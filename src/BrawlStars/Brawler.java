package BrawlStars;

public  class Brawler{

    private String nombre;
    private int  vida;

    public Brawler(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return this.nombre;


    }
    public int getVida() {
        return this.vida;
    }




    public void setVida(int NuevaVida){
        this.vida = NuevaVida;

    }

    public void accionEspecial(Brawler enemigo){

    }

}



