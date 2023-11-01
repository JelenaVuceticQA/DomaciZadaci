package domaciZadaci3;
import java.util.Scanner;

public class ZadatakPrvi {
    public static void main(String[] args) {
/*Zadatak 1:
Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
(Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).*/

    System.out.println("Unesite String: ");
    Scanner input = new Scanner(System.in);

    String tekst = input.nextLine();
    System.out.println("Broj samoglasnika je: " + brojSamoglasnika(tekst));

    input.close();
}

    static int brojSamoglasnika(String tekst) {

        String samoglasnici = "aeiouAEIOU";

        int ukupno = 0;

        for (int i = 0; i < tekst.length(); i++) {
            char slovo = tekst.charAt(i);
            // -1 zato sto nema
            if (samoglasnici.indexOf(slovo) != -1) {
                ukupno += 1;
            }
        }

        return ukupno;
    }
}
