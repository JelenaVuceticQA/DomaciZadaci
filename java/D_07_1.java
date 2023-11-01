package domaciZadaci2;
import java.util.Scanner;

public class Zadatak01 {
    public static void main(String[] args) {

/*Zadatak 1:
Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.*/
        int velicinaNiza = 8;
            int[] niz = new int[velicinaNiza];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < niz.length; i++) {
                System.out.print("Element:");
                niz[i] = input.nextInt();
            }
            for (int i = 0; i < niz.length; i++) {
                int tekuciElement = niz[i];
                if (tekuciElement % 2 != 0) {
                    System.out.println("Neparan element: " + tekuciElement);
                }
            }
            input.close();
        }
    }