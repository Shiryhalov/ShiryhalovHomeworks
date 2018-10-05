package com.company.hw16;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, HeavyBox> heavyBoxes = new TreeMap<>();
        heavyBoxes.put(1, new HeavyBox(10, 10, 10, 301));
        heavyBoxes.put(2, new HeavyBox(10, 10, 10, 201));
        heavyBoxes.put(3, new HeavyBox(10, 10, 10, 101));
        heavyBoxes.put(4, new HeavyBox(10, 10, 10, 401));
        Set<Map.Entry<Integer, HeavyBox>> set = takeBig(heavyBoxes).entrySet();
        for (Map.Entry<Integer, HeavyBox> me : set) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }

    private static Map<Integer, HeavyBox> takeBig(Map<Integer, HeavyBox> boxes) {
        Set<Map.Entry<Integer, HeavyBox>> set = boxes.entrySet();
        Map<Integer, HeavyBox> heavyBoxMap = new TreeMap<>();
        for (Map.Entry<Integer, HeavyBox> i : set) {
            if (i.getValue().getWeight() > 300) {
                heavyBoxMap.put(i.getKey(), i.getValue());
            }
        }
        return heavyBoxMap;
    }
}
