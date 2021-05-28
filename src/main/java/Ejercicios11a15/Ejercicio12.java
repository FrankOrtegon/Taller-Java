package Ejercicios11a15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la primera palabra: ");
        String palabra1 = in.nextLine();
        System.out.println("Escriba la segunda palabra: ");
        String palabra2 = in.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes");
            List<Character> letrasDiferentes1 = new ArrayList<>();
            List<Character> letrasDiferentes2 = new ArrayList<>();
            int longi = mayor(palabra1, palabra2);
            lista(palabra1, palabra2, letrasDiferentes1, letrasDiferentes2, longi);

            if (palabra1.length() < palabra2.length()) {
                for (int x = longi; x < palabra2.length(); x++) {
                    char letra2 = palabra2.charAt(x);
                    letrasDiferentes2.add(letra2);
                }
            } else if(palabra1.length() > palabra2.length()){
                for (int x = longi; x < palabra1.length(); x++) {
                    char letra1 = palabra1.charAt(x);
                    letrasDiferentes1.add(letra1);
                }
            }
            System.out.println("Letras diferentes en la palabra uno: " + letrasDiferentes1);
            System.out.println("Letras diferentes en la palabra dos: " + letrasDiferentes2);
        }
    }

    private static void lista(String palabra1, String palabra2, List<Character> letrasDiferentes1, List<Character> letrasDiferentes2, int longi) {
        for (int x = 0; x < longi; x++) {
            char letra1 = palabra1.charAt(x);
            char letra2 = palabra2.charAt(x);
            if (letra1 != letra2) {
                letrasDiferentes1.add(letra1);
                letrasDiferentes2.add(letra2);
            }
        }
    }

    public static int mayor (String palabra1, String palabra2){
        int tamano = 0;

        if (palabra1.length() < palabra2.length()) {
            tamano = palabra1.length();
        } else {
            tamano = palabra2.length();
        }

        return tamano;
    }
}

