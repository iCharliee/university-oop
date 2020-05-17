package com.obiektowe;

public final class Octavia extends Skoda {
    Octavia(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }
    //nie można dziedziczyć po klasie Octavia, ponieważ klasa zawiera słowo final
}
