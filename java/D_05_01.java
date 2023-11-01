package domaciZadaci;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

    /* 1. Zadatak:
        Napisati program gde korisnik unosi svoj broj godina. Ukoliko ima 18 ili vise godina, ispisati
        poruku da korisnik sme da konzumira alkohol, u suprotnom ispisati neku drugu poruku.*/


        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj godina:");
        age = sc.nextInt();
        if (age >= 18)
            System.out.println("Korisnik sme da konzumira alkohol");
        else
            System.out.println("Korisnik ne sme da konzumira alkohol");
    }
}