package task3;

public enum Fruit {
    Apple("Яблоко"), Banana, Pineapple, Orange, Peach, Lemon;
    private String name;

    private Fruit(String name) {
        this.name = name;
    }

    Fruit() {
    }

    public String getName() {
        return name;
    }
}
