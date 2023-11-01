package zadaciSreda;


public class zadSreda3 {
    public static int brojDuplikata(String[] imena) {
        int brojDuplikata = 0;

        // Prolazimo kroz svako ime u nizu
        for (int i = 0; i < imena.length - 1; i++) {
            for (int j = i + 1; j < imena.length; j++) {
                if (imena[i].equals(imena[j])) {
                    brojDuplikata++;
                    break;
                }
            }
        }

        return brojDuplikata;
    }

    public static void main(String[] args) {
        String[] imena = {"Ana", "Marko", "Petar", "Ana", "Jelena", "Petar", "Milan"};

        int brojDuplikata = brojDuplikata(imena);

        System.out.println("Broj duplikata imena: " + brojDuplikata);
    }

}

