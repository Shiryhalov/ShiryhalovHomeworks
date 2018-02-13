package com.company.hw10;

public class InstrumentDemo {
    public static void main(String[] args){
        Instrument guitar = new Guitar(7);
        Instrument drum = new Drum(40);
        Instrument tube = new Tube(20);

        Instrument[] instruments = new Instrument[]{guitar, drum, tube};

        for(Instrument i : instruments){
            i.play();
        }
    }
}
