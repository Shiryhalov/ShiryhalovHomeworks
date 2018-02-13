package com.company.hw10;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons spring = Seasons.SPRING;
        Seasons summer = Seasons.SUMMER;
        Seasons autumn = Seasons.AUTUMN;
        Seasons winter = Seasons.WINTER;
        System.out.println(summer.name() + ", Средняя температура: " + summer.getAvTemp());
        summer.iLike(summer);
        System.out.println(spring.getDescription());
        System.out.println(summer.getDescription());
        Seasons[] seasons = new Seasons[]{spring, summer, autumn, winter};
        for (Seasons i : seasons) {
            System.out.println(i.name() + ", Средняя температура: " + i.getAvTemp() + " " +
                    i.getDescription());
        }
    }
}
