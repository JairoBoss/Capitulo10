package GameZone1;

public class Alien {
    protected Integer noOjos;
    protected Integer noPatas;
    protected String color;

    public Alien(Integer noOjos, Integer noPatas, String color) {
        this.noOjos = noOjos;
        this.noPatas = noPatas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "noOjos=" + noOjos +
                ", noPatas=" + noPatas +
                ", color='" + color + '\'' +
                '}';
    }
}
