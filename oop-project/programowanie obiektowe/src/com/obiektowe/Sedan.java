package com.obiektowe;

public class Sedan extends Osobowy {
    String model;
    String symbol;

    Sedan(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }
}
