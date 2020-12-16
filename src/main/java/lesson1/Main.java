package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //task #1
    private static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 > array.length ||
                index2 < 0 || index2 > array.length || index1 == index2) {
            System.out.println("Неправильно указаны позиции элементов для замены");
        } else {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    //task #2
    private static <E> List<E> convertToList(E[] array) {
        return new ArrayList<E>(Arrays.asList());
    }


    public static void main(String[] args) {

        //task #1

        String[] arr = {"one", "two", "three", "four", "five", "six"};
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        //task #2

        convertToList(arr);
        System.out.println(arr.getClass());

     //task #3
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox1 = new Box<>(new Orange(), new Orange());
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox1.addFruit(new Orange());
        System.out.println("A box of apples weighs " + appleBox.getWeight());
        System.out.println("A box of oranges weight " + orangeBox1.getWeight());
        System.out.println(appleBox.compare(orangeBox1));
        orangeBox1.replaceFruitsToAnotherBox(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
    }
}
