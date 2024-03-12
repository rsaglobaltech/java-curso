import clasess.*;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal jaguar = new Jaguar("A","NO", 101,100);
        Animal chita = new Mamifero("B","SI");

        //Reptiles
        Animal cocodrilo = new Reptil(true,true);
        Animal serpiente = new Serpiente(true,true, false, "Ranas,Patos,huevos");

        //Mamiferos
        Animal elefante = new Mamifero("TIPO_UNO","Si");
        Animal orangutan = new Orangutan("TYPO_DOS","Si", false);


        Jaula<Animal> jaula1 = new Jaula<>();
        jaula1.asignarAnimal(jaguar);
        jaula1.asignarAnimal(chita);

        Jaula<Animal> jaula2 = new Jaula<>();
        jaula2.asignarAnimal(cocodrilo);
        jaula2.asignarAnimal(serpiente);

        Jaula<Animal> jaula3 = new Jaula<>();
        jaula3.asignarAnimal(elefante);
        jaula3.asignarAnimal(orangutan);


        List<Jaula<? extends Animal>> jaulas = List.of(jaula1,jaula2,jaula3);
        Zoologico z = new Zoologico();
        z.setJaulas(jaulas);

        System.out.println("El Zoologico tiene=> " + z.getAnimales());


    }
}
