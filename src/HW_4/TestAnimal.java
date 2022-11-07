package HW_4;

import java.util.ArrayList;

public class TestAnimal {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Cat ("Tom"));
        animals.add(new Cat ("Sam"));
        animals.add(new Cat ("Neal"));

        System.out.println(" Total Animal Counter" + Animal.animalCounter);
        System.out.println(" Total Cat Counter" + Cat.catCounter);
        System.out.println(" Total Dog Counter" + Dog.dogCounter);

        animals.add(new Dog ("Bobi"));
        animals.add(new Dog ("Robi"));
        animals.add(new Dog ("Einstein"));
        animals.add(new Dog ("Nordy"));
        animals.add(new Dog ("Marty"));

        System.out.println(" Total Animal Counter" + Animal.animalCounter);
        System.out.println(" Total Cat Counter" + Cat.catCounter);
        System.out.println(" Total Dog Counter" + Dog.dogCounter);

        System.out.println(animals.toString());

        Dog Jhony = new Dog();
        Jhony.swim(2);
        Jhony.run(496);

        Cat Tom = new Cat ();
        Tom.swim(1);
        Tom.run(111);


    }
}
