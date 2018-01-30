package com.company.hw10;

import java.util.Objects;

public class Tube implements Instrument {
    protected int diam;

    public void play(){
        System.out.println("Играет труба с диаметром " + diam);
    }

    public Tube(int diam) {
        this.diam = diam;
    }

    public Tube() {
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tube tube = (Tube) o;
        return diam == tube.diam;
    }

    @Override
    public int hashCode() {

        return Objects.hash(diam);
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diam=" + diam +
                '}';
    }
}
