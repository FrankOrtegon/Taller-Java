package Ejercicio16;

import java.util.Locale;

public class Persona {
    private String nombre = "";
    private int edad =0;
    private String DNI = "";
    private String sexo = "H";
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        generarDni();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generarDni();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        comprobarSexo();
    }

    public int calcularIMC() {
        int imc = 0;
        double pesoIdeal = this.peso/(this.altura*this.altura);
        if(pesoIdeal < 20) { imc = -1;}
        else if(pesoIdeal >=20 && pesoIdeal <= 25) { imc = 0; }
        else if(pesoIdeal > 25) { imc = 1; }
        return imc;
    }

    public void comprobarIMC(int imc) {

        if(imc == -1) { System.out.println("Tiene un peso ideal");}
        else if(imc == 0) { System.out.println("Esta por debajo de su peso ideal");}
        else if(imc == 1) { System.out.println("Tiene sobrepeso");}
    }

    public boolean esMayorDeEdad() {
        boolean mayor = true;
        if(this.edad >= 18) { mayor = true;}
        else {mayor = false;}
        return mayor;
    }

    public void comprobarMayorEdad(boolean mayor) {
        if(mayor == true) {System.out.println("Es mayor de edad");}
        else {System.out.println("Es menor de edad");}
    }

    public String comprobarSexo() {
        if(this.sexo.equalsIgnoreCase("")) {this.sexo="H"; }
        else if(this.sexo.equalsIgnoreCase("H")) {this.sexo="H"; }
        else {this.sexo = "M";}
        return this.sexo;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private void generarDni() {

        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        char letraDNI = generaLetraDNI(res);
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
