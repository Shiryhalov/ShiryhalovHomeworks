package com.company.hw16;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnionIntersectSet {
    public static void main(String[] args) {
        SortedSet<HeavyBox> boxes1 = new TreeSet<>();
        SortedSet<HeavyBox> boxes2 = new TreeSet<>();
        SortedSet<HeavyBox> boxes3 = new TreeSet<>();

        boxes1.add(new HeavyBox(10, 10, 10, 10));
        boxes1.add(new HeavyBox(20, 20, 20, 20));
        boxes1.add(new HeavyBox(30, 30, 30, 30));

        boxes2.add(new HeavyBox(10, 10, 10, 10));
        boxes2.add(new HeavyBox(40, 50, 60, 70));
        boxes2.add(new HeavyBox(50, 50, 50, 50));

        boxes3.add(new HeavyBox(20, 20, 20, 20));
        boxes3.add(new HeavyBox(40, 50, 60, 70));
        boxes3.add(new HeavyBox(13, 13, 13, 13));

        union(boxes1, boxes2, boxes3).forEach(System.out::println);
        System.out.println();
        intersect(boxes2, boxes3).forEach(System.out::println);
        System.out.println();
        intersect(boxes1, boxes2).forEach(System.out::println);
    }

    private static Set<?> union(Set<?>... sets) {
        SortedSet<?> result = new TreeSet<>();
        for (Set<?> set : sets) {
            result.addAll((Collection) set);
        }
        return result;
    }

    private static Set<?> intersect(Set<?>... sets) {
        SortedSet<?> result = (TreeSet) sets[1];
        for (Set<?> set : sets) {
            result.retainAll(set);
        }
        return result;
    }
}
