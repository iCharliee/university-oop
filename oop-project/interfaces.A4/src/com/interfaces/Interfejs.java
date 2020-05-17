package com.interfaces;

import org.w3c.dom.ls.LSOutput;

public interface Interfejs {
    int lorak = 1;
    double lorak2 = 1.2;
}

class Auto implements Interfejs {

}

class Zderzak extends Auto {
    public static void main(String[] args) {
        System.out.println(lorak);
        System.out.println(lorak2);
    }
}