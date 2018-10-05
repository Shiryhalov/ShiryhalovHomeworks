package com.company.hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeavyBoxCollections {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(1, 8, 3, 4));
        heavyBoxes.add(new HeavyBox(2, 2, 7, 3));
        heavyBoxes.add(new HeavyBox(3, 1, 6, 4));
        heavyBoxes.add(new HeavyBox(40, 2, 3, 7));
        HeavyBox heavyBox = new HeavyBox(13, 13, 13, 13);
        heavyBoxes.add(heavyBox);
        System.out.println("Размер коллекции " + heavyBoxes.size());
        enumerateCollection(heavyBoxes);
        System.out.println();
        changeCollection(heavyBoxes);
        enumerateCollection(heavyBoxes);
        heavyBoxes.remove(heavyBoxes.size() - 1);
        System.out.println();
        System.out.println("Размер коллекции после удаления " + heavyBoxes.size());
        enumerateCollection(heavyBoxes);
        System.out.println();
        System.out.println("Три способа получения массива: ");
        receiveArray1(heavyBoxes);
        receiveArray2(heavyBoxes);
        receiveArray3(heavyBoxes);
        heavyBoxes.clear();
        System.out.println();
        System.out.println("Размер коллекции после clear " + heavyBoxes.size());
    }

    private static void receiveArray3(List<HeavyBox> heavyBoxes) {
        HeavyBox[] stringArray2 = heavyBoxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(stringArray2));
    }

    private static void receiveArray2(List<HeavyBox> heavyBoxes) {
        HeavyBox[] stringArray1 = new HeavyBox[heavyBoxes.size()];
        heavyBoxes.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));
    }

    private static void receiveArray1(List<HeavyBox> heavyBoxes) {
        Object[] objectArray = heavyBoxes.toArray();
        System.out.println(Arrays.toString(objectArray));
    }

    private static void changeCollection(List<HeavyBox> heavyBoxes) {
        HeavyBox box = heavyBoxes.get(0);
        box.setWeight(box.getWeight() + 1);
        heavyBoxes.set(0, box);
    }

    private static void enumerateCollection(List<HeavyBox> heavyBoxes) {
        int counter;
        counter = 1;
        for (HeavyBox i : heavyBoxes) {
            System.out.println("Элемент " + counter + ": " + i);
            counter++;
        }
    }
}
