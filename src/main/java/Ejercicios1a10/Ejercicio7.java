package Ejercicios1a10;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero mayor o igual a 0: ");
            num = in.nextInt();
        } while (num<=0);
            System.out.println(num);
    }
}
