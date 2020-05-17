package com.obiektowe;

public class Osobowy extends Kolowe {
    int ilośćOsób;

    Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    int pobierzIlośćOsób(){
        return ilośćOsób;
    }
    void ustawIlośćOsób(int ilosc){
        ilośćOsób = ilosc;
    }
}

