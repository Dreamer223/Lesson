package task2;

public class Tiger extends Cat{
    public static final int maxSwimTiger = 100;
    public static final int maxRunTiger = 600;
    public Tiger(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void swim(int distance) {
        if (distance<maxSwimTiger){
            System.out.println("Тигр "+name+ "проплыл "+ distance);
        }
        else {
            System.out.println("Тигр "+name+" не проплыл"+ distance);
        }
    }

    @Override
    public void run(int distance) {
        if (distance<maxRunTiger){
            System.out.println("Тигр "+ name+" пробежал"+ distance);
        }
        else {
            System.out.println("Тигр  "+ name+" не смог пробежать" + distance+" метров");
        }

    }
}
