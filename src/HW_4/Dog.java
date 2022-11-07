package HW_4;

import javax.swing.*;

public class Dog extends Animal {
    public static int dogCounter;

    Dog() {
        this.name = "Bobic";
        dogCounter++;
    }

    Dog(String name) {
        super (name);
        dogCounter++;
    }

    @Override
    public void run(int lenght) {
        if (lenght < 0) {
            JOptionPane.showMessageDialog(null, "Lengt is less than 0 m");
        }
        else if (lenght <= 500){
            JOptionPane.showMessageDialog(null, "Dog " + this.name + " run " + lenght + " m");
        }
        else {
            JOptionPane.showMessageDialog(null, "Lengt is more than 500 m");
        }
    }

    @Override
    public void swim (int lenght) {
        if (lenght < 0) {
            JOptionPane.showMessageDialog(null, "Lengt is less than 0 m");
        }
        else if (lenght <= 10){
            JOptionPane.showMessageDialog(null, "Dog " + this.name + " swim " + lenght + " m");
        }
        else {
            JOptionPane.showMessageDialog(null, "Lengt is more than 10 m");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
