package russian.gb.lessonOOP;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kasper", "Yelow", 2);
//        cat1.name = "Kasper";
//        cat1.color = "Yelow";
//        cat1.age = 2;
        System.out.println("cat1 = " + cat1);
        Vector vector1 = new Vector(2, 3, 4);
        Vector vector2 = new Vector(6, 1, 7);
        vector1.vecpd(vector2);

    }
}