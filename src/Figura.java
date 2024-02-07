public abstract class Figura {
    protected int ancho, alto; 
    void setDatos(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    void mostrarDatos(){ //Metodo no Abstracto
        System.out.println("El ancho es=> " + this.ancho);
        System.out.println("El alto es=> " + this.alto);
    }
    abstract float calcularArea(); //Metodo Abstracto
}
