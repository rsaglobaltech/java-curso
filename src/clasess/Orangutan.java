package clasess;

public class Orangutan extends Mamifero{

    private boolean enPareja;

    public Orangutan(String tipoPelaje, String enCelo, boolean enpareja) {
        super(tipoPelaje, enCelo);
        this.enPareja = enpareja;
    }
}
