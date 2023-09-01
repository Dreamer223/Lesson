package task2;
public class HomeCat extends Cat{
    public HomeCat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");
    }

    @Override
    public void run(int distance) {
        if (distance<maxRun){
            System.out.println("Кот "+ name+" пробежал"+ distance);
        }
        else {
            System.out.println("Кот "+ name+" не смог пробежать" + distance+" метров");
        }

    }
}
