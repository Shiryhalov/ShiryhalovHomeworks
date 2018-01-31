package com.company.hw10;

public enum Seasons {
    WINTER(-15.1),
    SPRING(15.3),
    SUMMER(24.7) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(18.1);
    public double avTemp;

    Seasons(double avTemp) {
        this.avTemp = avTemp;
    }

    Seasons() {
    }

    public double getAvTemp() {
        return avTemp;
    }

    public void setAvTemp(double avTemp) {
        this.avTemp = avTemp;
    }

    public void iLike(Seasons seasons) {
        switch (seasons) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            default:
                System.out.println("Время года не выбрано.");
        }
    }

    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "Season{" +
                "avTemp=" + avTemp +
                '}';
    }
}
