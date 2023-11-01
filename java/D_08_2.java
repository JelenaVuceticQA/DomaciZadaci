package domaciZadaci3;

import java.util.Scanner;
public class ZadatakDrugi {
    public static void main(String[] args) {

/*Zadatak 2:
Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog
niza. Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan
element, cim naidjemo na zadati element, ispisati poruku da je pronadjen i zavrsiti funkciju
(Cim naidje na taj element, ne treba da ga trazi dalje).*/
        Scanner input = new Scanner(System.in);

        System.out.print("Unesi duzinu niza:");
        int duzinaNiza = input.nextInt();

        System.out.print("Unesi broj koji trazis:");
        int broj = input.nextInt();

        int[] niz = new int[duzinaNiza];

        for(int i = 0; i<niz.length; i++) {
            System.out.print("Element " + (i+1) + ":");
            niz[i] = input.nextInt();
        }
        traziBroj(niz, broj);
        input.close();
    }

    static void traziBroj(int[] niz, int broj) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != broj) {
                System.out.println("Pogresan element!");
            } else {
                System.out.println("Element " + broj + " se nalazi u nizu!");
                break;
            }
        }
    }
}