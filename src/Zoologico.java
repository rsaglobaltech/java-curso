import clasess.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Jaula<? extends Animal>> jaulas = new ArrayList<>();

    public List<Jaula<? extends Animal>> getJaulas() {
        return jaulas;
    }

    public void setJaulas(List<Jaula<? extends Animal>> jaulas) {
        this.jaulas = jaulas;
    }

    public List<Jaula<? extends Animal>> getAnimales(){
        return this.jaulas;
    }


}
