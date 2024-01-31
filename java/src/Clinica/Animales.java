package Clinica;

public class Animales {
    private String tipo;
    private String raza;
    private String nombre;
    private int edad;
    private int peso;
    private String color;
    private String estado;
    public Animales(String tipo, String raza, String nombre, int edad, int peso, String color, String estado) {
        this.tipo = tipo;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void comparar(Animales animal_diferente){
        if(getRaza() == animal_diferente.getRaza() && getTipo() == animal_diferente.getTipo()){
            System.out.println(true);

        }else{
            System.out.println(false);
        }

    }
    public void analgesico(int peso){
        if(peso <10){
            System.out.println("suministrar 5cc");
        }
        else if(peso>=10 && peso<20){
            System.out.println("Suministrar 8cc");
        }
        else if(peso>=20 && peso<30){
            System.out.println("suministrar 12cc");
        }
        else if(peso >= 30){
            System.out.println("suministrar 15cc");
        }
    }
    public void estado(){
        if("sano" == getEstado()){
            System.out.println(getNombre().toUpperCase() + " " +getRaza() + " "+ getEdad() + " " + getTipo() );
        }
        else if ("enfermo" == getEstado() ){
            System.out.println(getNombre() + " "+ getTipo() + " " + getEdad() + " " + getPeso() + " " + getColor());
        }else{
            System.out.println("no se encontra estado");
        }
    }

}
