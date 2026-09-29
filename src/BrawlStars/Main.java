package BrawlStars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 1. EL ALMACÉN: Creamos una lista (ArrayList) compartida para guardar todos los personajes que vayamos creando.
    public static ArrayList<Brawler> brawlers = new ArrayList<>();

    public static void main(String[] args) {

       Scanner scaner = new Scanner(System.in);
       int eleccion;

       // 2. EL BUCLE PRINCIPAL: Usamos 'do-while' para que el menú se muestre infinitamente hasta que el usuario decida salir.
       do {
           // 3. EL MENÚ: Mostramos por pantalla las opciones disponibles.
           System.out.println("1. Ver Brawlers: ");
           System.out.println("2. Creear  Brawler legendario: ");
           System.out.println("3. Creear Brawler Épico: ");
           System.out.println("4. Combatir: ");
           System.out.println("5. Salir: ");
           System.out.println();
           System.out.print("Opcion: ");
           
           // 4. LA ELECCIÓN: Guardamos el número que el usuario escribe en la consola.
           eleccion =  scaner.nextInt();

           // 5. EL DISTRIBUIDOR: Usamos 'switch' para ejecutar una función distinta dependiendo del número elegido.
           switch (eleccion) {
               case 1: MirarBrawler(); break;
               case 2: CrearLegendario(); break;
               case 3: CrearEpico(); break;
               case 4: Combatir(); break;
           }

       } while ( eleccion != 5); // 6. LA SALIDA: Si elige 5, el bucle se rompe y el programa termina.
    }

    public static void MirarBrawler() {
       // 7. VER BRAWLERS: Comprobamos si el almacén está vacío.
       if (brawlers.size() == 0) {
           System.out.println("Todavía no hay brawlers creados...\n");
       }
       else {
           // 8. RECORRER LISTA: Si hay personajes, usamos un bucle 'for' para sacarlos uno a uno e imprimir su nombre y vida.
           for (int i = 0; i < brawlers.size(); i++) {
               System.out.println("["+brawlers.get(i).getNombre()+":"+brawlers.get(i).getVida()+"]");
           }
       }
    }

    public static void CrearLegendario () {
        Scanner scaner = new Scanner(System.in);

        // 9. RECOGER DATOS: Pedimos al usuario las estadísticas del nuevo personaje por consola.
        System.out.print("Nombre: ");
        String nombre = scaner.next();
        System.out.print("Vida: ");
        int vida = scaner.nextInt();
        System.out.print("Daño: ");
        int daño = scaner.nextInt();

        // 10. LA FÁBRICA: Usamos 'new' para crear el objeto Legendario pasándole los datos.
        Legendario personajeLegendario = new Legendario(nombre,vida,daño);

        // 11. GUARDAR: Metemos el personaje terminado en nuestro ArrayList (nuestro almacén).
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

        // 12. PREPARAR COMBATE: Pedimos los nombres de los dos contrincantes.
        System.out.print("Nombre del brawler 1: ");
        String Nombre1 = scaner.next();
        System.out.print("Nombre del brawler 2: ");
        String Nombre2 = scaner.next();

        Brawler luchador1= null;
        Brawler luchador2= null;

        // 13. BUSCADOR: Recorremos el ArrayList comparando los nombres con .equals() para encontrarlos.
        for (int i = 0; i < brawlers.size(); i++) {
            if (brawlers.get(i).getNombre().equals(Nombre1)) {
                luchador1 = brawlers.get(i);
            }
            else if (brawlers.get(i).getNombre().equals(Nombre2)){
                luchador2 = brawlers.get(i);
            }
        }
        
        // 14. VERIFICACIÓN: Si no encontramos a alguno de los dos, cancelamos la pelea dando error.
        if (luchador1 == null || luchador2 == null) {
            System.out.println("Uno de los brawlers no se ha encontrado...");
        } else {
            // 15. PRESENTACIÓN: Imprimimos la salud inicial de ambos luchadores.
            System.out.println("["+luchador1.getNombre()+":"+luchador1.getVida()+"]");
            System.out.println("["+luchador2.getNombre()+":"+luchador2.getVida()+"]\n");
            
            // 16. POLIMORFISMO (ACCIÓN): Damos la orden general y cada uno ejecuta su poder especial automáticamente (uno cura, otro ataca).
            luchador1.accionEspecial(luchador2);
            luchador2.accionEspecial(luchador1);
        }
    }
}
