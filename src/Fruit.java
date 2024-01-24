public class Fruit extends Edible {
    private String grownAt;

    public Fruit(String name, String grownAt) {
        super(name);
        this.grownAt=grownAt;
    }

    public String getGrownAt() {
        return grownAt;
    }

    //toString method
    public String toString() {
        return grownAt;
    }
}
