package clasess;

public class Jaguar extends Mamifero{
    private int numeroManchas;
    private int numeroDientes;

    public Jaguar(String tipoPelaje, String enCelo, int numeroManchas, int numeroDientes) {
        super(tipoPelaje, enCelo);
        this.numeroDientes = numeroDientes;
        this.numeroManchas = numeroManchas;

    }

    public int getNumeroManchas() {
        return numeroManchas;
    }

    public void setNumeroManchas(int numeroManchas) {
        this.numeroManchas = numeroManchas;
    }

    public int getNumeroDientes() {
        return numeroDientes;
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "numeroManchas=" + numeroManchas +
                ", numeroDientes=" + numeroDientes +
                '}';
    }

    public void setNumeroDientes(int numeroDientes) {
        this.numeroDientes = numeroDientes;
    }
}
