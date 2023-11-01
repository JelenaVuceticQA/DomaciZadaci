package domaciZadaci2;

        import java.util.Scanner;
public class Zadatak02 {
    public static void main(String[] args) {
    /*Zadatak 2:
Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza.*/

        int velicinaNiza = 8;
        int[] niz = new int[velicinaNiza];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Element:");
            niz[i] = input.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            int tekuciElement = niz[i];
            if (tekuciElement % 2 == 0) {
                suma += tekuciElement;
            }
        }
        System.out.println("Suma svih parnih je: " + suma);
        input.close();
    }
}

