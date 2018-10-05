package com.company.hw16;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Category {
    private String name;
    private Set<Product> setOfProducts;

    public Category() {
    }

    public Category(String name, Set<Product> setOfProducts) {
        this.name = name;
        this.setOfProducts = setOfProducts;
    }

    public void printNameSort() {
        ProductNameComparator productNameComparator = new ProductNameComparator();
        Set<Product> set = new TreeSet<>(productNameComparator);
        set.addAll(setOfProducts);
        System.out.println("Каталог " + getName() + " с сортировкой по имени");
        for (Product i : set) {
            System.out.println(i);
        }
        System.out.println();
    }

    public void printPriceSort() {
        ProductPriceComparator productPriceComparator = new ProductPriceComparator();
        Set<Product> set = new TreeSet<>(productPriceComparator);
        set.addAll(setOfProducts);
        System.out.println("Каталог " + getName() + " с сортировкой по цене");
        for (Product i : set) {
            System.out.println(i);
        }
        System.out.println();
    }

    public void printRatingSort() {
        ProductRatingComparator productRatingComparator = new ProductRatingComparator();
        Set<Product> set = new TreeSet<>(productRatingComparator);
        set.addAll(setOfProducts);
        System.out.println("Каталог " + getName() + " с сортировкой по рейтингу");
        for (Product i : set) {
            System.out.println(i);
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getSetOfProducts() {
        return setOfProducts;
    }

    public void setSetOfProducts(Set<Product> setOfProducts) {
        this.setOfProducts = setOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(setOfProducts, category.setOfProducts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, setOfProducts);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", setOfProducts=" + setOfProducts +
                '}';
    }
}
