package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    ArrayList<T> box = new ArrayList();

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    void info() {
        if (box.isEmpty()) {
            System.out.println("Box is empty");
        } else {
            System.out.println("in the box are " + box.get(0).toString() +
                    " in quantity: " + box.size());
        }
    }

    float getWeight() {
        if (box.isEmpty()) {
            return 0;
        } else {
            return box.size() * box.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }
}
