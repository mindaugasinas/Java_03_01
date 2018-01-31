package com.company;

import Uzdaviniai.LyginisNelyginis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int a = sc.nextInt();

        LyginisNelyginis objektas = new LyginisNelyginis();

        objektas.setA(a);

        System.out.println("Ivestas skaicius " + objektas.getA());

        objektas.skaiciuok();
    }
}
