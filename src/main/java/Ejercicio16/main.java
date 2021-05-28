package Ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner en = new Scanner(System.in);
        System.out.println("Cual es su nombre: ");
        String nombre = in.nextLine();
        System.out.println("Digite su edad: ");
        int edad = in.nextInt();
        System.out.println("Ingrese su genero (H hombre, M mujer)");
        String sexo = en.nextLine();
        System.out.println("Ingrese su peso en Kg: ");
        double peso = in.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = in.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo.toLowerCase(),peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo.toLowerCase());
        Persona persona3 = new Persona();

        //Utilizando los setters para ingresar los parametros de persona 3
        persona3.setNombre("Juan");
        persona3.setEdad(22);
        persona3.setSexo("H");
        persona3.setPeso(64);
        persona3.setAltura(1.79);

        //Persona 1
        System.out.println("La persona uno: ");
        persona1.comprobarIMC(persona1.calcularIMC());
        persona1.comprobarMayorEdad(persona1.esMayorDeEdad());
        System.out.println(persona1.toString() + "\n");

        //Persona 2
        System.out.println("La persona dos: ");
        persona2.comprobarIMC(persona2.calcularIMC());
        persona2.comprobarMayorEdad(persona2.esMayorDeEdad());
        System.out.println(persona2.toString() + "\n");

        //Persona 3
        System.out.println("La persona tres: ");
        persona3.comprobarIMC(persona3.calcularIMC());
        persona3.comprobarMayorEdad(persona3.esMayorDeEdad());
        System.out.println(persona3.toString());

    }
}
