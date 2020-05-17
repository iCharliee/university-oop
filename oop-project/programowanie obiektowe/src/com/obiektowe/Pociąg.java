package com.obiektowe;

public class Pociąg extends Szynowe {
    private static String właściciel = "P.K.P";

    Pociąg(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }
}
