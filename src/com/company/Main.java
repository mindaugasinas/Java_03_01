package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int a = sc.nextInt();

        if (a%2 == 0){
            System.out.println("Ivestas skaicius yra lyginis");
        }

        else
        {
            System.out.println("Ivestas skaicius yra nelyginis");
        }
    }
}
