package task2;

public abstract class Cat extends Animal{
    public static int countCat;
    public static final int maxRun = 200;
    public static final int maxSwim = 0;


    public Cat(String name) {
        super(name);
        countCat++;
    }

}
