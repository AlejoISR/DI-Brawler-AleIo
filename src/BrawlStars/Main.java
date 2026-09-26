package BrawlStars;

import java.util.ArrayList;
import java.util.Scanner;

public class    Main {

    public static ArrayList<Brawler> brawlers = new ArrayList<>();

    public static void main(String[] args) {


       Scanner scaner = new Scanner(System.in);

        int eleccion;

        do {
            System.out.println("1. Ver Brawlers: ");
            System.out.println("2. Creear  Brawler legendario: ");
            System.out.println("3. Creear Brawler Épico: ");
            System.out.println("4. Combatir: ");
            System.out.println("5. Salir: ");
            System.out.print("Opcion: ");
            eleccion =  scaner.nextInt();

            // Swich de opciones

            switch (eleccion) {

                case 1: MirarBrawler(); break;

                case 2: CrearLegendario(); break;

                case 3: CrearEpico(); break;

                case 4: Combatir(); break;


            }

        }
        while ( eleccion != 5);
    }


    public static void MirarBrawler() {


       if (brawlers.size() == 0) {
           System.out.println("Todavía no hay brawlers creados...\n");
       }
       else for (int i = 0; i < brawlers.size(); i++) {

           System.out.println("["+brawlers.get(i).getNombre()+":"+brawlers.get(i).getVida()+"]");

       }

    }

    public static void CrearLegendario () {

        Scanner scaner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scaner.next();
        System.out.print("Vida: ");
        int vida = scaner.nextInt();
        System.out.print("Daño: ");
        int daño = scaner.nextInt();

        Legendario personajeLegendario = new Legendario(nombre,vida,daño);

        brawlers.add(personajeLegendario);
        }



    public static void CrearEpico() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scaner.next();
        System.out.print("Vida: ");
        int vida = scaner.nextInt();
        System.out.print("Suministro: ");
        int Suministro = scaner.nextInt();

        Epico personajeEpico = new Epico(nombre,vida,Suministro);
        brawlers.add(personajeEpico);


    }

    public static void Combatir( ) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Nombre del brawler 1: ");
        String Nombre1 = scaner.next();

        System.out.print("Nombre del brawler 2: ");
        String Nombre2= scaner.next();

        Brawler luchador1= null;
        Brawler luchador2= null;

        for (int i = 0; i < brawlers.size(); i++) {

            if (brawlers.get(i).getNombre().equals(Nombre1)) {
                luchador1 = brawlers.get(i);
            }
            else if (brawlers.get(i).getNombre().equals(Nombre2)){
                luchador2 = brawlers.get(i);
            }

        }
        if (luchador1 == null || luchador2 == null) {
            System.out.println("Uno de los brawlers no se ha encontrado...");
        } else {
            System.out.println("["+luchador1.getNombre()+":"+luchador1.getVida()+"]");

            System.out.println("["+luchador2.getNombre()+":"+luchador2.getVida()+"]");
        }







        }



    }





