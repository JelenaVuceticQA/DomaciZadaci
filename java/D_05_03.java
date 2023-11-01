package domaciZadaci;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

/*3. Zadatak:
Napisati program gde korisnik unosi dva realna broja, zatim unosi naziv operacije koju zeli
da izvrsi nad tim brojevima(sabiranje, oduzimanje, mnozenje, deljenje), zatim istampati
rezultat date operacije. */



        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prvi broj:");

        num1 = scanner.nextDouble();
        System.out.print("Unesite drugi broj:");
        num2 = scanner.nextDouble();

        System.out.print("Unesite neku operaciju (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;


            default:
                System.out.print("Pogresan operator");
                return;
        }

        System.out.println(output);
    }
}