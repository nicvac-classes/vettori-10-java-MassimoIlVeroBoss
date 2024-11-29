import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Da quanti studenti è formata la classe?");
        int n = scanner.nextInt();
        String[] nomi = new String[n];
        int[] crediti = new int[n];
        double[] valutazioni = new double[n];

        int somma = 0;
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Inserire nome del " + (i + 1) + "° studente");
            nomi[i] = scanner.next();
            System.out.println("Inserire crediti del " + (i + 1) + "° studente");
            crediti[i] = scanner.nextInt();
            System.out.println("Inserire valutazioni del " + (i + 1) + "° studente");
            valutazioni[i] = scanner.nextDouble();
            somma += (int) valutazioni[i];
        }

        double media = (double) somma / n;
        for (int i = 0; i <= n - 1; i++) {
            if (valutazioni[i] > media && crediti[i] >= 6) {
                System.out.println("Lo studente: " + nomi[i] + " ha superato l'anno");
            }
        }

    }
}
