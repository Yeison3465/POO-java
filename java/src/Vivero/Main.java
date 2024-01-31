package Vivero;

public class Main {
    public static void main(String[] args){
        Plantas platas1 = new Plantas(14, 2, 7, 30, "x", "z", "verde", "ordinario");
        
        platas1.informacion();
        platas1.informacioncorta();
        platas1.altura(platas1);
    }
}
