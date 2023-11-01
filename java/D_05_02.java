package domaciZadaci;
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;
public class Zadatak2 {

    public static void main(String[] args) {
/*2. Zadatak:
Napisati program gde korisnik unosi ceo broj, ukoliko je broj paran, promeniti ga u neparan i
istampati, ukoliko je neparan, samo ispisati poruku da je u pitanju neparan broj.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ukucaj broj:");
        int number=scanner.nextInt();
        if (number%2==0){
            System.out.println("Neparan:"+(number+1));

    }

    else {
            System.out.println("Neparan:"+number);
        }
        scanner.close();
}
}