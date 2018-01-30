package com.company.hw10;

public class ClothesDemo {
    public static void main(String[] args){
        Clothes tshirt = new Tshirt(Sizes.XXS, 250.5, "красная");
        Clothes pants = new Pants(Sizes.M, 440.0, "черные");
        Clothes skirt = new Skirt(Sizes.S, 349.99, "бежевая");
        Clothes tie = new Tie(Sizes.L, 50.8, "разноцветный");
        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
        Studio studio = new Studio();
        studio.clotheAMan(clothes);
        System.out.println();
        studio.clotheAWoman(clothes);
    }
}
