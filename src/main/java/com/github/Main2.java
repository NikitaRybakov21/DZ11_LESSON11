package com.github;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();

        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();
        Orange or4 = new Orange();

        Box<Apple> boxApple = new Box<>(1.0f);
        Box<Orange> boxOrange = new Box<>(1.5f);

        boxApple.put(ap1);
        boxApple.put(ap2);
        boxApple.put(ap3);

        boxOrange.put(or1);
        boxOrange.put(or2);
        boxOrange.put(or3);
        boxOrange.put(or4);

        System.out.println("Mass " + boxApple.getWeight());
        System.out.println("Mass " + boxOrange.getWeight());
        System.out.println(boxApple.compare(boxOrange));

        System.out.println(boxApple.list.size());

        Box<Apple> boxApple2 = new Box<>(1.0f);
        transfer(boxApple, boxApple2);

        System.out.println("Mass " + boxApple.getWeight());
        System.out.println("Mass " + boxApple2.getWeight());
    }

    private static void transfer(Box b1, Box b2) {
        for (int i = 0; i < b1.list.size(); i++) {
            b2.put(b1.list.get(i));
        }

        Iterator iterator = b1.list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}
