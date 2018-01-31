package com.company.hw10;

public class Studio {
    public void clotheAMan(Clothes[] clothes){
        System.out.println("Мужские вещи: ");
        for(int i = 0; i<clothes.length; i++){
            if (clothes[i] instanceof MensClothing){
                System.out.println(clothes[i].getName() + " - Размер: " + clothes[i].size +
                        ", Евро размер " + clothes[i].size.euroSize +
                        ", Цена: " + clothes[i].price + " грн , Цвет: " + clothes[i].color);
            }
        }
    }

    public void clotheAWoman(Clothes[] clothes) {
        System.out.println("Женские вещи: ");
        for(int i = 0; i<clothes.length; i++){
            if (clothes[i] instanceof WomensClothing){
                System.out.println(clothes[i].getName() + " - Размер: " + clothes[i].size +
                        ", Евро размер: " + clothes[i].size.euroSize +
                        ", Цена: " + clothes[i].price + " грн , Цвет: " + clothes[i].color);
            }
        }
    }
}
