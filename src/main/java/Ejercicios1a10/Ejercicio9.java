package Ejercicios1a10;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String newfrase = frase.replace('a','e');
        System.out.println(newfrase);
        System.out.println("Escribe una frase");
        String f = in.nextLine();
        System.out.println(newfrase + " " + f);
    }
}
