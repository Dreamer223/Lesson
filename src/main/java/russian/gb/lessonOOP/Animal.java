package russian.gb.lessonOOP;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }


    protected void animalInfo() {
        System.out.println("Животное = " + name);
    }

    public void voice() {
        System.out.println("Животное = " + name + " издало звук!");
    }

    public void jump() {
        System.out.println("Животное = " + name + " подпрыгнуло!");
    }
}
