package advancedinterfaces;

public interface ReproductorMusica extends Reproductor {
    default public void siguiente() {
        System.out.println("siguiente canción del Reproductor de Música");
    } 
}   
