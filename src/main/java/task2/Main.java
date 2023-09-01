package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(Arrays.asList(new HomeCat("Barsik"),
                new Tiger("Tigr"),
                new Dog("Bobik"),
                new HomeCat("Kasper")));
        for(Animal animal : animals){
            animal.run(150);
            animal.swim(20);
        }
    }
}
