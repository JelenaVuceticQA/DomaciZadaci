package zadaciSreda;
import java.util.Arrays;

public class zadSreda1 {


    public static boolean proveraJednakostNizova(int[] niz1, int[] niz2) {

        if (niz1.length != niz2.length) {
            return false;
        }
        Arrays.sort(niz1);
        Arrays.sort(niz2);

        return Arrays.equals(niz1, niz2);
    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {1, 2, 3, 4, 5};

        if (proveraJednakostNizova(niz1, niz2)) {
            System.out.println("Nizovi su jednaki.");
        } else {
            System.out.println("Nizovi nisu jednaki.");
        }
    }

}