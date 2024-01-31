package Vivero;


public class Plantas {
    private Integer codigo;
    private Integer altura;
    private double diametro_cuello;
    private double volumen;
    private String nombre_cientifico;
    private String nombre_popular;
    private String color_hoja;
    private String tipo;
    public Plantas(Integer codigo, Integer altura, double diametro_cuello, double volumen, String nombre_cientifico,
            String nombre_popular, String color_hoja, String tipo) {
        this.codigo = codigo;
        this.altura = altura;
        this.diametro_cuello = diametro_cuello;
        this.volumen = volumen;
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_popular = nombre_popular;
        this.color_hoja = color_hoja;
        this.tipo = tipo;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getAltura() {
        return altura;
    }
    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    public double getDiametro_cuello() {
        return diametro_cuello;
    }
    public void setDiametro_cuello(double diametro_cuello) {
        this.diametro_cuello = diametro_cuello;
    }
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public String getNombre_cientifico() {
        return nombre_cientifico;
    }
    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
    public String getNombre_popular() {
        return nombre_popular;
    }
    public void setNombre_popular(String nombre_popular) {
        this.nombre_popular = nombre_popular;
    }
    public String getColor_hoja() {
        return color_hoja;
    }
    public void setColor_hoja(String color_hoja) {
        this.color_hoja = color_hoja;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void informacion(){
        System.out.println(codigo +": "+ "\n" +nombre_cientifico+ "\n" + nombre_popular + "\n" + " altura: " +altura + "diametro: " +diametro_cuello+" Volumen: "+volumen+" color de hoja: " +color_hoja);
    }
    public void informacioncorta(){
        System.out.println(codigo+ ":" + "\n" + nombre_popular + "\n" + " ----------------------" + "\n"  +" Color de hoja: " +color_hoja+ "  tipo: " + tipo);
    }

    public void altura(Plantas uno){
        if(uno.getAltura()>200){
            System.out.println("para exteriores");
        }
        else{
            System.out.println("Interiores");
        }

    }
}
