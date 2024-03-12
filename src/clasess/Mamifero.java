package clasess;

public class Mamifero extends Animal{
    private String tipoPelaje;
    private String enCelo;

    public Mamifero(String tipoPelaje, String enCelo) {
        this.tipoPelaje = tipoPelaje;
        this.enCelo = enCelo;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public String getEnCelo() {
        return enCelo;
    }

    public void setEnCelo(String enCelo) {
        this.enCelo = enCelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "tipoPelaje='" + tipoPelaje + '\'' +
                ", enCelo='" + enCelo + '\'' +
                '}';
    }
}

