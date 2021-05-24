package Ejercicios1a10;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto: ");
        double precio = in.nextDouble();
        double iva = 0.21;
        double precioIva = precio * iva;
        double precioFinal = precioIva + precio;
        System.out.println("El precio del producto con iva es: " + precioFinal);
    }
}
