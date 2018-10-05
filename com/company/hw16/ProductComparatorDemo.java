package com.company.hw16;

import java.util.Set;
import java.util.TreeSet;

public class ProductComparatorDemo {
    public static void main(String[] args) {
        Product samsung = new Product("Samsung", 250, 4.3);
        Product apple = new Product("Apple", 400, 4.9);
        Product asus = new Product("Asus", 450, 4.7);
        Product lenovo = new Product("Lenovo", 200, 3.9);

        Product sennheiser = new Product("Sennheiser", 150, 4.9);
        Product akg = new Product("AKG", 120, 4.7);
        Product razer = new Product("Razer", 199, 4.2);

        ProductNameComparator productNameComparator = new ProductNameComparator();

        Set<Product> set1 = new TreeSet<>(productNameComparator);
        set1.add(samsung);
        set1.add(apple);
        set1.add(asus);
        set1.add(lenovo);

        Set<Product> set2 = new TreeSet<>(productNameComparator);
        set2.add(sennheiser);
        set2.add(akg);
        set2.add(razer);

        Category phones = new Category("Phones", set1);
        Category headphones = new Category("headphones", set2);

        phones.printNameSort();
        phones.printPriceSort();
        phones.printRatingSort();

        System.out.println("--------------------------------");

        headphones.printNameSort();
        headphones.printPriceSort();
        headphones.printRatingSort();
    }
}
