public class Flower {
    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public Flower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
