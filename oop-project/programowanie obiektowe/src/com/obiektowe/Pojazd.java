package com.obiektowe;

import java.awt.*;
//zad. 12,13,14 jeśli zamienimy słowo public z klasy pojazd na private albo protected, kod wysypie nam błędy; jeśli nie będzie miała modyfikatora dostępu w ogóle, program i tak zadziała
public class Pojazd {
    int rokProdukcji;
    String rodzajSilnika;
    String kolor;
    double masa;

     Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
     }

    int pobierzRokProdukcji() {
        return rokProdukcji;
    }

    String pobierzRodzajSilnika() {
        return rodzajSilnika;
    }

    String pobierzKolor(){
        return kolor;
    }

    double pobierzMase(){
        return masa;
    }

    void ustawRokProdukcji(int rok){
        rokProdukcji = rok;
    }

    void ustawRodzajSilnika(String silnik){
        rodzajSilnika = silnik;
    }

    void ustawKolor(String kolorek){
        kolor = kolorek;
    }

    void ustawMase(double ileTon){
        masa = ileTon;
    }

    public String uruchomSilnik() {
        return "Silnik uruchomiono";
    }

    public String wylaczSilnik() {
        return "Silnik wyłączono";
    }


    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd(1999, "zielony", "zielony", 5.0);
    }
}
