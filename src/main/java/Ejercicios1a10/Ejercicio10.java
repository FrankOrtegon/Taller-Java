package Ejercicios1a10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = in.nextLine();
        String newfrase = frase.replace(" ","");
        System.out.println(newfrase);
    }
}
