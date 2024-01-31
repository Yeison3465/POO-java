package Museo;

public class Obras {
    private String tipo; 
    private int año_de_creación; 
    private String autor; 
    private String material; 
    private Double altura; 
    private int peso; 
    private int ancho; 
    private int diámetro; 
    private int espesor; 
    private double valor_comercial; 
    private double valor_histórico; 
    private String descripción; 
    private String título_de_obra;
    public Obras(String tipo, int año_de_creación, String autor, String material, Double altura, int peso, int ancho,
            int diámetro, int espesor, double valor_comercial, double valor_histórico, String descripción,
            String título_de_obra) {
        this.tipo = tipo;
        this.año_de_creación = año_de_creación;
        this.autor = autor;
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.ancho = ancho;
        this.diámetro = diámetro;
        this.espesor = espesor;
        this.valor_comercial = valor_comercial;
        this.valor_histórico = valor_histórico;
        this.descripción = descripción;
        this.título_de_obra = título_de_obra;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAño_de_creación() {
        return año_de_creación;
    }
    public void setAño_de_creación(int año_de_creación) {
        this.año_de_creación = año_de_creación;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getDiámetro() {
        return diámetro;
    }
    public void setDiámetro(int diámetro) {
        this.diámetro = diámetro;
    }
    public int getEspesor() {
        return espesor;
    }
    public void setEspesor(int espesor) {
        this.espesor = espesor;
    }
    public double getValor_comercial() {
        return valor_comercial;
    }
    public void setValor_comercial(double valor_comercial) {
        this.valor_comercial = valor_comercial;
    }
    public double getValor_histórico() {
        return valor_histórico;
    }
    public void setValor_histórico(double valor_histórico) {
        this.valor_histórico = valor_histórico;
    }
    public String getDescripción() {
        return descripción;
    }
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    public String getTítulo_de_obra() {
        return título_de_obra;
    }
    public void setTítulo_de_obra(String título_de_obra) {
        this.título_de_obra = título_de_obra;
    }
    public void calcularEspacioRequerido() {
        double espacio = altura * ancho * peso;
        System.out.println(espacio);
    }

    public void antiguedad(int uno, Obras dos){
        if(uno <=10){
            System.out.println("Contemporaneo");
            System.out.println(dos.getTítulo_de_obra() + " " + dos.getDescripción() );
        }
        else if(uno >= 10 && uno<30){
            System.out.println("Arte moderno");
        }
        else if(uno >= 30 && uno<100){
            System.out.println("Antiguo");
        }
        else if(uno >=100){
            System.out.println("Reliquia");
            System.out.println(dos.getAutor()+ " " + dos.getTítulo_de_obra().toUpperCase() + " " + dos.getMaterial() );
        }
    }
    

}
