package Ejercicios1a10;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main (String[] args) {
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        int max = 100;
        int cont = 1;
        while (cont <= max) {
            if (cont % 2 == 0) {
                numerosPares.add(cont);
            }
            else {
                numerosImpares.add(cont);
            }
            cont++;

        }
        System.out.println("Los numeros pares son: " + numerosPares);
        System.out.println("Los numeros impares son: " + numerosImpares);

    }

}
