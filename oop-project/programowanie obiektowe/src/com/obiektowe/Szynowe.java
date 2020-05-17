package com.obiektowe;

public class Szynowe extends Pojazd {

    Szynowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    @Override
    public String uruchomSilnik() {
        return "Uruchomiono silnik pojazdu szynowego";
    }
}
