package com.obiektowe;

//zad. 11 Jeśli klasę oznaczymy słowem final, nie będzie można jej rozszerzać, czyli tworzyć jej podklas. Zatem będzie to “ostateczna” wersja danej klasy
public class Gąsienicowe extends Pojazd {
    int moc;

    Gąsienicowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    int pobierzMoc(){
        return moc;
    }

    void ustawMoc(int power){
        moc = power;
    }

    public String uruchomSilnik() {
        return super.uruchomSilnik() + "Jest to pojazd gąsienicowy";
    }
}
