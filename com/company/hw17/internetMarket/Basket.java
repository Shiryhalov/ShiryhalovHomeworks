package com.company.hw17.internetMarket;

import java.util.*;

public class Basket {
    private Set<Product> productSet;

    public Basket(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public Basket() {
    }

    public void createBasket() {
        Set<Product> productSet = new HashSet<>();
        this.productSet = productSet;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public boolean findProduct(String name, Category category) {
        Set<Product> productSet = category.getSetOfProducts();
        for (Product i : productSet) {
            if (name.equals(i.getName())) {
                this.productSet.add(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(productSet, basket.productSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productSet);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "productSet=" + productSet +
                '}';
    }
}
