package Ejercicio18;

public class videoJuego implements interfazEntregable {

    private final static int horasEstimadasDef = 100;

    public final static int mayor =1;
    public final static int menor =-1;
    public final static int igual =0;


    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getHorasEstimadas() {
        return horasEstimadas;
    }


    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getCompania() {
        return compania;
    }


    public void setCompaniaia(String compania) {
        this.compania = compania;
    }


    @Override
    public void entregar() {
        entregado=true;
    }


    @Override
    public void devolver() {
        entregado=false;
    }


    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }


    @Override
    public int compareTo(Object a) {
        int estado= menor;

        videoJuego ref=(videoJuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado= mayor;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado= igual;
        }

        return estado;
    }

    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+ compania;
    }


    public boolean equals(videoJuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())){
            return true;
        }
        return false;
    }


    public videoJuego(){
        this("", horasEstimadasDef, "", "");
    }


    public videoJuego(String titulo, String compania){
        this(titulo, horasEstimadasDef, "", compania);
    }


    public videoJuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compania = compania;
        this.entregado=false;
    }


}

