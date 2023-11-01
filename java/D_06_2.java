package domaciZadaci1;

import java.util.Scanner;
public class Zadatak_2 {
    public static void main(String[] args) {

       /*Zadatak 2:
Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1). */

        System.out.println("Unesite broj i izracunajte njegov faktorijel:");
        Scanner input = new Scanner(System.in);
        int broj = input.nextInt();
        int faktorijel = 1;
        for (int i = 0; i < broj; i++) {
            faktorijel = faktorijel * (broj - i);
        }
        System.out.println("Faktorijel broja " + broj + " je: " + faktorijel);
        input.close();
    }
}
