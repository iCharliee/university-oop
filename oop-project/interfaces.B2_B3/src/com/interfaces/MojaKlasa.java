package com.interfaces;

public class MojaKlasa implements PierwszyInterfejs, DrugiInterfejs {
    public void draw() {
        System.out.println("MojaKlasa");
    }

    public static void main(String[] args) {
        PierwszyInterfejs.f(4);
        DrugiInterfejs.f(4.4);
    }

}
