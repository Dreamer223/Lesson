package task2;

public class Dog extends Animal {
    public static int countDog;
    public static final int maxRun=500;
    public static final int maxSwim=10;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if (distance<maxSwim){
            System.out.println("Собака "+ name+" проплыл"+ distance);
        }
        else {
            System.out.println("Собака "+ name+" не смог проплыть" + distance+" метров");
        }
    }

    @Override
    public void run(int distance) {
        if (distance<maxRun){
            System.out.println("Собака "+ name+" пробежал"+ distance);
        }
        else {
            System.out.println("Собака "+ name+" не смог пробежать" + distance+" метров");
        }

    }
}
