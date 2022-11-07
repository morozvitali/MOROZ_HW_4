package HW_4;

import javax.swing.JOptionPane;

public class Cat extends Animal {
    public static int catCounter;

    Cat() {
        this.name = "Bobic";
        catCounter++;
    }

    Cat(String name) {
        super(name);
        catCounter++;
    }


    @Override
    public void run(int lenght) {

        if (lenght < 0) {
            JOptionPane.showMessageDialog(null, "Lengt is less than 0 m");
        } else if (lenght <= 200) {
            JOptionPane.showMessageDialog(null, "Cat " + this.name + " run " + lenght + " m");
        } else {
            JOptionPane.showMessageDialog(null, "Lengt is more than 200 m");
        }
    }

    @Override
    public void swim(int lenght) {
        try {
            if (lenght < 0) {
                JOptionPane.showMessageDialog(null, "Lengt is less than 0 m");
            } else if (lenght == 0) {
                JOptionPane.showMessageDialog(null, "Cat " + this.name + " swim " + lenght + " m");
            } else {
                if (lenght > 0) {
                    throw new CatSwimException();
                }
            }
        } catch (CatSwimException e) {
            JOptionPane.showMessageDialog(null, "Cats don't swim");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
