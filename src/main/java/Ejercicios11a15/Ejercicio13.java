package Ejercicios11a15;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {
    public static void main(String[] args) {
        Date fecha = new Date();
        DateFormat fechaFormato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Hora y fecha: " + fechaFormato.format(fecha));
    }
}
