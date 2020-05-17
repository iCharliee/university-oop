package com.obiektowe;

public class Ciężarówka extends Kolowe {
    int udzwig;

    Ciężarówka(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
    }

    int pobierzUdzwig(){
        return udzwig;
    }

    void ustawUdzwig(int kg){
        udzwig = kg;
    }

    public int podniesSkrzynie(int wagaSkrzyni){
        if(wagaSkrzyni < udzwig){
            System.out.println("Skrzynia podniesiona");
            return 1;
        } else {
            System.out.println("Skrzynia jest za ciężka, żeby ją podnieść");
            return 0;
        }
    }
}
