package Ejercicios1a10;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite un dia de la semana: ");
        String dia = in.nextLine();
        dia = dia.toLowerCase(Locale.ROOT);
        switch (dia)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El " + dia + " es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El " + dia + " NO es un dia laboral");
                break;
            default:
                System.out.println("Ingrese un dia valido");
        }
    }
}
