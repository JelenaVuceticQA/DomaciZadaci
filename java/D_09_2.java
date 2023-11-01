package zadaciSreda;


public class zadSreda2 {
    public static int[] zbirNizova(int[] niz1, int[] niz2) {

        int[] rezultat = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            rezultat[i] = niz1[i] + niz2[i];
        }
        return rezultat;
    }

    public static void main(String[] args) {
        int[] niz1 = {10, 2, 3, 4, 2};
        int[] niz2 = {9, 7, 4, 9, 5};

        int[] rezultat = zbirNizova(niz1, niz2);

        for (int i = 0; i < rezultat.length; i++) {
            System.out.print(rezultat[i] + " ");
        }

    }
}