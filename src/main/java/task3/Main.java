package task3;

public class Main  {
    public static void main(String[] args) {
        Fruit fruit = Fruit.Banana;
        switch (fruit)
        {
            case Apple -> System.out.println("Яблоко"+fruit.getName());
            case Lemon -> System.out.println("Лемон"+fruit.getName());
            case Peach -> System.out.println("Персик"+fruit.getName());
            case Banana -> System.out.println("Банан"+fruit.getName());
            case Orange -> System.out.println("Апельсин"+fruit.getName());
            case Pineapple -> System.out.println("Ананас"+fruit.getName());
            default -> System.out.println("Неопознаный фрукт");
        }
    }
}
