package Ejercicios11a15;

import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio11 {
    public static void main(String[] args) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;
        Scanner in = new Scanner(System.in);
        out.println("Escriba una frase: ");
        String frase = in.nextLine();
        int num = frase.length();
        out.println("La longitud de la frase es: " + num);

        for (int x = 0; x < frase.length(); x++) {
            char minusculaFrase = frase.toLowerCase().charAt(x);
            switch (minusculaFrase) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
                default:
                    break;
            }
        }
        out.println("Hay " + a + " vocal a");
        out.println("Hay " + e + " vocal e");
        out.println("Hay " + i + " vocal i");
        out.println("Hay " + o + " vocal o");
        out.println("Hay " + u + " vocal u");
    }
}
