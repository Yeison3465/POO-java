package Museo;

public class Main {
    public static void main(String[] args){
        Obras obra1 = new Obras("pintura", 1890, "Juan ", "Lienso",100.0, 34, 90, 30, 7, 1500000, 450000, "Una pintura que tiene muchos colores ", "Inspiracion");

        obra1.calcularEspacioRequerido();
        obra1.antiguedad(2023,obra1);
    }
}
