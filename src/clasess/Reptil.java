package clasess;

public class Reptil extends Animal{
    private boolean escamas;
    private boolean carnivoro;

    public Reptil(boolean escamas, boolean carnivoro) {
        this.escamas = escamas;
        this.carnivoro = carnivoro;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "escamas=" + escamas +
                ", carnivoro=" + carnivoro +
                '}';
    }
}
