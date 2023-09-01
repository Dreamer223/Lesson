package task2;

public abstract class Animal {
    String name;
    public static int count;
    public Animal(String name){
        this.name=name;
        count++;
    }
    public abstract void swim(int distance);
    public abstract void run(int distance);
}
