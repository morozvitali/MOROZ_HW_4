package HW_4;

public abstract class Animal {
    String name;
    public static int animalCounter;

    public Animal() {
        animalCounter++;
    }

    public Animal (String name) {
        this.name = name;
        animalCounter++;
    }


    abstract void run(int lenght);
    abstract void swim(int lenght);

}
