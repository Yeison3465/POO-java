package Taller;

public class Vehiculo {
    private String marca;
    private int modelo;
    private String color;
    private String falla_dectetada;
    private String nombre_del_propietario;
    private String dirrecion_del_propietario;
    private int telefono_del_propietario;
    public Vehiculo(String marca, int modelo, String color, String falla_dectetada, String nombre_del_propietario,
            String dirrecion_del_propietario, int telefono_del_propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.falla_dectetada = falla_dectetada;
        this.nombre_del_propietario = nombre_del_propietario;
        this.dirrecion_del_propietario = dirrecion_del_propietario;
        this.telefono_del_propietario = telefono_del_propietario;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFalla_dectetada() {
        return falla_dectetada;
    }
    public void setFalla_dectetada(String falla_dectetada) {
        this.falla_dectetada = falla_dectetada;
    }
    public String getNombre_del_propietario() {
        return nombre_del_propietario;
    }
    public void setNombre_del_propietario(String nombre_del_propietario) {
        this.nombre_del_propietario = nombre_del_propietario;
    }
    public String getDirrecion_del_propietario() {
        return dirrecion_del_propietario;
    }
    public void setDirrecion_del_propietario(String dirrecion_del_propietario) {
        this.dirrecion_del_propietario = dirrecion_del_propietario;
    }
    public int getTelefono_del_propietario() {
        return telefono_del_propietario;
    }
    public void setTelefono_del_propietario(int telefono_del_propietario) {
        this.telefono_del_propietario = telefono_del_propietario;
    }
    public void informacion(int año ){
        int resultado = año - getModelo();
        if(resultado >=5){
            System.out.println(getMarca()+ " "+ getNombre_del_propietario() + " "+ getFalla_dectetada());
        }
        else if(resultado >2 && resultado<5){
            System.out.println(getNombre_del_propietario() + " " + getFalla_dectetada().toUpperCase());
        }
        else if(resultado <= 2){
            System.out.println(getMarca()+ " "+ getFalla_dectetada());
        }
    }
    public void comparacion(Vehiculo uno , Vehiculo dos ){
        if(uno.getMarca() == dos.getMarca()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
    public void Mostrar_comparacion(String uno){
        if (marca.equalsIgnoreCase(uno)) {
            System.out.println(modelo + "-" + color.toUpperCase());
        } else {
            System.out.println("Objeto no pertenece a la marca suministrada");
        }
    }
}
