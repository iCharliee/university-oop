package com.obiektowe;

public class Golf extends VW {
    Golf(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
    }

    public static void main(String[] args) {
        Golf trzy = new Golf( 2019,"elektryczny","biały",  1.2, "195/70 R15", 4);
        Golf cztery = new Golf(2012,"benzynowy","czerwony", 1.5,"185/70 R16", 5);
        Golf piątka = new Golf(2009,"diesel","niebieski", 1.8, "195/80 R17", 5);
    }
}
