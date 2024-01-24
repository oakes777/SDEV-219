public class Apple extends Fruit {
    private boolean peeled;

    public Apple(String name, String grownAt,
                 boolean peeled) {
        super(name, grownAt);
        this.peeled=peeled;
    }

    public boolean isPeeled() {return peeled;}

    //toString method
    public String toString() {
        String fruitName = getName();
        String grownAt = getGrownAt();

        return fruitName + " grown - " + grownAt + "skin is peeled? " +peeled;
    }
}

