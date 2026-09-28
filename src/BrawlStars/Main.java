package BrawlStars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // ArrayList compartido: Actúa como el "almacén" donde guardamos todos los brawlers que vayamos creando
    public static ArrayList<Brawler> brawlers = new ArrayList<>();

    public static void main(String[] args) {

       Scanner scaner = new Scanner(System.in);
       int eleccion;

       // Bucle do-while: Mantiene el menú activo repitiéndose infinitamente hasta que el usuario elija salir (opción 5)
       do {
           System.out.println("1. Ver Brawlers: ");
           System.out.println("2. Creear  Brawler legendario: ");
           System.out.println("3. Creear Brawler Épico: ");
           System.out.println("4. Combatir: ");
           System.out.println("5. Salir: ");
           System.out.print("Opcion: ");
           eleccion =  scaner.nextInt();

           // Switch: Funciona como un "distribuidor" que nos manda a la función correcta dependiendo del número elegido
           switch (eleccion) {
               case 1: MirarBrawler(); break;
               case 2: CrearLegendario(); break;
               case 3: CrearEpico(); break;
               case 4: Combatir(); break;

           }

       } while ( eleccion != 5);
    }

    // Función para mostrar por pantalla todos los personajes que hay guardados en nuestro almacén
    public static void MirarBrawler() {
       // Si la lista está vacía (tamaño 0), avisamos al usuario
       if (brawlers.size() == 0) {
           System.out.println("Todavía no hay brawlers creados...\n");
       }
       // Si hay brawlers, usamos un bucle for para recorrer la lista uno a uno e imprimirlos
       else {
           for (int i = 0; i < brawlers.size(); i++) {
               System.out.println("["+brawlers.get(i).getNombre()+":"+brawlers.get(i).getVida()+"]");
           }
       }
    }

    // Función para pedir datos por consola y fabricar un personaje Legendario
    public static void CrearLegendario () {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scaner.next();
        System.out.print("Vida: ");
        int vida = scaner.nextInt();
        System.out.print("Daño: ");
        int daño = scaner.nextInt();

        // Llamamos al constructor pasándole los datos del Scanner para que fabrique el personaje
        Legendario personajeLegendario = new Legendario(nombre,vida,daño);

        // Metemos al personaje recién creado en nuestro ArrayList
        brawlers.add(personajeLegendario);
    }

    // Función para pedir datos por consola y fabricar un personaje Épico
    public static void CrearEpico() {
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = scaner.next();
        System.out.print("Vida: ");
        int vida = scaner.nextInt();
        System.out.print("Suministro: ");
        int Suministro = scaner.nextInt();

        // Fabricamos el personaje y lo guardamos en la lista
        Epico personajeEpico = new Epico(nombre,vida,Suministro);
        brawlers.add(personajeEpico);
    }

    // Función donde hacemos pelear a dos personajes elegidos por el usuario
    public static void Combatir( ) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Nombre del brawler 1: ");
        String Nombre1 = scaner.next();
        System.out.print("Nombre del brawler 2: ");
        String Nombre2 = scaner.next();

        // Preparamos dos variables vacías para guardar a los luchadores en caso de encontrarlos
        Brawler luchador1= null;
        Brawler luchador2= null;

        // Bucle for para buscar por todo el ArrayList si los nombres coinciden con lo que hemos escrito
        for (int i = 0; i < brawlers.size(); i++) {
            // Usamos .equals() porque en Java los textos (Strings) no se pueden comparar con ==
            if (brawlers.get(i).getNombre().equals(Nombre1)) {
                luchador1 = brawlers.get(i);
            }
            else if (brawlers.get(i).getNombre().equals(Nombre2)){
                luchador2 = brawlers.get(i);
            }
        }
        
        // Si al terminar de buscar, alguno sigue vacío (null), cancelamos el combate dando error
        if (luchador1 == null || luchador2 == null) {
            System.out.println("Uno de los brawlers no se ha encontrado...");
        } else {
            // Presentación de los luchadores con sus vidas intactas antes de pelear
            System.out.println("["+luchador1.getNombre()+":"+luchador1.getVida()+"]");
            System.out.println("["+luchador2.getNombre()+":"+luchador2.getVida()+"]\n");
            
            // Usamos el Polimorfismo: Damos la misma orden general a ambos y cada uno obedece a su manera
            luchador1.accionEspecial(luchador2);
            luchador2.accionEspecial(luchador1);
        }
    }
}
