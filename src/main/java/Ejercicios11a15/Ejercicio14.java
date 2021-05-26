package Ejercicios11a15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        List<Integer> listaNumeros = new ArrayList<>();
        int num = in.nextInt();
        int cuenta = num;
        int max = 1000;
        for(int i = num; i<max ; i = i +2) {
            cuenta = cuenta + 2;
            listaNumeros.add(cuenta);
        }
        System.out.println(listaNumeros);
    }
}
