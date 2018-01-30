package com.company.hw10;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons spring = Seasons.SPRING;
        Seasons summer = Seasons.SUMMER;
        Seasons autumn = Seasons.AUTUMN;
        Seasons winter = Seasons.WINTER;
        System.out.println(summer.name() + ", Средняя температура: " + summer.avTemp);
        summer.iLike(summer);
        System.out.println(spring.getDescription());
        System.out.println(summer.getDescription());
        Seasons[] seasons = new Seasons[]{spring, summer, autumn, winter};
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].name() + ", Средняя температура: " + seasons[i].avTemp + " " +
                    seasons[i].getDescription());
        }
    }
}
