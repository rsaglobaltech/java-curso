import java.util.ArrayList;
import java.util.List;

public class Jaula<T> {
    private List<T> contenido = new ArrayList<>() ;
    private int capacidad = 3;

    T asignarAnimal(T animal) throws Exception {
        if(contenido.size() < capacidad){
            contenido.add(animal);
        }else{
            throw new Exception("La Jaula esta llena...");
        }
        return animal;
    }

    @Override
    public String toString() {
        return "Jaula{" +
                "contenido=" + contenido +
                ", capacidad=" + capacidad +
                '}';
    }

    void vaciarJaula(){
        this.contenido = null;
    }

}
