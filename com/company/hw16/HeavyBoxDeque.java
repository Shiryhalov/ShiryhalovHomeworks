package com.company.hw16;

import java.util.*;

public class HeavyBoxDeque {
    public static void main(String[] args) {
        Queue<HeavyBox> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(new HeavyBox(10, 10, 10, 30));
        heavyBoxes.offer(new HeavyBox(10, 10, 10, 20));
        heavyBoxes.offer(new HeavyBox(10, 10, 10, 10));
        heavyBoxes.offer(new HeavyBox(10, 10, 10, 40));
        for (HeavyBox i : heavyBoxes) {
            System.out.println(i);
        }
        for (HeavyBox i : heavyBoxes) {
            heavyBoxes.poll();
        }
        for (HeavyBox i : heavyBoxes) {
            System.out.println(i);
        }
        System.out.println();

        /*
        Задание 8
         */

        Collection<HeavyBox> heavyBoxes1 = new ArrayList<>();
        heavyBoxes1.add(new HeavyBox(10, 10, 10, 10));
        heavyBoxes1.add(new HeavyBox(10, 10, 10, 20));
        heavyBoxes1.add(new HeavyBox(10, 10, 10, 301));
        heavyBoxes1.add(new HeavyBox(10, 10, 10, 299));
        heavyBoxes1.add(new HeavyBox(10, 10, 10, 1100));
        Collection<HeavyBox> heavyBoxes2 = new ArrayList<>();
        changeIfBig(heavyBoxes1, heavyBoxes2);
        System.out.println("Коллекция, в которой < 300");
        for (HeavyBox i : heavyBoxes1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Коллекция, в которой > 300");
        for (HeavyBox i : heavyBoxes2) {
            System.out.println(i);
        }
    }

    private static void changeIfBig(Collection<HeavyBox> collection,
                                                    Collection<HeavyBox> anotherCollection) {
        Iterator<HeavyBox> iterator = collection.iterator();
        while (iterator.hasNext()) {
            HeavyBox heavyBox = iterator.next();
            if (heavyBox.getWeight() > 300){
                anotherCollection.add(heavyBox);
                iterator.remove();
            }
        }
    }
}
