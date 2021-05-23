package Ejercicios1a10;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        int num1 = in.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        }
        else if(num1 < num2){
            System.out.println("El numero mayor es: " + num2);
        }
        else {
            System.out.println("Los numeros son iguales");
        }
    }
}
