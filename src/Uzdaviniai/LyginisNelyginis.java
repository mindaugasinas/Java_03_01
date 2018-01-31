package Uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {
    public LyginisNelyginis(){

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
