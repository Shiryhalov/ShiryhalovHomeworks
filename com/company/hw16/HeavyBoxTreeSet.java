package com.company.hw16;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeavyBoxTreeSet {
    public static void main(String[] args) {
        HeavyBox box1 = new HeavyBox(10, 10, 10, 10);
        HeavyBox box2 = new HeavyBox(20, 20, 20, 20);
        HeavyBox box3 = new HeavyBox(30, 30, 30, 30);
        SortedSet<HeavyBox> HeavyBoxes = new TreeSet<HeavyBox>();
        HeavyBoxes.add(box1);
        HeavyBoxes.add(box3);
        HeavyBoxes.add(box2);
        for (HeavyBox heavyBox : HeavyBoxes) {
            System.out.println(heavyBox + ";");
        }
    }
}
