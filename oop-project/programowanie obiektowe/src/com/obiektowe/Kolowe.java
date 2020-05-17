package com.obiektowe;

public class Kolowe extends Pojazd {
    String rozmiarOpony;

    Kolowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    String getOpona(){
        return rozmiarOpony;
    }

    void ustawOpone(String opona){
        rozmiarOpony = opona;
    }

    public String uruchomSilnik(String rodzajSilnika) {
        return "Uruchomiono silnik" + rodzajSilnika;
    }

    public static void main(String[] args) {

    }
}
