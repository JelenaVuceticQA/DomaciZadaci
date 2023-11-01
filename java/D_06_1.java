package domaciZadaci1;

import java.util.Scanner;

public class Zadatak_1 {
    public static void main(String[] args) {

    /*Zadatak 1:
Napraviti program gde cete uneti neki broj ponavljanja i tekst koji ce se toliko puta ispisati.*/

    System.out.println("Upisite broj ponavljanja:");

    Scanner input = new Scanner(System.in);

    String brojPonavljanja = input.nextLine();
    System.out.print("Unesite tekst:");
    String tekst = input.nextLine();
    for (int i = 0; i < Integer.parseInt(brojPonavljanja); i++) {

        System.out.println(tekst);
    }

        input.close();


    }
}

