package Taller;

public class Main {
    public static void main(String[] args){
        Vehiculo carro = new Vehiculo("mazda",2020,"rojo","le falta una llanta","Jesus","DIG 60 CALLE 30",300234410);
        Vehiculo carro1 = new Vehiculo("renaul",2014,"blanco","falla de motor","Edgar","Boquilla Calle 13",300534410);

        carro.informacion(2023);
        carro.comparacion(carro, carro1);
        carro.Mostrar_comparacion("h");
    }
}
