package Ejercicios1a10;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Vamos hallar el area de un circulo");
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo en metros");
        double r = in.nextDouble();
        double area;
        area = Math.PI * (Math.pow(r,2));
        System.out.println("El area del circulo es: " + area + " m^2");

    }
}
