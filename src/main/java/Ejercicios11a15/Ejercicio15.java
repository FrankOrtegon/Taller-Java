package Ejercicios11a15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean t = true;
        menu();
        while(t) {
            System.out.println("Ingrese una opcion: ");
            String opcion = in.nextLine();

          switch (opcion) {
              case "1" : menu(); break;
              case "2" : menu(); break;
              case "3" : menu(); break;
              case "4" : menu(); break;
              case "5" : menu(); break;
              case "6" : menu(); break;
              case "7" : menu(); break;
              case "8" : t = false; break;

              default: System.out.println("OPCION INCORRECTO");
          }
      }

    }
    private static void menu(){
        System.out.println("**************GESTION DE CINEMATOGRAFICA**********************");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }
}
