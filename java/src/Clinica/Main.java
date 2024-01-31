package Clinica;

public class Main {
    public static void main(String[] args){
        Animales perro = new Animales("mamifero","labrador","luffy",5,50,"negro","sano");
        Animales gato = new Animales("felino","Elfo","michi",8,20,"blanco","enfermo");
        perro.comparar(gato);
        perro.analgesico(2);
        perro.estado();
        gato.estado();
    }
    
}
