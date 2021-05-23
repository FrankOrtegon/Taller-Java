package Ejercicios1a10;



public class Ejercicio1 {
    public static void main(String[] args) {

        var num1 = 4;
        var num2 = 6;

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        }
        else if(num2 > num1){
            System.out.println("El numero mayor es: " + num2);
        }
        else {
            System.out.println("Los numeros son iguales");
        }
    }
}
