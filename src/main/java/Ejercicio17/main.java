package Ejercicio17;

public class main {
    public static void main(String[] args) {
        Electrodomesticos listaElectrodomesticos[] =new Electrodomesticos[10];
        listaElectrodomesticos[0]=new Electrodomesticos(200, "Rojo", 'C', 50);
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, "Azul", 'E', 35, 42, false);
        listaElectrodomesticos[3]=new Electrodomesticos();
        listaElectrodomesticos[4]=new Electrodomesticos(600, "Negro", 'D', 60);
        listaElectrodomesticos[5]=new Lavadora(300, "Blanco", 'Z', 80, 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, "Gris", 'A', 25, 15);
        listaElectrodomesticos[8]=new Television(200, "Rojo", 'C', 40, 30, true);
        listaElectrodomesticos[9]=new Electrodomesticos(50, 10);

        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        System.out.println("La suma del precio de los electrodomesticos es de: €"+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de: €"+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de: €"+sumaTelevisiones);

    }

}

