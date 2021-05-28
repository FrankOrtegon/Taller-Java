package Ejercicio18;

public class main {
    public static void main(String[] args) {


        Serie listaSeries[]=new Serie[5];
        videoJuego listaVideojuegos[]=new videoJuego[5];


        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("One Piece", "Eiichiro Oda");
        listaSeries[2]=new Serie("Casa de papel", 4, "Ciencia Ficcion", "Álex Pina");
        listaSeries[3]=new Serie("Dragon Ball z", 20 ,"Humor", "Seth MacFarlane");
        listaSeries[4]=new Serie("Falcon y el soldado del invierno", 1, "Ciencia Ficcion", "Malcolm Spellman");

        listaVideojuegos[0]=new videoJuego();
        listaVideojuegos[1]=new videoJuego("Assasin creed BrotherHood", 150, "Aventura", "Ubisoft");
        listaVideojuegos[2]=new videoJuego("Skyrim", "Bethesda Game Studios");
        listaVideojuegos[3]=new videoJuego("Pokemon HeartGold", 180, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new videoJuego("PES ", 80, "Deporte", "Konami Computer");

        //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();


        int entregados=0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();

            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor=listaSeries[0];
        videoJuego videojuegoMayor=listaVideojuegos[0];


        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==videoJuego.mayor){
                videojuegoMayor=listaVideojuegos[i];
            }

        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}
