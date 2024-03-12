package clasess;

import java.util.Objects;

public class Serpiente extends Reptil{
    private boolean venenosa;
    private String comida;

    public Serpiente(boolean escamas, boolean carnivoro, boolean venenosa, String comida) {
        super(escamas, carnivoro);
        this.venenosa = venenosa;
        this.comida = comida;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "Serpiente{" +
                "venenosa=" + venenosa +
                ", comida='" + comida + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serpiente serpiente = (Serpiente) o;
        return venenosa == serpiente.venenosa && Objects.equals(comida, serpiente.comida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venenosa, comida);
    }
}
