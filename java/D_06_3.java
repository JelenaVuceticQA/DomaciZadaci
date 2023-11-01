package domaciZadaci1;

import java.util.Scanner;
public class Zadatak_3 {

    /*Zadatak 3:
Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."), cim se unese
tacka program se zavrsava i vraca prethodno unete tekstove.*/
    public static void main(String[] args) {
        System.out.println("Unesite tekst dve dok se ne unese tacka ('.'):");
        Scanner input = new Scanner(System.in);

        String ispis = "";

        while(true) {
            String tekst = input.nextLine();
            if (tekst.equals(".")) {
                break;
            } else {
                ispis = ispis + tekst + " ";
            }
        }

        System.out.println(ispis);

        input.close();
    }
}
